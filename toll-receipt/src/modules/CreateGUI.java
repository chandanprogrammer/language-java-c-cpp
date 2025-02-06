package modules;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CreateGUI extends JFrame{

    JTextField fareAmount, vehicleNumber;

    public CreateGUI(){
        setTitle("Toll Tax Receipt Generator [LANE-01]");

        // ---------- Send query and get all data from database ----------
        ArrayList<HashMap<String, Object>> vehicleRateData = DatabaseConnection.getVehicleNameRateFromDB("SELECT * FROM VEHICLE_NAME_RATE");
        if(vehicleRateData == null){
            JOptionPane.showMessageDialog(
                    null,
                    "<html><body style='font-family:Arial; font-size:10px;'> Try Again! Not connect to the server.</body></html>",
                    "Server Error Message :",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        int sizeOfData = vehicleRateData.size();

        String[] vehiclesName= new String[sizeOfData+1];
        int[] tollRates= new int[sizeOfData+1];
        vehiclesName[0] = "Select";
        tollRates[0] = 0;
        int i=1;
        for (Map<String, Object> vehicle : vehicleRateData) {
                vehiclesName[i] = (String) vehicle.get("vehicleName");
                tollRates[i] = (int) vehicle.get("tollRate");
                i++;
        }

        // ------------ Dropdown List show ------------
        JComboBox<String> vehiclesNameList=new JComboBox<>(vehiclesName);
        vehiclesNameList.setBounds(20, 10,180,30);
        add(vehiclesNameList);
        vehiclesNameList.setSelectedItem("Select");
        vehiclesNameList.setCursor(new Cursor(Cursor.HAND_CURSOR));
        vehiclesNameList.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus)
            {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                label.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15)); // Add padding inside the List content
                return label;
            }
        });
        vehiclesNameList.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String selectedItem = (String) e.getItem();
                for (Map<String, Object> vehicle : vehicleRateData) {
                    if(vehicle.get("vehicleName").equals(selectedItem)){
                        vehiclesNameList.setSelectedItem(selectedItem);
                        fareAmount.setText(vehicle.get("tollRate").toString());
                    }
                }
            }
        });

        // ------------ Text Field for Tax Amount ------------
        fareAmount = new JTextField();
        fareAmount.setBounds(220,10, 80,30);
        add(fareAmount);
        fareAmount.setFont(new Font("Arial", Font.PLAIN, 15));
        fareAmount.setEditable(false);
        fareAmount.setText("0");
        fareAmount.setCursor(new Cursor(Cursor.SW_RESIZE_CURSOR));
        fareAmount.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK, 1), // Thicker border
                BorderFactory.createEmptyBorder(5, 10, 5, 10)  // Padding
        ));

        // ------------ Text Field for Vehicle Number ------------
        vehicleNumber = new JTextField();
        vehicleNumber.setBounds(320,10, 170,30);
        add(vehicleNumber);
        vehicleNumber.setFont(new Font("Arial", Font.PLAIN, 15));
        vehicleNumber.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK, 1),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        vehicleNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String tempVehicleNum = vehicleNumber.getText();
                if(tempVehicleNum.length() > 10){
                    tempVehicleNum = tempVehicleNum.substring(0, 10);
                    vehicleNumber.setText(tempVehicleNum);
                }
                else{
                    vehicleNumber.setText(tempVehicleNum.toUpperCase());
                }
            }
        });

        // ------------ Print Button ------------
        JButton printButton=new JButton("Print");
        printButton.setBounds(510,10,100,30);
        add(printButton);
        printButton.setFont(new Font("Arial", Font.PLAIN, 15));
        printButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // ----------- When submit then action performed -------------
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String vehicleName = vehiclesNameList.getSelectedItem().toString();
                int fareCost = Integer.parseInt(fareAmount.getText());
                String vehicleNum = vehicleNumber.getText();

                if(vehicleName.equals("Select")){
                    JOptionPane.showMessageDialog(
                            null,
                            "<html><body style='font-family:Arial; font-size:10px;'> Please select vehicle type.  </body></html>",
                            "Error Message :",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                if(vehicleNum.length()<4){
                    JOptionPane.showMessageDialog(
                            null,
                            "<html><body style='font-family:Arial; font-size:10px;'> Minimum vehicle number 4 character.  </body></html>",
                            "Error Message :",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter currTD = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String formattedDateTime = currentDateTime.format(currTD);

                // ------------ Send data to the database ------------
                int response = DatabaseConnection.insertDataInDB
                        (vehicleName, fareCost, vehicleNum, formattedDateTime);

                // ---------- If data save successfully in database then -----------
                if(response == 1){
                    vehiclesNameList.setSelectedItem("Select");
                    fareAmount.setText("");
                    vehicleNumber.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(
                            null,
                            "<html><body style='font-family:Arial; font-size:10px;'> Something Wrong! Try again </body></html>",
                            "Error Message :",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // ---------- Frame related setting ------------
        setAlwaysOnTop(true);
        setResizable(false);
        setLocation(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650, 90);
        setLayout(null);
        setVisible(true);
    }
}
