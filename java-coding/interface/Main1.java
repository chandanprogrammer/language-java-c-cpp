interface X{
    int age1 = 20;
    void add();
}
interface A extends X{
    int age = 20;
    void add();
}
interface B{
    int count = 2;
    void add();
}
class AN{
    String name = "Chandan";
    void display(){
        System.out.println(name);
    }
}
class C extends AN implements A, B{
    public void add(){
        System.out.println("Add method");
        System.out.println(age+count);
    }
}

class Main1{
    public static void main(String[] args) {
        C obj = new C();
        obj.add();
        obj.display();
    }
}