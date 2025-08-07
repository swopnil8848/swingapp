package com.lamdaExpressions;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends  JFrame{
    JButton myButton = new JButton("My Button");

    public MyFrame(){

        myButton.setBounds(100,100,100,50);

        
        // myButton.addActionListener(new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent e){
        //         System.out.println("You Clicked a button");
        //     }
        // });

        // instead of doing this ActionListener give us abstract class to use
        myButton.addActionListener((e)->System.out.println("hello button was clieckd"));

        this.add(myButton);      // here this represents frame so

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    
}
