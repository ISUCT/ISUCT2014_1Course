/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author Stud_5
 */
public class Calc {

    public void taskBSimple() {
        // Вычисляем таблицу значений функции
        // a=7.2
        // b=4.2
        //               |a-bx|
        // y= корень из ----------
        //        lg 3 степени по основанию х
        // для точек:
        // х=2.4
        // х=2.8
        // х=3.9
        //х=4.7
        // х=3.16
        double a = 7.2;
        double b = 4.2;
        double x = 2.4;
        double y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 2.8;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 3.9;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 4.7;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 3.16;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

    }

    public double calcFunction(double a, double b, double x) {
        double chisl = Math.abs(a - b * x);
        double znamen = Math.pow((Math.log(x)), 3);
        double result = Math.pow(chisl / znamen, (1 / 2.0));
        return result;

    }

    public void taskASimle() {



        // Вычисляем таблицу значений функции
        // a=7.2
        // b=4.2
        //               |a-bx|
        // y= корень из ----------
        //        lg 3 степени по основанию х
        // a = 7.2;
        // b = 4.2;
        double a = 7.2;
        double b = 4.2;
        double xn = 1.81;
        double xk = 5.31;
        double dx = 0.7;
        for (double x = xn; x <= xk; x = x + dx) {
            double y = calcFunction(a, b, x);
            System.out.println("x=" + x + " , y=" + y);
            
        }
    }
    
    public void taskBImproved(double a, double b, double[] x) {
           for (int i = 0; i < x.length; i+=1) {
            double y = calcFunction(a, b, x[i]);
            System.out.println("x=" + x[i] + " , y=" + y);
        }
    }
}   
    

