interface student{
    String name = "Rahul";
    void display();
}
class animal{
    void aPrint(){
        System.out.println("Animal");
    }
}

class Main2 extends animal implements student  {

    public void display(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Main2 obj = new Main2();
        obj.display();
        obj.aPrint();
    }
}
