/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author jskonst
 */
public class Launcher {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleTypes sType= new SimpleTypes();
        sType.demo();
        SimpleArray sArray=new SimpleArray();
        sArray.demo();
        
     Calc myCalc = new Calc();
     myCalc.taskBSimple();
    System.out.println("---------------------");
    myCalc.taskASimple();
    
    
    System.out.println("---------------------");
    double[] x = {1,2,3,4,5,6,7};
    myCalc.taskBImproved(2.2, 3, x);}
    
}
