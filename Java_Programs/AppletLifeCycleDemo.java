import javax.swing.*;
import java.awt.*;

public class AppletLifeCycleDemo extends JPanel {
    String msg = "";

    AppletLifeCycleDemo() {
        msg += "init() called -> ";
        msg += "start() called -> ";
    }

    public void stop() {
        msg += "stop() called -> ";
    }

    public void destroy() {
        msg += "destroy() called";
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Applet Life Cycle Demonstration", 20, 40);
        g.drawString(msg, 20, 70);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Applet Life Cycle Simulation");
        AppletLifeCycleDemo panel = new AppletLifeCycleDemo(); // removed stray '-'
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Simulate applet lifecycle calls
        try {
            Thread.sleep(2000);
            panel.stop();
            panel.repaint();
            Thread.sleep(2000);
            panel.destroy();
            panel.repaint();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
