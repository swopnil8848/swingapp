package com.example2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        // Create the JFrame first
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout()); // optional, for flexible positioning

        // Load image
        ImageIcon image = new ImageIcon(App.class.getResource("/logo.png"));
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        System.out.println("image icon:: " + image);

        // Create label with text and image
		JLabel label = new JLabel(); //create a label
		label.setText("bro, do you even code?"); //set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0x00FF00)); //set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,100)); //set font of text
		label.setIconTextGap(-25); //set gap of text to image
		label.setBackground(Color.black); //set background color
		label.setOpaque(true); //display background color
		//label.setBorder(border); //sets border of label (not image+text)
		label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
		//label.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions

        // Add label to frame
        frame.getContentPane().add(label);

        // Adjust frame and show
        frame.pack();
        frame.setVisible(true);
    }
}
