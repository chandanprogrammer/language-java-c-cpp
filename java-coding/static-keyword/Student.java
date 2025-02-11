// Static keyword is used in  four different ways -->
// 1. static variable
// 2. static method
// 3. static block
// 4. nested class

class Student{
    int rollNo;
    String name;
    static String branch = "MCA";
    void display(){
        System.out.println(rollNo + " " + name + " " + branch);
    }
}