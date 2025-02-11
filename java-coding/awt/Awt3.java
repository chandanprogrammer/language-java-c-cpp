import java.awt.*;

public class Awt3 extends Frame {

    Awt3() {
        Choice ch = new Choice();
        ch.setBounds(100, 150, 100, 100);
        add(ch);
        ch.add("India");
        ch.add("Iran");
        ch.add("Pakistan");
        ch.add("America");

        ch.insert("items", 0);

        // ch.select(2);
        ch.select("India");

        Label l1 = new Label();
        Label l2 = new Label();
        Label l3 = new Label();
        Label l4 = new Label();
        l1.setBounds(100, 100, 50, 20);
        l2.setBounds(150, 100, 50, 20);
        l3.setBounds(200, 100, 50, 20);
        l4.setBounds(250, 100, 50, 20);

        l1.setText(ch.getSelectedItem());
        l2.setText(String.valueOf(ch.getSelectedIndex()));
        l3.setText(String.valueOf(ch.getItemCount()));
        l4.setText(ch.getItem(4));

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        System.out.println(ch.getSelectedItem());
        System.out.println(ch.getSelectedIndex());
        System.out.println(ch.getItemCount());
        System.out.println(ch.getItem(4));

        // ch.remove(2);
        // ch.remove("America");
        // ch.removeAll();

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Awt3 ref = new Awt3();
    }
}
