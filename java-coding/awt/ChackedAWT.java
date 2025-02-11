import java.awt.*;
import java.awt.event.*;

public class ChackedAWT extends Frame implements ItemListener {
    Label l;
    Checkbox cb1, cb2;
    ChackedAWT(){
        l = new Label();
        l.setBounds(100, 100, 200, 30);
        add(l);
        cb1 = new Checkbox("Java");
        cb1.setBounds(100, 150, 100, 30);
        add(cb1);
        cb2 = new Checkbox("C++");
        cb2.setBounds(100, 200, 100, 30);
        add(cb2);

        cb1.addItemListener(this);
        cb2.addItemListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == cb1){
            System.out.println(e.getStateChange());
            l.setText("Java " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
        }
        if(e.getSource() == cb2){
            l.setText("C++ " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
        }
    }
    public static void main(String[] args) {
        new ChackedAWT();
    }
}
