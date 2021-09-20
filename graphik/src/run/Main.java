package run;

import javax.swing.JFrame;

import components.arrowKeys;
import components.DrawingComponent;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        
        //BallMove b = new BallMove();
        //window.add(b);
        arrowKeys a = new arrowKeys();
        window.add(a);
        //window.getContentPane().setBackground(Color.BLACK);
        window.setVisible(true);
        window.setTitle("graphik");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1280, 720);
        
    }
}