package ru.isuct.programming;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stud_5
 */
public class Calc {

    public void taskBSimple() {
        //Вычисляем таблицу значений функции
        //((x-a)^2)^(1/3) + (x+b)^ (1/5)
        // y = ----------------------------
        // ((x^2)-(a+b)^2)^(1/9)
        // a = 0.8
        // b = 0.4
        // для точек :
        // x = 1.88
        // x = 2.26
        // x = 3.84
        // x = 4.55
        // x = -6.21 
        double a = 0.8;
        double b = 0.4;
        double x = 1.88;
        double y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);



        x = 2.26;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);

        x = 3.84;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);




        x = 4.55;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);


        x = -6.21;
        y = calcFunction(a, b, x);
        System.out.println("x=" + x + " , y=" + y);




    }

    private double calcFunction(double a, double b, double x) {
        double chisl = Math.pow((x - a), (1 / 3)) + Math.pow((x + b), (1 / 5));
        double znamen = Math.pow(Math.pow(x, 2) - Math.pow((a + b), 2), (1 / 9));
        double y = chisl / znamen;
        return y;

    }


    public void taskASimple() {
        //Вычисляем таблицу значений функции
        //((x-a)^2)^(1/3) + (x+b)^ (1/5)
        // y = ----------------------------
        // ((x^2)-(a+b)^2)^(1/9)
        // a = 0.8
        // b = 0.4

        double a = 0.8;
        double b = 0.4;
        double xn = 1.23;
        double xk = 7.23;
        double dx = 1.2;

        for (double x = xn; x <= xk; x = x + dx) {
            double y = calcFunction(a, b, x);
            System.out.println("x=" + x + " , y=" + y);
            
        }
    }
}
