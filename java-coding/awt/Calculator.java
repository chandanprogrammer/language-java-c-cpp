import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    TextField screen;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button bPlus, bMinus, bMult, bDivd, bEqual, clear;

    long num1, num2;
    String tempVal = "";
    String operation;

    Calculator() {
        screen = new TextField();
        screen.setBounds(100, 90, 260, 40);
        add(screen);

        b1 = new Button("1");
        b1.setBounds(100, 150, 50, 30);
        add(b1);
        b2 = new Button("2");
        b2.setBounds(170, 150, 50, 30);
        add(b2);
        b3 = new Button("3");
        b3.setBounds(240, 150, 50, 30);
        add(b3);
        bPlus = new Button("+");
        bPlus.setBounds(310, 150, 50, 30);
        add(bPlus);

        b4 = new Button("4");
        b4.setBounds(100, 200, 50, 30);
        add(b4);
        b5 = new Button("5");
        b5.setBounds(170, 200, 50, 30);
        add(b5);
        b6 = new Button("6");
        b6.setBounds(240, 200, 50, 30);
        add(b6);
        bMinus = new Button("-");
        bMinus.setBounds(310, 200, 50, 30);
        add(bMinus);

        b7 = new Button("7");
        b7.setBounds(100, 250, 50, 30);
        add(b7);
        b8 = new Button("8");
        b8.setBounds(170, 250, 50, 30);
        add(b8);
        b9 = new Button("9");
        b9.setBounds(240, 250, 50, 30);
        add(b9);
        bMult = new Button("*");
        bMult.setBounds(310, 250, 50, 30);
        add(bMult);

        clear = new Button("Clear");
        clear.setBounds(100, 300, 50, 30);
        add(clear);
        b0 = new Button("0");
        b0.setBounds(170, 300, 50, 30);
        add(b0);
        bEqual = new Button("=");
        bEqual.setBounds(240, 300, 50, 30);
        add(bEqual);
        bDivd = new Button("/");
        bDivd.setBounds(310, 300, 50, 30);
        add(bDivd);

        // regester addActionListener
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bPlus.addActionListener(this);
        bMinus.addActionListener(this);
        bMult.addActionListener(this);
        bDivd.addActionListener(this);
        bEqual.addActionListener(this);
        clear.addActionListener(this);

        setSize(450, 450);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        System.out.println();
        // ----- to detect who button click and value update ----
        if (e.getSource() == b0) {
            tempVal += b0.getLabel();
        } else if (e.getSource() == b1) {
            tempVal += b1.getLabel();
        } else if (e.getSource() == b2) {
            tempVal += b2.getLabel();
        } else if (e.getSource() == b3) {
            tempVal += b3.getLabel();
        } else if (e.getSource() == b4) {
            tempVal += b4.getLabel();
        } else if (e.getSource() == b5) {
            tempVal += b5.getLabel();
        } else if (e.getSource() == b6) {
            tempVal += b6.getLabel();
        } else if (e.getSource() == b7) {
            tempVal += b7.getLabel();
        } else if (e.getSource() == b8) {
            tempVal += b8.getLabel();
        } else if (e.getSource() == b9) {
            tempVal += b9.getLabel();
        } else if (e.getSource() == bPlus) {
            num1 = Integer.parseInt(tempVal);
            operation = bPlus.getLabel();
            tempVal = "";
        } else if (e.getSource() == bMinus) {
            num1 = Integer.parseInt(tempVal);
            operation = bMinus.getLabel();
            tempVal = "";
        } else if (e.getSource() == bMult) {
            num1 = Integer.parseInt(tempVal);
            operation = bMult.getLabel();
            tempVal = "";
        } else if (e.getSource() == bDivd) {
            num1 = Integer.parseInt(tempVal);
            operation = bDivd.getLabel();
            tempVal = "";
        } else if (e.getSource() == bEqual) {
            num2 = Integer.parseInt(tempVal);
            if (operation == "+")
                tempVal = "" + (num1 + num2);
            else if (operation == "-")
                tempVal = "" + (num1 - num2);
            else if (operation == "*")
                tempVal = "" + (num1 * num2);
            else if (operation == "/") {
                try {
                    System.out.println(num1 / num2);
                    tempVal = "" + (Double.parseDouble("" + num1) / Double.parseDouble("" + num2));
                } catch (ArithmeticException err) {
                    System.out.println(err.getMessage());
                    tempVal = "Not possibe divide by zero";
                }
            }
        } else if (e.getSource() == clear) {
            num1 = 0;
            num2 = 0;
            tempVal = "";
        }
        screen.setText(tempVal);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
