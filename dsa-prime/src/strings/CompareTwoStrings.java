package strings;

public class CompareTwoStrings {
    public static void main(String[] args) {
        String name1 = "Chandan";
        String name2 = "chandan";
        String name3 = new String("Chandan");

        // Equals
        if(name1.equals(name2)) System.out.println("Both same");
        else System.out.println("Not same");

        // Equals Ignore Case
        if(name1.equalsIgnoreCase(name2)) System.out.println("Both same");
        else System.out.println("Not same");

        // Compare only string value
        if(name1.equals(name3)) System.out.println("Both same");
        else System.out.println("Not same");
    }
}
