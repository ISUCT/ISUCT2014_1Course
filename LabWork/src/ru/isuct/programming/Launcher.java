/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author jskonst
 */
public class Launcher {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        SimpleTypes  sTypes = new SimpleTypes();
//        sTypes.demo();
//        SimpleArray  sArray = new SimpleArray();
//        sArray.demo();
//        // TODO code application logic here
//        Bag b1 = new Bag();
//        b1.setName("sumka");
//        System.out.println(b1.getName());
//        
//       Calc myCalc = new Calc();
//        myCalc.taskBSimple();
//        System.out.println("---------------------");
//        myCalc.taskASimple();
//         
//        System.out.println("---------------------");
//        double[] x = {1,2,3,4,5,6,7};
//        myCalc.taskBImproved(2.2, 3, x);
        CalcGui panel = new CalcGui();
       JFrame frame = new JFrame();
           
      frame.getContentPane().setLayout(new FlowLayout());
       frame.add(panel);
       
       frame.setVisible(true); 

    }
}
