// Write a program in java to show constructor

class student{
    int id;
    String name;
    student(){
        System.out.println(id + " "+ name);
    }
    student(int id, String name){
        System.out.println(id + " "+ name);
    }
}

class Constructor {
    public static void main(String arg[]) {
        student s1 = new student();
        s1.id = 12;
        s1.name = "chandan";
        student s2 = new student(24, "aman");
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
