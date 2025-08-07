package com.pannels;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.example1.App;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon(App.class.getResource("/rocket.jpg"));
        
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);

        JPanel redpanel = new JPanel();
        JPanel bluepanel = new JPanel();
        JPanel greenpanel = new JPanel();
        
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 100, 100);

        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(100, 0, 100, 100);

        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0, 100, 200, 100);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null); // ✅ Must be here
        frame.setVisible(true);

        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
        // frame.add(label);

        redpanel.add(label);
    }
}
 