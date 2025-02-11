class Student01{
    String name;
    int roll;
    static String branch = "MCA";
    Student01(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    void display(){
        System.out.println(name + " " + roll + " " + branch);
    }
    static void change(){
        branch = "Pharmacy";
    }
}

class Mstudent {
    public static void main(String[] args) {
        
        Student01 s1 = new Student01("Aditya", 1001);
        Student01 s2 = new Student01("Ajay", 1002);
        s1.display();
        s2.display();
        Student01.change();
        s1.display();
        s2.display();
    }
}
