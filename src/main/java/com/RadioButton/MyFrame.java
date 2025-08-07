package com.RadioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButtion;
    JRadioButton hamburbberBUtton;
    JRadioButton hotDoButton;

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButtion = new JRadioButton("Pizza");
        hamburbberBUtton = new JRadioButton("Hamburgger");
        hotDoButton = new JRadioButton("Hot dog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButtion);
        group.add(hamburbberBUtton);
        group.add(hotDoButton);

        pizzaButtion.addActionListener(this);
        hamburbberBUtton.addActionListener(this);
        hotDoButton.addActionListener(this);

        this.add(pizzaButtion);
        this.add(hamburbberBUtton);
        this.add(hotDoButton);
        this.pack();
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==pizzaButtion){
            System.out.println("Pizza button selected");
        }else if (e.getSource()==hamburbberBUtton) {
            System.out.println("hamburgger button selected");
        }else if(e.getSource()==hotDoButton){
            System.out.println("hotdog button selected");
        }
    }
}
