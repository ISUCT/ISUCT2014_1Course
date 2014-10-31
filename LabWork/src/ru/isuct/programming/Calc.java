/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author stud_5
 */
public class Calc {
    public void taskBSimple(){
        double a = 2.0;
        double b = 1.1;
        double x = 0.1;
        double chisl = Math.log(Math.abs(Math.pow(b, 2)-Math.pow(x, 2)))/Math.log(a);
        double znamen = Math.pow(Math.abs(Math.pow(x, 2)-Math.pow(a, 2)),(1/5));
        double y = chisl/znamen;
        System.out.println("x="+x+" , y="+y);
        
         x = 3;
         chisl = Math.log(Math.abs(Math.pow(b, 2)-Math.pow(x, 2)))/Math.log(a);
         znamen = Math.pow(Math.abs(Math.pow(x, 2)-Math.pow(a, 2)),(1/5));
         y = chisl/znamen;
        System.out.println("x="+x+" , y="+y);
        
        x = 0.4;
         chisl = Math.log(Math.abs(Math.pow(b, 2)-Math.pow(x, 2)))/Math.log(a);
         znamen = Math.pow(Math.abs(Math.pow(x, 2)-Math.pow(a, 2)),(1/5));
         y = chisl/znamen;
        System.out.println("x="+x+" , y="+y);
        
        x = 0.45;
         chisl = Math.log(Math.abs(Math.pow(b, 2)-Math.pow(x, 2)))/Math.log(a);
         znamen = Math.pow(Math.abs(Math.pow(x, 2)-Math.pow(a, 2)),(1/5));
         y = chisl/znamen;
        System.out.println("x="+x+" , y="+y);
        
        x = 0.65;
         chisl = Math.log(Math.abs(Math.pow(b, 2)-Math.pow(x, 2)))/Math.log(a);
         znamen = Math.pow(Math.abs(Math.pow(x, 2)-Math.pow(a, 2)),(1/5));
         y = chisl/znamen;
        System.out.println("x="+x+" , y="+y);
        
    }
    
    
}
