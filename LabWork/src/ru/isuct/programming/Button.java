package ru.isuct.programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
 
public class Button implements ActionListener {
 
   public Button() {
      initComponents();
   }
 
   private JFrame viewForm;
 
   private void initComponents() {
      viewForm = new JFrame("Main Form");
      viewForm.setSize(200, 100);
      viewForm.setVisible(true);
      viewForm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
 
      JButton button = new JButton("Жми!");
      button.setVisible(true);
      button.setLocation(12, 12);
      button.setSize(165, 50);
      button.addActionListener(new ActionListener() {
 
         public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewForm, "Красавчик!",
                  "Warning", JOptionPane.WARNING_MESSAGE);
         }
 
      });
      viewForm.getContentPane().add(button);
      viewForm.getContentPane().add(new JLabel());
   }
 
   public void actionPerformed(ActionEvent action) {
   }
 
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new Button();
         }
      });
   }
}