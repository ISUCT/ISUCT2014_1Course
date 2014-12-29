/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Пакеты;

/**
 *
 * @author Администратор
 */
public class Calc {
    // y = (lg^2(a+x))/ (a+x)^2  
    // a = 2.0 xn = 1.2 xk = 4.2 dx = 0.6 x1 = 1.16 x2 = 1.32 x3 = 1.47 x4 = 1.65 x5 = 1.93
    public void taskBImproved(double[] x) {
       

        for (int i = 0; i < x.length; i++) {
            double y = calcFunction(x[i]);
            System.out.println("x=" + i + " , y=" + y);
        }
        //----------------------------------------------

    }

    public double calcFunction(double xlocal) {
        double alocal = 2.0;
        double y = Math.pow(Math.log(alocal+xlocal), 2)/Math.pow((alocal+xlocal), 2);
        return y;
    }

    public void taskASimple() {
        double xn = 1.2;
        double xk = 4.2;
        double dx = 0.6;

        for (double x = xn; x <= xk; x = x + dx) {
            double y = calcFunction(x);
            System.out.println("x=" + x + ",y=" + y);
        }
    }

    
}
