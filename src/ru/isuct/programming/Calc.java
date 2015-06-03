/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author stud_5
 */
public class Calc implements Serializable {

    public void taskBSimple() {
        double a = 2.0;
        double b = 1.1;
        double x = 0.1;
        double chisl = Math.log(Math.abs(Math.pow(b, 2) - Math.pow(x, 2))) / Math.log(a);
        double znamen = Math.pow(Math.abs(Math.pow(x, 2) - Math.pow(a, 2)), (1 / 5));
        double y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 3;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 0.4;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 0.45;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 0.65;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);


    }

    public double calcFunction(double a, double b, double x) {
        double chisl = Math.log(Math.abs(Math.pow(b, 2) - Math.pow(x, 2))) / Math.log(a);
        double znamen = Math.pow(Math.abs(Math.pow(x, 2) - Math.pow(a, 2)), (1 / 5));
        double y = chisl / znamen;
        return y;


    }

    public void TaskASimple() {
        double a = 2.0;
        double b = 1.1;
        double xn = 0.08;
        double xk = 1.08;
        double dx = 0.2;

        for (double x = xn; x <= xk; x += dx) {
            double y = calcFunction(a, b, x);
            System.out.println("x=" + x + " , y=" + y);
             
        }
       
    }
     
    public ArrayList TaskASimple(double a, double b, double xn, double xk, double dx) {
       ArrayList y = new ArrayList();
        for (double x = xn; x <= xk; x += dx) {
            y.add(calcFunction(a, b, x));
            
        }
        return y;
               
    }
    public void taskBImproved(double a, double b, double [] x) {
        for (int i = 0; i < x.length; i+=1) {
        double y = calcFunction(a, b, x [i]);
        System.out.println("x=" + x[i] + " , y=" + y);
        
        
        
        
        
    }
}
}