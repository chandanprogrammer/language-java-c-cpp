import java.awt.*;
import java.awt.event.*;

public class DrawDrawing extends Frame implements MouseMotionListener {
    DrawDrawing(){
        addMouseMotionListener(this);

        setSize(600, 600);
        setLayout(null);
        setVisible(true);

    }
    public void mouseDragged(MouseEvent e){
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(), e.getY(), 5, 5);
    }
    public void mouseMoved(MouseEvent e){
    }
    public static void main(String arg[]){
        new DrawDrawing();
    }
}
