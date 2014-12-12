/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;



public class Calc {

    public void taskBSimple() {
        double a = 2.9;
        double b = 3.5;
        double x = 9.1;
        double chisl = Math.log(Math.abs(Math.pow(b, 2) - Math.pow(x, 2))) / Math.log(a);
        double znamen = Math.pow(Math.abs(Math.pow(x, 2) - Math.pow(a, 2)), (1 / 5));
        double y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 4;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 6.2;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 0.39;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 0.89;
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
        double a = 2.2;
        double b = 5.1;
        double xn = 0.03;
        double xk = 5.01;
        double dx = 0.6;

        for (double x = xn; x <= xk; x += dx) {
            double y = calcFunction(a, b, x);
            System.out.println("x=" + x + " , y=" + y);


        }



    }

    public void taskBImproved(double a, double b, double [] x) {
        for (int i = 0; i < x.length; i+=1) {
        double y = calcFunction(a, b, x [i]);
        System.out.println("x=" + x[i] + " , y=" + y);
        
        
        
    }
}
}

