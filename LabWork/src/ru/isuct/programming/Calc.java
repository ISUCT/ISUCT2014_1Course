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

    public void taskBImproved(double[] x) {
        // Вычисляем таблицу значений функции
        //     y = ((arcsin в квадрате)X + (arccos в степени 4)Х)в кубе
        //------------------------------------------------

        for (int i = 0; i < x.length; i++) {
            double y = calcFunction(x[i]);
            System.out.println("x=" + i + " , y=" + y);
        }
    }

    public double calcFunction(double xlocal) {
        double y = Math.pow((Math.pow((Math.asin(xlocal)), 2))
                + (Math.pow((Math.acos(xlocal)), 4)),
                3);
        return y;
    }

    public void taskASimple(double xn, double xk, double dx) {


        for (double x = xn; x <= xk; x = x + dx) {
            double y = calcFunction(x);
            System.out.println("x=" + x + ",y=" + y);
        }
    }

}
