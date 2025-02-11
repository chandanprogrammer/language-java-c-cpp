// package awt;
import java.awt.*;

public class Awt2 {
    Awt2(){
        Frame f = new Frame("This is title");

        Label l1 = new Label("Enter your Name");
        l1.setBounds(100, 40, 150, 20);
        f.add(l1);
        l1.setAlignment(Label.CENTER);
        System.out.println(l1.getAlignment());
        System.out.println(l1.getText());


        TextField t1 = new TextField();
        t1.setBounds(100, 70, 150, 20);
        t1.setEchoChar('*');
        f.add(t1);
        System.out.println(t1.echoCharIsSet());
        System.out.println(t1.getEchoChar());

        Label lan = new Label("Language : ");
        Label gen = new Label("Gender : ");
        Label add = new Label("Address : ");

        Checkbox cb1 = new Checkbox("Hindi", false);
        Checkbox cb2 = new Checkbox("English", false);
        Checkbox cb3 = new Checkbox("Other", false);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cbg1 = new Checkbox("Male", cbg, false);
        Checkbox cbg2 = new Checkbox("Female", cbg, false);
        Checkbox cbg3 = new Checkbox("Other", cbg, false);

        // TextArea ta1 = new TextArea();
        TextArea ta1 = new TextArea("TextArea");
        // TextArea ta1 = new TextArea("TextArea", 3000, 50);

        ta1.append(" Welcome ");
        // ta1.insert("AAA", 3);
        ta1.replaceRange("AAA", 3, 8);
        ta1.setColumns(40);
        ta1.setRows(40);
        System.out.println(ta1.getColumns() + " " + ta1.getRows());


        lan.setBounds(100, 100, 80, 20);
        gen.setBounds(100, 130, 80, 20);
        add.setBounds(100, 160, 80, 20);

        cb1.setBounds(200, 100, 60, 20);
        cb2.setBounds(270, 100, 60, 20);
        cb3.setBounds(340, 100, 60, 20);

        cbg1.setBounds(200, 130, 60, 20);
        cbg2.setBounds(270, 130, 60, 20);
        cbg3.setBounds(340, 130, 60, 20);

        ta1.setBounds(200, 160, 300, 150);

        f.add(lan);
        f.add(gen);
        f.add(add);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cbg1);
        f.add(cbg2);
        f.add(cbg3);
        f.add(ta1);



        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        Awt2 ref = new Awt2();
    }
}
