import modules.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        if (Auth.authAccess() == 1) {
            // ------ display frame for receipt generate -------
            CreateGUI ref = new CreateGUI();
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "<html><body style='font-family:Arial; font-size:10px;'> Token expired! Contact software provider. </body></html>",
                    "Error Message :",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}






// -------------- Useful resource link -------------
// jdbc jar download, upload on external libraries
// https://learn.microsoft.com/en-us/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server?view=sql-server-ver16#download
// setup sql server
// setup connect jdbc and java --->  https://www.youtube.com/watch?v=5n37c3VbOWg&t=753s