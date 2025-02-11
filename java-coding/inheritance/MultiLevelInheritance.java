class HOD extends Teacher{
    String hodName;
    void printHod(){
        System.out.println(hodName);
    }
}

class MultiLevelInheritance {
    public static void main(String arg[]) {
        HOD ref = new HOD();
        ref.rollNo = 12;
        ref.sName = "Rahul";
        ref.id = 123;
        ref.tName = "Prashant Sir";
        ref.hodName = "Ratnesh Parsad";
        ref.printStudent();
        ref.printTeacher();
        ref.printHod();
    }
}
