package ru.isuct.programming;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Stud_5
 */
public class Calc {

    public void taskBSimple() {
// Вычисляем таблицу значений функции 
//    a^x-b^x
//y=-----------*(a*b)^1/3
//   log(a/b)по основанию 10
// a = 0.4
// b = 0.8
// для точек:
// x = 4.48
// x = 3.56
// x = 2.78
// x = 5.28
// x = 3.21
        double a = 0.4;
        double b = 0.8;
        double x = 4.48;
        double y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
        x = 3.56;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
        x = 2.78;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
        x = 5.28;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
        x = 3.21;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
    }

    public double calcFunction(double a, double b, double x) {
        double chisl = (Math.pow(a, x) - Math.pow(b, x)) * Math.pow(a * b, 1 / 3);
        double znamen = (Math.log(a / b)) / (Math.log(10));
        double y = chisl / znamen;
        return y;
    }

    public void taskA(double a, double b, double xn, double xk, double xd) {
// Вычисляем таблицу значений функции 
//    a^x-b^x
//y=-----------*(a*b)^1/3
//   log(a/b)по основанию 10
// a = 0.4
// b = 0.8
// для точек:
// x = 4.48
// x = 3.56
// x = 2.78
// x = 5.28
// x = 3.21
        for (double x = xn; x <= xk; x = x + xd) {
            double y = calcFunction(a, b, x);
            System.out.println("x=" + x + " , y=" + y);
        }
    }

    public double[] taskB(double a, double b, double[] x) {
// Вычисляем таблицу значений функции 
//    a^x-b^x
//y=-----------*(a*b)^1/3
//   log(a/b)по основанию 10
// для точек передаваемых в массиве x
        double[] y = new double[x.length];
        for (int i = 0; i < x.length; i+=1) {
             y[i] = calcFunction(a, b, x[i]);
        }
        return y;
    }

    public void taskA() {
// Вычисляем таблицу значений функции 
//    a^x-b^x
//y=-----------*(a*b)^1/3
//   log(a/b)по основанию 10
// a = 0.4
// b = 0.8
// для точек:
// x = 4.48
// x = 3.56
// x = 2.78
// x = 5.28
// x = 3.21
        double a = 0.4;
        double b = 0.8;
        double xn = 3.2;
        double xk = 6.2;
        double xd = 0.6;
        for (double x = xn; x <= xk; x = x + xd) {
            double y = calcFunction(a, b, x);
            System.out.println("x=" + x + " , y=" + y);

        }
    }
}
