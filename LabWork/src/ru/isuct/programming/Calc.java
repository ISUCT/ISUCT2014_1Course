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

    public void taskSimple() {
        double a = 2.0;
        double b = 3.0;
        double x = 0.08;
        double y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 0.26;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 0.35;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 0.41;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 0.53;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
    }

    private double calcFunction(double a, double b, double x) {
        double y = Math.pow(Math.asin(x), a) + (Math.pow(Math.acos(x), b));
        System.out.println("x=" + x + " , y=" + y);
        return y;
    }

    public void TaskASimple() {
        double a = 2.0;
        double b = 3.0;
        double xn = 0.11;
        double xk = 0.36;
        double dx = 0.05;

        for (double x = xn; x <= xk; x += dx) {
            double y = calcFunction(a, b, x);
            System.out.println("x=" + x + " , y=" + y);
        }
    }

    public void taskImproved(double a, double b, double[] x) {
        for (int i = 0; i < x.length; i += 1) {
            double y = calcFunction(a, b, x[i]);
            System.out.println("x=" + x[i] + " , y=" + y);
        }
    }
}
