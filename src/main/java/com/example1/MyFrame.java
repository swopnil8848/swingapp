package com.example1;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyFrame(){
            this.setTitle("JFrame title goes here");  // sets title of frame
            this.setSize(420,420); // set the x and y dimmension of the frame
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit out of application
            this.setResizable(false);
            this.setVisible(true);  // make frame vissible


            // created resources folder inside of main for logo.png to load while runnign
            ImageIcon image = new ImageIcon(App.class.getResource("/logo.png"));
   
            this.setIconImage(image.getImage());

            System.out.println(App.class.getResource("/logo.png"));

            // Displays the image inside the window
            JLabel imageLabel = new JLabel(image);
            this.getContentPane().add(imageLabel);
            this.getContentPane().setBackground(new Color(0,0,0));  // change color of background
    }
}