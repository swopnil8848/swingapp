package com.buttons;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.example1.App;

public class MyFrame extends  JFrame{
    JButton button;

    public MyFrame(){

        ImageIcon icon = new ImageIcon(App.class.getResource("/logo.png"));

        System.out.println(icon);

        this.button = new JButton();
        button.setBounds(200, 100, 500, 500);
        button.addActionListener(e -> System.out.println("poo"));
        button.setText("click me");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Commic Snas",Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.blue);
        button.setBackground(Color.green);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(false);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000,1000);
        this.setVisible(true);

        this.add(button);
    }

    // @Override
    // public  void actionPerformed(ActionEvent e){
    //     if(e.getSource()==button){
    //         // System.out.println("clicking the button");
    //     }
    // }
    
}
