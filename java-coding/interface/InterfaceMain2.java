interface Callback{
    void callback(int parm);
}

class Client implements Callback{
    public void callback(int p){
        System.out.println("Callback called with " + p);
    }
}

class AnotherClient implements Callback{
    public void callback(int p){
        System.out.println("Another version of callback");
        System.out.println("p squared is "+ (p*p));
    }
}

public class InterfaceMain2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c = ob;
        ob.callback(42);
        c.callback(42);
    }
}
