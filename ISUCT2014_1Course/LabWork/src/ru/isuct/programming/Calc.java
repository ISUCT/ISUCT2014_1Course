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
public class Calc {
    // y = Math.pow(b,3)+(Math.pow(Math.sin(a*x)),2)/Math.acos(x*b*x)*e в степен (-x/2) 
    // a = 1.2 b = 0.48  xn = 0.7  xk = 2.2 dx = 0.3 x1 = 0.25 x2 = 0.36 x3 = 0.56 x4 = 0.94 x5 = 1.28
    public void taskBImproved(double[] x) {
       

        for (int i = 0; i < x.length; i++) {
            double y = calcFunction(x[i]);
            System.out.println("x=" + i + " , y=" + y);
        }
        //----------------------------------------------

    }

    public double calcFunction(double xlocal) {
        double alocal = 1.2;
        double blocal = 0.48;
        double n_sin = alocal*xlocal;
        double n_acos = xlocal*blocal*xlocal; 
        double y;
        y = (Math.pow(blocal,3)+(Math.pow(Math.sin(n_sin),2)))/
                (Math.acos(n_acos)*(Math.exp(-xlocal/2)));
        return y;
    }

    public void taskASimple() {
        double xn = 0.7;
        double xk = 2.2;
        double dx = 0.3;

        for (double x = xn; x <= xk; x = x + dx) {
            double y = calcFunction(x);
            System.out.println("x=" + x + ",y=" + y);
        }
    }

    
}
