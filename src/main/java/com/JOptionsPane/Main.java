package com.JOptionsPane;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // JOptionsPane = pop up a standar dialog box that prompts user for a value or informs them of something

        // JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.ERROR_MESSAGE);

        // int answer = JOptionPane.showConfirmDialog(null, "bro do you event code","this is my tittle",JOptionPane.YES_NO_CANCEL_OPTION);

        String name = JOptionPane.showInputDialog("what is your name?");
        System.out.println("Hello:: "+name);
    }
}
