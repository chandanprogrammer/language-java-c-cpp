import java.awt.*;
import java.awt.event.*;

public class TextSet extends Frame implements ActionListener {
    TextField t;
    TextSet() {
        t = new TextField();
        t.setBounds(200, 150, 150, 30);
        add(t);

        Button clickBtn = new Button("Click");
        clickBtn.setBounds(210, 240, 80, 30);
        add(clickBtn);

        clickBtn.addActionListener(this);

        setSize(600, 600);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        t.setText("Welcome in Java class");
    }

    public static void main(String[] args) {
        TextSet ref = new TextSet();
    }
}
