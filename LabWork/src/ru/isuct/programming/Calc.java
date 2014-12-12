package ru.isuct.programming;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
        double a = 2.8;
        double b = 2.5;
        double x = 2;
        double y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 3;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 4;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 5;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);
    }

    public void taskBImproved(double a, double b, double[] x) {
        // Вычисляем таблицу значений функции
        //     (sin(x)^2 + корень 3 степени a *x -b)
        // у =  -------------------------------------
        //              log x по основанию 5
        // для точек передаваемых в массиве х
        for (int i = 0; i < x.length; i+=1) {
            double y = calcFunction(a, b, x[i]);
            System.out.println("x=" + x[i] + " , y=" + y);
        }

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
        //     (sin(x)^2 + корень 3 степени a *x -b)
        // у =  -------------------------------------
        //              log x по основанию 5
        // a = 2.8
        // b = 2.5

        double a = 2.8;
        double b = 2.5;
        double xn = 1;
        double xk = 10;
        double dx = 1;

        for (double x = xn; x <= xk; x = x + dx) { // x = x + dx === x+=dx
            double y = calcFunction(a, b, x);
            System.out.println("x=" + x + " , y=" + y);
        }

    }

    public double calcFunction(double aLocal, double bLocal, double xLocal) {
        double chisl = Math.pow(Math.sin(xLocal), 2) + Math.pow((aLocal * xLocal - bLocal), (1 / 3));
        double znamen = (Math.log(xLocal)) / (Math.log(5));
        double result = chisl / znamen;
        return result;
    }

}
