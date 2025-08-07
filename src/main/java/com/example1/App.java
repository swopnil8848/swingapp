package com.example1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // jframe  = a gui window to add components to 

            JFrame frame = new JFrame("Modern Swing Dashboard");  // creates a frame

            /*
            frame.setTitle("JFrame title goes here");  // sets title of frame
            frame.setSize(420,420); // set the x and y dimmension of the frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit out of application
            frame.setResizable(false);
            frame.setVisible(true);  // make frame vissible


            // created resources folder inside of main for logo.png to load while runnign
            ImageIcon image = new ImageIcon(App.class.getResource("/logo.png"));
   
            frame.setIconImage(image.getImage());

            // Displays the image inside the window
            JLabel imageLabel = new JLabel(image);
            frame.getContentPane().add(imageLabel);
            frame.getContentPane().setBackground(new Color(0,0,0));  // change color of background
            */


           MyFrame myFrame = new MyFrame(); 
        });
    }

    private static JLabel contentLabel;
}
