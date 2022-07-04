
import javax.swing.JApplet;
import java.awt.Graphics;

public class NewJApplet extends JApplet {

    
    public void paint (Graphics g) {
      g.drawString ("Hello World", 40, 20);
      
// Draws a circle on the screen (x=40, y=30).
        g.drawArc(40, 50, 80, 80, 0, 360);
    }

    // TODO overwrite start(), stop() and destroy() methods
}


