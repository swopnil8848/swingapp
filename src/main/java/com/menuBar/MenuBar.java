package com.menuBar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JFrame implements ActionListener{
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    public MenuBar() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setMnemonic(KeyEvent.VK_L);  // l for load
        saveItem.setMnemonic(KeyEvent.VK_S);  // s for load
        exitItem.setMnemonic(KeyEvent.VK_E);  // e for load

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==loadItem){
            System.out.println("you loaded a file");
        }else if(e.getSource()==saveItem){
            System.out.println("you save a file");
        }else if(e.getSource()==exitItem){
            System.out.println("You exited on file");
        }
    }
}
