interface University{
    final String name = "Guru Ghasidash University" ;
    abstract void displayUniversity(String name); 
}

public class InterfaceMain implements University {
    
    public void displayUniversity(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        System.out.println("Main Method.");
        System.out.println(name);
        InterfaceMain ref = new InterfaceMain();
        ref.displayUniversity(name);
    }
}
