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
        double chisl = Math.log10(Math.pow((x), 2) - 1);
        double znamen = (Math.log(a * (Math.pow((x), 2)) - b) / Math.log(5));
        double y = chisl / znamen;
        System.out.println("x=" + x + " , y=" + y);

        x = 1.76;
        chisl = Math.log10(Math.pow((x), 2) - 1);
        znamen = (Math.log(a * (Math.pow((x), 2)) - b) / Math.log(5));
        y = chisl / znamen;
        System.out.println("x=" + x + " , y=" + y);
        x = 2.53;
        chisl = Math.log10(Math.pow((x), 2) - 1);
        znamen = (Math.log(a * (Math.pow((x), 2)) - b) / Math.log(5));
        y = chisl / znamen;
        System.out.println("x=" + x + " , y=" + y);
        x = 3.48;
        chisl = Math.log10(Math.pow((x), 2) - 1);
        znamen = (Math.log(a * (Math.pow((x), 2)) - b) / Math.log(5));
        y = chisl / znamen;
        System.out.println("x=" + x + " , y=" + y);
        x = 4.52;
        chisl = Math.log10(Math.pow((x), 2) - 1);
        znamen = (Math.log(a * (Math.pow((x), 2)) - b) / Math.log(5));
        y = chisl / znamen;
        System.out.println("x=" + x + " , y=" + y);
    }
}
