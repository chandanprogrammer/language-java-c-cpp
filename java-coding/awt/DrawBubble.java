import java.awt.*;
import java.awt.event.*;

public class DrawBubble extends Frame implements MouseListener {
    DrawBubble() {
        addMouseListener(this);

        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        // g.setColor(new Color(244, 34, 56));
        g.drawOval(e.getX(), e.getY(), 60, 60);
        // g.fillOval(e.getX(), e.getY(), 60, 60);
        
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public static void main(String[] args) {
        DrawBubble ref = new DrawBubble();
    }
}