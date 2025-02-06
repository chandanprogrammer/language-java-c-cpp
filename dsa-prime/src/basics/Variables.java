package basics;

public class Variables {
    public static void main(String[] args) {

        // Valid Variables......
        int myAge = 23; // camel case convention
        int $childAge = 2;
        int _oldAge = 72;
        int MYAGE = 20; // both myAge and MYAGE are different (Java is case-sensitive language)

        // InValid Variables......
        // int 2myAge = 23;
        // int @childAge = 2; // no any special character except _ or $ allowed
        // int old Age = 72;

        int age; // Declaration
        age = 12; // Initialization

        System.out.println(myAge);
        System.out.println($childAge);
        System.out.println(_oldAge);
        System.out.println(MYAGE);

    }
}



// shortcut key "public static void main" --> psvm
// shortcut key "System.out.println()" --> sout