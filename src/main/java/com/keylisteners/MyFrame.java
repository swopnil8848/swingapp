package com.keylisteners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.example1.App;

public class MyFrame extends JFrame implements KeyListener{

    JLabel label;
    ImageIcon icon;

    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon(App.class.getResource("/rocket.jpg"));

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(0,0,500,500);
        // label.setBackground(Color.red);
        // label.setOpaque(true);
        
        this.add(label);
        this.setVisible(true);
    }
    
    // we need to add following 3 mehtods if we implement keylistener
    @Override
    public void keyTyped(KeyEvent e){
        switch(e.getKeyChar()){
            case'a':
                label.setLocation(label.getX() - 10,label.getY());
                break;
            case'w':
                label.setLocation(label.getX(),label.getY() + 10);
                break;
            case's':
                label.setLocation(label.getX(),label.getY() - 10);
                break;
            case'd':
                label.setLocation(label.getX() + 10,label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            case 37:
                label.setLocation(label.getX() - 5,label.getY());
                break;
            case 38:
                label.setLocation(label.getX(),label.getY() + 5);
                break;
            case 39:
                label.setLocation(label.getX(),label.getY() - 5);
                break;
            case 40:
                label.setLocation(label.getX() + 5,label.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e){
        System.out.println("You release key char:: "+e.getKeyChar());
    }
}
