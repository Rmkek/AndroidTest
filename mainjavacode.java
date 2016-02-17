import java.swing.*;

public class mainjavacode{
    JFrame frame = new JFrame("EleGiggle");
    JPanel panel = new JPanel;
    JButton myButton = new Button("OK");
    panel.add(myButton);
    frame.addcontentpane().add(panel);
    frame.show();

}