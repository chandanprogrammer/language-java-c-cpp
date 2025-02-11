class Const{
    Const(){
        System.out.println("Defalut Constructor called...");
    }
    Const(int age){
        System.out.println("Your age :  "+ age);
    }
    Const(int age, String name){
        System.out.println("Your name : " + name + "and Your age : " + age);
    }
}

class ConstOverLoad {
    public static void main(String[] args) {
        Const a1 = new Const();
        Const a2 = new Const(24);
        Const a3 = new Const(24, "Chandan");
    }    
}
