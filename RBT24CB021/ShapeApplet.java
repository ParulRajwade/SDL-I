import javax.swing.*;
import java.awt.*;

public class ShapeApplet extends JPanel {

    // Paint method to draw shapes
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100); // Draw a filled red square

        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 100, 100); // Draw a filled blue circle

        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 300, 200); // Draw a green line
    }

    // Main method — works as a normal Java GUI program
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Drawing Example");
        ShapeApplet panel = new ShapeApplet();

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
