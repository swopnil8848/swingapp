package com.inputfield;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    MyFrame(){
        textField = new JTextField();
        button = new JButton("submit");
        
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.BOLD,35));
        textField.setForeground(Color.blue);
        textField.setBackground(Color.yellow);
        textField.setCaretColor(Color.pink);
        textField.setText("user name");
        // textField.setEditable(false);

        button.addActionListener(this);

        this.add(textField);
        this.add(button);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public  void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            String text = textField.getText();
            button.setEnabled(false);
            textField.setEditable(false);
            System.out.println("welcome:: "+ text);

        }
    }
    
}
