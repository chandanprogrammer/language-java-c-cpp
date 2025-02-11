import java.awt.*;
import java.awt.event.*;

public class AnynomousClass extends Frame {
    TextField t;
    AnynomousClass(){
        t = new TextField();
        t.setBounds(100, 150, 200, 30);
        add(t);
        Button b = new Button("Click");
        b.setBounds(150, 190, 80, 30 );
        add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText("Welcome in java class");
            }
        });

        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String arg[]){
        AnynomousClass ref = new AnynomousClass();
    }
    
}
