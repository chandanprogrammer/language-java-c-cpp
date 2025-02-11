import java.awt.*;
import java.awt.event.*;

public class Calculator3 extends Frame implements ActionListener {
    TextField tf = new TextField();
    String inpt, operator;
    double n1, n2, ans;
    Button b[] = new Button[10];
    Calculator3(){
        tf.setBounds(100, 30, 100, 20);

        for (int i = 0; i < 10; i++) {
            b[i] = new Button(String.valueOf(i));
            b[i].addActionListener(this);
            add(b[i]);
        }

        Button add = new Button("+");
        Button min = new Button("-");
        Button mul = new Button("*");
        Button div = new Button("/");
        Button eq = new Button("=");
        Button Clear = new Button("Clear");


        b[1].setBounds(90, 60, 20, 20);
        b[2].setBounds(110, 60, 20, 20);
        b[3].setBounds(130, 60, 20, 20);
        b[4].setBounds(150, 60, 20, 20);
        b[5].setBounds(170, 60, 20, 20);
        b[6].setBounds(90, 80, 20, 20);
        b[7].setBounds(110, 80, 20, 20);
        b[8].setBounds(130, 80, 20, 20);
        b[9].setBounds(150, 80, 20, 20);
        b[0].setBounds(170, 80, 20, 20);

        add.setBounds(90, 110, 20, 20);
        min.setBounds(110, 110, 20, 20);
        mul.setBounds(130, 110, 20, 20);
        div.setBounds(150, 110, 20, 20);
        eq.setBounds(170, 110, 20, 20);
        Clear.setBounds(90, 140, 100, 20);

        add.addActionListener(this);
        min.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        eq.addActionListener(this);
        Clear.addActionListener(this);

        add(add);
        add(min);
        add(mul);
        add(div);
        add(eq);
        add(Clear);

        add(tf);

        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        Button b1 = (Button) obj;
        String inpt = b1.getLabel();

        if("0123456789".contains(inpt)){
            inpt = tf.getText() + inpt;
            tf.setText(inpt);
        }
        else if("+-*/".contains(inpt)){
            operator = inpt;
            n1 = Integer.parseInt(tf.getText());
            tf.setText("");
        }
        else if("=" == (inpt)){
            n2 = Integer.parseInt(tf.getText());
            
            switch(operator){
                case "+":
                    ans = (n1 + n2);
                    break;
                case "-":
                    ans = n1-n2;
                    break;
                case "*":
                    ans = n1*n2;
                    break;
                case "/":
                    ans = n1/n2;
                    break;
            }
            inpt = String.valueOf(ans);
            tf.setText(inpt);
        }
        else if (inpt == "Clear") {
            tf.setText("");
            operator = null;
        }

    }
    public static void main(String[] args) {
        Calculator3 cf = new Calculator3();
    }
}