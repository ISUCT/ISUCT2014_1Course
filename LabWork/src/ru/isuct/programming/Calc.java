/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author user
 */
public class Calc {

    public void taskBSimple() {
        // Вычисляем таблицу значений функции
        //     (sin(x)^2 + корень 3 степени a *x -b)
        // у =  -------------------------------------
        //              log x по основанию 5
        // a = 2.8
        // b = 2.5
        // для точек: 
        // x = 2 
        // x = 3
        // x = 4 
        // x = 5
        double a = -2.5;
        double b = 6.3;
        double x = 5.25;
        double y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        a = -2.5;
        x = 6.45;
        y = Math.pow((Math.log(Math.pow(a, 2) + x)), 2);
        System.out.println("x=" + x + " , y=" + y);

        a = -2.5;
        x = 7.24;
        y = Math.pow((Math.log(Math.pow(a, 2) + x)), 2);
        System.out.println("x=" + x + " , y=" + y);

        a = -2.5;
        x = 7.87;
        y = Math.pow((Math.log(Math.pow(a, 2) + x)), 2);
        System.out.println("x=" + x + " , y=" + y);
    }

    private double calcFunction(double a, double b, double x) {
        double y = Math.pow((Math.log(Math.pow(a, 2) + x)), 2);
        return y;
    }

    public void taskASimple() {
        double a = -2.5;
        double b = 6.3;
        double xn = 5;
        double xk = 10;
        double dx = 0.5;
        for (double x = xn; x <= xk; x += dx) {
            double y = calcFunction(a, b, x);
            System.out.println("x=" + x + " , y=" + y);
        }
    }
}
