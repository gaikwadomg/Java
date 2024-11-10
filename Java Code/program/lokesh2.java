import javax.swing.*;

public class lokesh2 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Simple GUI");

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with some text
        JLabel label = new JLabel("Hello, welcome to the GUI!");

        // Add the label to the frame
        frame.getContentPane().add(label);

        // Set the frame size
        frame.setSize(300, 200);

        // Make the frame visible
        frame.setVisible(true);
    }
}
