/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;
//y=(lg(x^2-1))/(log5(ax^2-b)
//числитель (lg(x^2-1))
//знаменатель (log5(ax^2-b)
//и все будет хорошо

/**
 *
 * @author user
 */
public class Calc {

    public void taskBSimple() {



        double a = 1.1;
        double b = 0.09;
        double x = 1.21;
        double y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
        x = 1.76;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
        x = 2.53;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
        x = 3.48;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
        x = 4.52;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
    }

    public void taskASimple() {

        double a = 1.1;
        double b = 0.09;
        double xn = 1.2;
        double xk = 0.95;
        double dx = 0.2;

        for (double x = xn; x <= xk; x = x + dx) { // x = x + dx === x+=dx
            double y = calcFunction(a, b, x);
            System.out.println("x=" + x + " , y=" + y);
        }
    }

    public double calcFunction(double aLocal, double bLocal, double xLocal) {
        double chisl = Math.log10(Math.pow((xLocal), 2) - 1);
        double znamen = (Math.log(aLocal * (Math.pow((xLocal), 2)) - bLocal) / Math.log(5));
        double y = chisl / znamen;
        return y;
    }
}