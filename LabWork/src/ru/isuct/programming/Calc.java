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
        //   (a+(tg)^2*b*x)
        //y=  -------------
        //   (B+(ctg)^2*a*x)
        // a = 0.1
        // b = 0.5
        // для точек:
        // x = 0.2
        // x = 0.3
         // x = 0.44
        // x = 0.6
        // x = 0.56
        double a = 0.1;
        double b = 0.5;
        double x = 0.2;
        double y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 0.3;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 0.44;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 0.6;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 0.56;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

    }

    public double calcFunction(double aLocal, double bLocal, double xLocal) {
        double chisl = (aLocal) + Math.pow((Math.tan(bLocal * xLocal)), 2);
        double znamen = (bLocal) + Math.pow((1 / Math.tan(aLocal * xLocal)), 2);
        double result = chisl / znamen;
        return result;
    }

    public void taskASimple() {
        // Вычисляем таблицу значений функции
        //   (a+(tg)^2*b*x)
        //y=  -------------
        //   (B+(ctg)^2*a*x)
        // a = 0.1
        // b = 0.5
        double a = 0.1;
        double b = 0.5;
        double xn = 0.15;
        double xk = 1.37;
        double dx = 0.25;

        for (double x = xn; x <= xk; x = x + dx) {// x= x + dx === x+=dx
            double y = calcFunction(a, b, x);
            System.out.println("x=" + x + " , y=" + y);
        }
    }

    public void taskBImproved(double a, double b, double[] x) {
        // Вычисляем таблицу значений функции
        //   (a+(tg)^2*b*x)
        //y=  -------------
        //   (B+(ctg)^2*a*x)
        // для точек передаваемых в массиве x
        for (int i = 0; i < x.length; i += 1) {
            double y = calcFunction(a, b, x[i]);
            System.out.println("x=" + x[i] + " , y=" + y);
        }

    }
}