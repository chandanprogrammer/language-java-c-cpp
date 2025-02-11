import java.awt.*;

public class ListMain extends Frame {
    ListMain(){
        List l = new List();
        l.setBounds(100, 100, 100, 150);
        add(l);
        l.add("Items-1");
        l.add("Items-2");
        l.add("Items-3");
        l.add("Items-4");
        l.add("Items-5");

        setSize(450, 450);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        
        ListMain ref = new ListMain();
    }
}
