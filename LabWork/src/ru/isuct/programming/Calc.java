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

    public void taskBSimpel() {
        double a = 2.2;
        double b = 3.78;
        double x = 4.51;
        double y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 3;
        System.out.println("x=" + x + " , y=" + y);

        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 4;
        System.out.println("x=" + x + " , y=" + y);

        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 5;
        System.out.println("x=" + x + " , y=" + y);

        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
    }

    private double calcFunction(double a, double b, double x) {
        double chisl = 1 + Math.pow(Math.log10(x / a), 2);
        double znamen = b - (Math.exp(x / a));
        double y = chisl / znamen;
        System.out.println("x=" + x + " , y=" + y);
        return y;

    }

    public void taskASimpel() {
        double a = 2.0;
        double b = 0.95;
        double xn = 1.25;
        double xk = 2.75;
        double dx = 0.3;

        for (double x = xn; x <= xk; x += dx) {
            double y = calcFunction(a, b, x);
            System.out.println("x=" + x + " , y=" + y);
        }
    }
}
