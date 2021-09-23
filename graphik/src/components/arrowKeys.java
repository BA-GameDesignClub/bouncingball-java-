// a jpanel that draws a ball that bounces around the panel, controlled by arrow keys

package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class arrowKeys extends JPanel implements ActionListener, KeyListener{

    private static final long serialVersionUID = 5194319078091921553L; //no idea what this does
    Timer t = new Timer(5, this); // The timer controls the redrawing in some way.
    double x = 100, y = 100, dx = 0, dy = -5;  //Describes the ball. Actually, this is the particle the ball is built around.

    //constructor, initializes keylistener things
    public arrowKeys() {
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    //this is what to redraw in the animation
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(new Ellipse2D.Double(x, y, 40, 40));
    }

    // describes particle behavior at every redraw
    public void actionPerformed(ActionEvent e) {
        if(x > getWidth() - 60 || x < 20){ // when ball x hits an edge, reverse x velocity and reduce by 5%
            dx = -(0.95)*dx;
        }
        if(y > getHeight() - 60 || y < 20){ // when ball y hits an edge, reverse x velocity and reduce by 5%
            dy = -(0.95)*dy;
        }
        
        x += dx; //apply x velocity to x position
        y += dy; //apply y velocity to y position
        dy += 0.02; //increases y velocity down (gravity)

        repaint();
    }

    //this block increases velocity in the function name direction
    public void up(){
        dy -= 0.5;
    }
    public void down(){
        dy += 0.5;
    }
    public void left(){
        dx -= 0.5;
    }
    public void right(){
        dx += 0.5;
    }

    public void keyPressed(KeyEvent e){// handles key controls
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_UP){
            up();
        }
        if(code == KeyEvent.VK_DOWN){
            down();
        }
        if(code == KeyEvent.VK_LEFT){
            left();
        }
        if(code == KeyEvent.VK_RIGHT){
            right();
        }
    }

	public void keyTyped(KeyEvent e) {

		
	}

    public void keyReleased(KeyEvent e) {


    }
}
