import java.applet.Applet;
import java.awt.*;

public class TempleApplet extends Applet {

    public void paint(Graphics g) {
        // Set the background color to light gray
        setBackground(Color.lightGray);

        // Draw the base of the temple (Rectangle)
        g.setColor(Color.darkGray);
        g.fillRect(100, 200, 200, 150);

        // Draw the top of the temple (Triangle roof)
        g.setColor(Color.orange);
        int[] xPoints = {100, 200, 300};
        int[] yPoints = {200, 100, 200};
        g.fillPolygon(xPoints, yPoints, 3);

        // Draw the door of the temple
        g.setColor(Color.black);
        g.fillRect(175, 275, 50, 75);
        
        // Draw pillars of the temple
        g.setColor(Color.white);
        g.fillRect(120, 250, 20, 100);
        g.fillRect(260, 250, 20, 100);
    }
}
