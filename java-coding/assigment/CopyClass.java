// Write a program in java to copy one class object to another object.

class student {
    int age;
    String name;

    void display() {
        System.out.println("Hi " + name + "! Your age is " + age);
    }
}

class CopyClass {
    public static void main(String arg[]) {
        student s1 = new student(); 
        student s2;
        s1.age = 24;
        s1.name = "Chandan";
        s2 = s1;
        // s1 = null;
        s1.display();
        s2.display();
    }
}
