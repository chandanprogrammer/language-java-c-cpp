import java.awt.*;
import java.awt.event.*;

public class DrawLine extends Frame implements MouseListener, MouseMotionListener {
    int startX, startY, endX, endY;

    DrawLine() {
        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(600, 400);
        setLayout(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; // Cast Graphics to Graphics2D
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(3)); // Set line width to 5
        g2.drawLine(startX, startY, endX, endY);
    }

    public void mousePressed(MouseEvent e) {
        startX = e.getX();
        startY = e.getY();
    }

    public void mouseDragged(MouseEvent e) {
        endX = e.getX();
        endY = e.getY();
        repaint(); // internally call paint method
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }

    public static void main(String[] args) {
        new DrawLine();
    }
}
