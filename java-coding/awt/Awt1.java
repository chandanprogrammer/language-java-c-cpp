// package awt;
import java.awt.*;

public class Awt1 extends Frame {
    Awt1(){
        // Label l1 = new Label("Enter Your Name : ");
        Label l1 = new Label("Name ", Label.CENTER);

        Label l2 = new Label("Enter Your Father's Name : ");
        Label l3 = new Label("Age : ");
        Label l4 = new Label("Gender : ");
        // TextField t1 = new TextField("Enter Your Name...");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        Button b = new Button("Submit");
        // b.setLabel("Label set");
        // System.out.println(b.getLabel());

        l1.setBounds(100, 90, 200, 20);
        add(l1);
        t1.setBounds(100, 120, 200, 30);
        add(t1);
        l2.setBounds(100, 160, 200, 20);
        add(l2);
        t2.setBounds(100, 190, 200, 30);
        add(t2);
        b.setBounds(100, 230, 50, 20);
        add(b);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        Awt1 aw = new Awt1();
    }
}