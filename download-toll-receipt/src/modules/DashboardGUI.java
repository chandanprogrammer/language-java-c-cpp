package modules;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

public class DashboardGUI extends JFrame {
    public static final String URL = "jdbc:sqlserver://Chandan\\SQLEXPRESS;databaseName=TollReceiptDB;integratedSecurity=true;encrypt=false;";
    public static final String USER = "sa";
    public static final String PASSWORD = "8002";

    public JTable dataTable;
    public DefaultTableModel tableModel;

    public DashboardGUI() {
        // -------- Frame Setup and Title ----------
        setTitle("Toll Receipt Dashboard");
        JLabel headTitle = new JLabel("Data show here..");
        headTitle.setBounds(650, 1, 500, 30);
        headTitle.setFont(new Font("Arial", Font.BOLD, 16));
        add(headTitle);
//        setLayout(new BorderLayout(120, 20)); // Add margins

        // Button panel at the top
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.LIGHT_GRAY);
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
//        leftPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Create the Box to center components vertically and horizontally
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(Box.createVerticalGlue()); // Push components to center vertically

        JButton fetchButton = new JButton("Fetch Data");
        fetchButton.setFont(new Font("Arial", Font.BOLD, 14));
        fetchButton.setAlignmentY(Component.CENTER_ALIGNMENT);
//        leftPanel.add(fetchButton);
        verticalBox.add(fetchButton);
        verticalBox.add(Box.createVerticalStrut(20)); // Space between buttons

        JButton exportButton = new JButton("Export to PDF");
        exportButton.setFont(new Font("Arial", Font.BOLD, 14));
        exportButton.setAlignmentY(Component.CENTER_ALIGNMENT);
//        leftPanel.add(exportButton);
        verticalBox.add(exportButton);

        verticalBox.add(Box.createVerticalGlue()); // Push components to center vertically

        verticalBox.add(Box.createVerticalGlue()); // Push components to center vertically

// Add the Box to the leftPanel
        leftPanel.add(verticalBox);

//        add(leftPanel, BorderLayout.WEST);

        // Button actions
        fetchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fetchAndDisplayData("SELECT * FROM RECEPT_DATA");
            }
        });

        exportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exportDataToPDF();
            }
        });

        // --------- Table setup ----------
        tableModel = new DefaultTableModel();
        dataTable = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(dataTable);

        // Set padding inside the table
        dataTable.setRowHeight(30); // Increase row height for more space
        dataTable.setFont(new Font("Arial", Font.PLAIN, 13)); // Set font size to 16px

        add(tableScrollPane, BorderLayout.LINE_END);

        // Split pane to divide the frame into left and right sections
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, tableScrollPane);
        splitPane.setDividerLocation(0.2); // 20% for the left panel
        splitPane.setResizeWeight(0.2); // Keep the ratio when resizing
        splitPane.setBorder(BorderFactory.createEmptyBorder(30, 10, 10, 10));

        add(splitPane, BorderLayout.CENTER);


        // ------- Frame related settings ---------
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        setSize(screenSize.width - 300, screenSize.height - 150);
        setLocation(150, 60);
        setVisible(true);
    }

    // -------- Click on Fetch data then these function execute --------
    private void fetchAndDisplayData(String query) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("🎉🎉 Database connected......");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // Get metadata for column names
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Clear existing table model
            tableModel.setRowCount(0);
            tableModel.setColumnCount(0);

            // Add column names to the table
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(metaData.getColumnName(i));
            }

            // Add rows to the table
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    row[i] = resultSet.getObject(i + 1);
                }
                tableModel.addRow(row);
            }

            // System.out.println("✅ Data fetched and displayed!");

        } catch (SQLException e) {
            System.out.println("❌ Error connecting to the database.");
            JOptionPane.showMessageDialog(
                    this,
                    "Error fetching data: " +
                            e.getMessage(),
                    "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void exportDataToPDF() {
        // Open a file chooser to select save location
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save PDF");
        fileChooser.setSelectedFile(new File("TableData.pdf")); // Default file type is PDF

        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();

            try {
                // Initialize the document
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(filePath));
                document.open();

                // -------- Create a documents ----------
                // Add title to the document
                document.add(new Paragraph("Table Data"));
                document.add(new Paragraph("------------------------------------------------"));

                // Create the table
                PdfPTable pdfTable = new PdfPTable(tableModel.getColumnCount());

                // Adding column headers to the table
                for (int i = 0; i < tableModel.getColumnCount(); i++) {
                    pdfTable.addCell(tableModel.getColumnName(i));
                }

                // Adding row data to the table
                for (int i = 0; i < tableModel.getRowCount(); i++) {
                    for (int j = 0; j < tableModel.getColumnCount(); j++) {
                        pdfTable.addCell(tableModel.getValueAt(i, j).toString());
                    }
                }

                // Adding the table to the document
                document.add(pdfTable);
                document.close();

                JOptionPane.showMessageDialog(
                        this,
                        "PDF Exported Successfully!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        this,
                        "Error exporting to PDF: " +
                                e.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
