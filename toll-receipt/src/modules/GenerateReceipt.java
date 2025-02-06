package modules;
import javax.swing.*;
import javax.print.*;


public class  GenerateReceipt {
    public static void printReceipt(String userCode, String transitionID, String lanPath, String vehicleName, String paymentMode, int tollRate, String vehicleNum, String currentTime){
        System.out.println("Receipt Generated....");
    }
//    public static String generateReceipt(String vehicleName, int tax, String vehicleNum) {
//        return "\t\tNational Highways Authority\n Of India\n" +
//                "\t --------------------------------\n"+
//                "Toll Plaza \t: TOLL PLAZA\n" +
//                "User Code \t: b001\n" +
//                "Vehicle Type\t: " + vehicleName + "\n" +
//                "Payment Mode\t: CASH\n" +
//                "Toll Fare\t: "+ tax + "\n" +
//                "Vehicle Number\t: " + vehicleNum + "\n";
//    }


    public static void printer() {
        try {
            // Identify the thermal printer (use your printer's name or port)
            PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
            PrintService thermalPrinter = null;

            for (PrintService printer : printServices) {
                if (printer.getName().contains("Thermal")) { // Change this to match your printer name
                    thermalPrinter = printer;
                    break;
                }
            }

            if (thermalPrinter == null) {
                System.out.println("Thermal Printer not found!");
                return;
            }

            // Create a PrintJob and set the print content
            DocPrintJob printJob = thermalPrinter.createPrintJob();

            // Create the print content (a simple text string to print)
            String receiptText = "Thermal Printer Test\n====================\nProduct: Item A\nPrice: $10\nThank you!";

            byte[] printData = receiptText.getBytes("UTF-8"); // Convert text to byte array

            // Create a Doc object and set the content
            Doc doc = new SimpleDoc(printData, DocFlavor.BYTE_ARRAY.AUTOSENSE, null);

            // Send the print job to the printer
            printJob.print(doc, null);

            System.out.println("Receipt Printed Successfully!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}







