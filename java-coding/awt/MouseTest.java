import java.awt.*;
import java.awt.event.*;

public class MouseTest extends Frame implements MouseListener {
    Label screen;
    MouseTest(){
        screen = new Label();
        screen.setBounds(100, 100, 200, 30);
        add(screen);
        addMouseListener(this);

        setSize(600, 600);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        screen.setText("Mouse clicked..");
    }
    public void mousePressed(MouseEvent e){
        screen.setText("Mouse pressed..");
    }
    public void mouseReleased(MouseEvent e){
        screen.setText("Mouse released..");
    }
    public void mouseEntered(MouseEvent e){
        screen.setText("Mouse entered..");
    }
    public void mouseExited(MouseEvent e){
        screen.setText("Mouse exit..");
    }

    public static void main(String[] args) {
        MouseTest ref = new MouseTest();
    }
}
