package com.CheckBox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;

    public MyFrame() throws HeadlessException {


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton();
        button.setText("submit");

        // here this keyword is pointing at MyFrame
        // when you pass this to button.addActionListener(this);, you're telling the button:
        // When someone clicks you, notify this object (MyFrame), because it knows how to handle the action.
        // which is handled by  actionPerformed method down below
        button.addActionListener(this);  

        // we can totally do this with the help of lamda epression
        // button.addActionListener(e -> {
        //     System.out.println(checkBox.isSelected());
        // });

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,34));

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
           System.out.println( checkBox.isSelected());
        }
    }
}
