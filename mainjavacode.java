import javax.swing.*;

public class mainjavacode{

    JFrame frame = new JFrame("EleGiggle");
    JPanel panel = new JPanel();
    JButton button = new JButton("OK");

    panel.add(button);
    frame.getContentPane().add(panel);
    frame.show();

}