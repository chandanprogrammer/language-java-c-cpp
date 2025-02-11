class University {
    public static void main(String arg[]) {
        Student s1 =new Student();
        Student s2 =new Student();

        s1.rollNo = 23;
        s1.name = "Chandan";

        s2.rollNo = 24;
        s2.name = "Aman";

        // s1.branch = "CSIT";

        s1.display();
        s2.display();

        Teacher t1 = new Teacher(101, "Vivek sir");
        // t1.department = "Pharmacy";
        t1.display();

    }    
}
