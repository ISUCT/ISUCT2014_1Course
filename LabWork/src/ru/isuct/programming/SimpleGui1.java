/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author stud_17
 */
import javax.swing.*;

public class SimpleGui1 {
    public static void main (String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me!");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
        
    }
    
    
}
