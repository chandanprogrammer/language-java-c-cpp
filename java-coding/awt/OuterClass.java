import java.awt.*;
import java.awt.event.*;

public class OuterClass extends Frame {
    TextField t;
    OuterClass(){
        Outer ot = new Outer(this);

        t = new TextField();
        t.setBounds(130, 200, 200, 30);
        Button b = new Button("Click");
        b.setBounds(170, 250, 70, 30);
        b.addActionListener(ot);

        add(t);
        add(b);

        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        
    }
    public static void main(String arg[]){
        OuterClass ref = new OuterClass();
    }
}

class Outer implements ActionListener{
    OuterClass a;
    Outer(OuterClass a){
        this.a = a;
    }
    public void actionPerformed(ActionEvent e){
        a.t.setText("Welcome");
    }

}