class Person1{
    String name;
    int age;
    Person1(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Person class : " + name + " , " + age);
    }
}

class Student1 extends Person1{
    String branch;
    int sId;
    Student1(String name, int age, String branch, int sId){
        super(name, age);
        this.branch = branch;
        this.sId = sId;  
    }
    void printf(){
        System.out.println("Student class: " + name + " " + age + " " + branch + " " + sId);
    }
}

class Demo2 {
    public static void main(String[] args) {
        Student1 ref = new Person1("Rahul", 18);
        ref.display();
        ref.printf();
    }
}
