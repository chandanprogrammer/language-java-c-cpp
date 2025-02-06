package modules;
import java.sql.*;
import java.time.LocalDate;

public class Auth {


    public static int authAccess(){
        String tokenKey = ""; // T822@b58856vZ47m0745q6709k48H3481X76
        try{
            Connection connection = DriverManager.getConnection(DatabaseConnection.url);
            // Connection connection = DriverManager.getConnection(DatabaseConnection.url, DatabaseConnection.user, DatabaseConnection.password);
            System.out.println("🎉🎉 Database connected for Auth......");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CONFIG;");
            if(resultSet.next()){
                tokenKey = resultSet.getString("TOKENKEY");
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch(SQLException e){
            System.out.println("Error");
        }

        String day = "" + tokenKey.charAt(2) + tokenKey.charAt(8);
        String month = "" +  tokenKey.charAt(16) + tokenKey.charAt(32);
        String year = "20" + tokenKey.charAt(3) + tokenKey.charAt(6);
        // System.out.println(day + "-" + month + "-" + year);

        // ******* validate software access by checking expiration date *******
        LocalDate currentDate = LocalDate.now();
        String[] dateParts = currentDate.toString().split("-");

        if (Integer.parseInt(dateParts[0]) <= Integer.parseInt(year) &&
                Integer.parseInt(dateParts[1]) <= Integer.parseInt(month) &&
                Integer.parseInt(dateParts[2]) <= Integer.parseInt(day)) {
            return 1;
        }
        return 0;
    }
}
