class Student{
    String sName;
    int rollNo;
    void printStudent(){
        System.out.println(rollNo + " : " + sName);
    }
}
class Teacher extends Student{
    String tName;
    int id;
    void printTeacher(){
        System.out.println(id + " : " + tName);
    }
}

public class SimpleInheritance {
    public static void main(String arg[]) {
        Teacher ref = new Teacher();
        ref.sName = "Aman";
        ref.rollNo = 24;
        ref.tName = "Shrabanti Mandal";
        ref.id = 102;
        ref.printStudent();
        ref.printTeacher();
    }
}
