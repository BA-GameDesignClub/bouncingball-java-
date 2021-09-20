package components;

import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.awt.*;

public class BallMove extends JPanel implements ActionListener/*, KeyListener*/ {
    

    private static final long serialVersionUID = 1L;
    Timer t = new Timer(5, this);
    double x = 1, y = 1, dx = 2, dy = 2;


    public BallMove(){
        t.start();
        //addKeyListener(this);
        setFocusable(true);
        System.out.println(".");
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D ball = new Ellipse2D.Double(x, y, 50, 50);
        g2.fill(ball);
    }

	public void actionPerformed(ActionEvent e) {
        if(x >= getWidth() - 50 || x <= 0){
            dx = -(0.95)*dx;
        }
        if(y >= getHeight() - 50 || y <= 0){
            dy = -(0.95)*dy;
        }
        
        x+= dx;
        y+= dy;
        //dy += 0.05;
        
        repaint();
    }

    public void up(){
        dy = -1;
    }
    public void down(){
        dy = 1;
    }
    public void left(){
        dx = -1;
    }
    public void right(){
        dx = 1;
    }

    /*public void keyPressed(KeyEvent e){
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
    }*/

    /*public void keyTyped(KeyEvent e) {
        
    }*/

    /*public void keyReleased(KeyEvent e) {
        
    }*/
}