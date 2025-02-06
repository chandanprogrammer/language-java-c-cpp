package modules;
import java.sql.*;
import java.util.*;

public class DatabaseConnection {

    public static String url = "jdbc:sqlserver://Chandan\\SQLEXPRESS;databaseName=TollReceiptDB;integratedSecurity=true;encrypt=false;";
    public static String user = "sa";
    public static String password = "8002";

    // ------------- Get data from database function--------------

    public static ArrayList<HashMap<String, Object>> getVehicleNameRateFromDB(String query){

        ArrayList<HashMap<String, Object>> vehicleRateData = new ArrayList<>();
        try{
            Connection connection = DriverManager.getConnection(url);
            // Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("🎉🎉 Database connected......");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                HashMap<String, Object> row = new HashMap<>();
                row.put("vehicleID", resultSet.getInt("VEHICLEID"));
                row.put("vehicleName", resultSet.getString("VEHICLENAME"));
                row.put("tollRate", resultSet.getInt("TOLLRATE"));
                row.put("isVisible", resultSet.getBoolean("ISVISIBLE"));
                vehicleRateData.add(row);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch(SQLException e){
            System.out.println("❌ Error! Not connected database ...");
            return null;
        }
        return vehicleRateData;
    }

    // ---------- Insert Data in database function -------------

    public static int insertDataInDB(String vehicleName, int tollRate, String vehicleNum, String currentTime) {
        String query = "INSERT INTO RECEPT_DATA (USERCODE, TRANSID, LANEPATH, VEHICLETYPE, PAYMODE, TOLLFARE, PENALITY, TOTALFARE, VEHREGNO, DATETIMES) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        String userCode = "b001";
        String transitionID = "";
        String lanPath = "LANE-01";
        String paymentMode = "CASH";

        String[] dateParts = currentTime.split("[ :\\-]");
        for(int i=0; i<dateParts.length; i++){
            transitionID = transitionID.concat(dateParts[i]);
        }

        // --------- Generate 20 digit unique transition ID -----------
        long randomNum = (long) Math.floor(Math.random() * 1000000);
        String formattedString = String.format("%06d", randomNum);
        transitionID = transitionID.concat(formattedString);
        // System.out.println(transitionID);

        // ---------- User code change according to shift --------


        try{
            Connection connection = DriverManager.getConnection(url);
            System.out.println("🎉🎉 Database connected...... ");

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Set values dynamically
            preparedStatement.setString(1, userCode);
            preparedStatement.setString(2, transitionID);
            preparedStatement.setString(3, lanPath);
            preparedStatement.setString(4, vehicleName);
            preparedStatement.setString(5, paymentMode);
            preparedStatement.setInt(6, tollRate / 2);  // Half toll rate
            preparedStatement.setInt(7, tollRate/2);
            preparedStatement.setInt(8, tollRate);
            preparedStatement.setString(9, vehicleNum);
            preparedStatement.setString(10, currentTime);
            // Execute the query
            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("✔️ Data inserted successfully.... ");
                GenerateReceipt.printReceipt(userCode, transitionID, lanPath, vehicleName, paymentMode, tollRate, vehicleNum, currentTime);
            }
            connection.close();
            preparedStatement.close();
            return rowsInserted;
        } catch (SQLException e) {
            System.out.println("❌ Error while inserting data..... ");
            e.printStackTrace();
        }
        return 0; // Return 0 if an exception occurred
    }
}