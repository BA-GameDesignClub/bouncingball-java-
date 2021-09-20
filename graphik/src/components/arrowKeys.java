package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class arrowKeys extends JPanel implements ActionListener, KeyListener{
    Timer t = new Timer(5, this);
    double x = 100, y = 100, dx = 0, dy = -5;

    public arrowKeys() {
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(new Ellipse2D.Double(x, y, 40, 40));
    }

    public void actionPerformed(ActionEvent e) {
        if(x > getWidth() - 60 || x < 20){
            dx = -(0.95)*dx;
        }
        if(y > getHeight() - 60 || y < 20){
            dy = -(0.95)*dy;
        }
        
        x += dx;
        y += dy;
        dy += 0.02;

        repaint();
    }

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
    public void keyPressed(KeyEvent e){
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