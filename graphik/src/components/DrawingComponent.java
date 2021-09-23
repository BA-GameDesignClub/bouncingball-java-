//this is just a drawing component demo

package components;

import javax.swing.*;

import javafx.scene.layout.BackgroundFill;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class DrawingComponent extends JComponent {

    private static final long serialVersionUID = 498L;

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle rect = new Rectangle(5, 5, 100, 200);
        g2.setColor(Color.YELLOW);
        g2.fill(rect);
        g2.setColor(Color.CYAN);
        Ellipse2D.Double myEllipse = new Ellipse2D.Double(200, 200, 100, 90);
        g2.fill(myEllipse);
        
        

    }
    
}
    
