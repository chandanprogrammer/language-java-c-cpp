import java.awt.*;
import java.awt.event.*;

public class CountWords extends Frame implements KeyListener{
    Label l;
    TextArea ta;
    boolean first = true;

    CountWords(){
        l  = new Label();
        l.setBounds(100, 100, 200, 30);
        add(l);
        ta = new TextArea("Write here something ...",  200, 100, TextArea.SCROLLBARS_NONE);
        ta.setBounds(100, 150, 300, 150);
        add(ta);

        l.setText("Words : 0 | Characters : 0" );

        ta.addKeyListener(this);

        setSize(600, 600);
        setLayout(null);
        setVisible(true);

    }
    public void keyTyped(KeyEvent e){
        // l.setText("key typed");
    }
    public void keyPressed(KeyEvent e){
        // l.setText("key pressed");
        if(first == true){
            ta.setText("");
            first = false;
        }
    }
    public void keyReleased(KeyEvent e){
        
        // l.setText("key released");
        String s = ta.getText();
        String s1[] = s.split(" ");
        l.setText("Words : " + s1.length + " | Characters : " + s.length());
    }
    public static void main(String[] args) {
        new CountWords();
    }
}
