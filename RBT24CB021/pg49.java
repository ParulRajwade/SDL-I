//Handle button click event in Swing/AWT
import java.awt.*;
import java.awt.event.*;

public class pg49 extends Frame implements ActionListener {
    Button b;
    Label l;

    pg49() {
        b = new Button("Click Me");
        l = new Label("Button not clicked yet");
        b.addActionListener(this);
        add(b);
        add(l);
        setLayout(new FlowLayout());
        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        l.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new pg49();
    }
}
