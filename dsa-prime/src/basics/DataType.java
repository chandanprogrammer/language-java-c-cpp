package basics;

public class DataType {
    public static void main(String[] args) {

        // 8 primitive data type .....

        short classRollNo = 201; // 2-byte size (Store --> -32768 to 32767)
        boolean isValidRoll = true; // 1-byte size (Store --> true or false)
        byte physicsMarks = 76; // 1-byte size (Store --> -128 to 127)
        byte chemistryMarks = 88;
        byte mathMarks = 96;
        int Total = physicsMarks + chemistryMarks + mathMarks; // 4-byte size
        float averageTotal = (float) Total / 3; // 4-byte size
        long longValue = 123456789; // 8-byte size
        double doubleValue = 12.98763455; // 8-byte size
        char letter = 'A'; // 2-byte size

        System.out.println(averageTotal);

        // Data types Explicit Conversion --> It is done manually by the programmer.
        // If we do not perform casting then the compiler reports a compile-time error
        // (possible lossy conversion)

        int age = 23;
        short newAge = (short) age; // type casting
    }
}
