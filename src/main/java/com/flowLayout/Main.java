package com.flowLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main{
    public static void main(String[] args){

        // layout manager = defines the natural layout for components within a container

        // flowLayour = places components in a row, sized at thier prefered size if the horizontal space in the container is too small
        // flowlayout class users the next avaibale row.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));   // by defualt frames uses border layout 
        // frame.setLayout(new FlowLayout(FlowLayout.LEADING));   // button will stick to left side of frame
        // frame.setLayout(new FlowLayout(FlowLayout.trailing));   // button will stick to right side of frame

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));

        frame.add(panel);
        frame.setVisible(true);

    }
}
