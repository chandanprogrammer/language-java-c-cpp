package strings;
// String is non-primitive data type
public class BasicStrings {
    public static void main(String[] args) {

        char[] c ={'A', 'm', 'a', 'n'}; // array of character works as java string

        String name = "Chandan"; // by string literal (' or " )
        String name1 = "Chandan";
        String otherName = "Aman";

        System.out.println(name); // Chandan

        // "Both are same" because store in string constant pool (Heap Memory)
        if(name==name1) System.out.println("Both are same"); // both variable reference at same point
        else System.out.println("Both are not same");

        name = "Shekhar";
        System.out.println(name); // Shekhar

        String newName = new String("Raju"); // by new keyword
        String newName1 = new String("Raju");
        System.out.println(newName + " " + newName1);

        // "Both are not same" because store in normal Heap Memory
        if(newName==newName1) System.out.println("Both are same");
        else System.out.println("Both are not same"); // both variable reference at difference point
    }
}
