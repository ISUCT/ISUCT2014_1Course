/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author Администратор
 */
public class Launcher_for_calc {
    public static void main(String[] args) {
        Calc myCalc = new Calc();
//        myCalc.taskBSimple();
        System.out.println("-----------------------");
        myCalc.taskASimple();
        System.out.println("---------------------");
        double[] x = {0.1,0.35,0.4,0.55,0.6,};
        myCalc.taskBImproved(x);
    }
    
}
