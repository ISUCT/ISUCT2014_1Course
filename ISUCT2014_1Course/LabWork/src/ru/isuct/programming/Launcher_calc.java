/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author balashovden
 */
public class Launcher_calc {
     public static void main(String[] args) {
        Calc myCalc = new Calc();
//        myCalc.taskBSimple();
        System.out.println("-----------------------");
        myCalc.taskASimple();
        System.out.println("---------------------");
        double[] x = {0.25,0.36,0.56,0.94,1.28};
        myCalc.taskBImproved(x);
    }
}
    
    
    
