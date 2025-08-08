package com.FileColorChooser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements  ActionListener{
    JButton button;
    JLabel label;


    public MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        label = new JLabel("SOME TEXT");
        label.setFont(new Font("MV Boli",Font.PLAIN,100));
        label.setBackground(Color.white);
        label.setOpaque(true);

        button.addActionListener(this);

        this.add(button);
        this.add(label);

        this.pack();
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("Action performed metod called:: ");
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);

            // label.setForeground(color);
            label.setBackground(color);
        }
    }
}
