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
        double chisl = Math.abs(a - b * x);
        double znamen = Math.pow((Math.log(x)), 3);

        double y = Math.pow(chisl / znamen, (1 / 2.0));
        System.out.println("x=" + x + " , y=" + y);

        x = 2.8;
        chisl = Math.abs(a - b * x);
        znamen = Math.pow((Math.log(x)), 3);
        y = Math.pow(chisl / znamen, (1 / 2.0));
        System.out.println("x=" + x + " , y=" + y);
        
        x=3.9;
        chisl = Math.abs(a - b * x);
        znamen = Math.pow((Math.log(x)), 3);
       y = Math.pow(chisl / znamen, (1 / 2.0));
        System.out.println("x=" + x + " , y=" + y);
        
        x= 4.7;
        chisl = Math.abs(a - b * x);
        znamen = Math.pow((Math.log(x)), 3);
        y = Math.pow(chisl / znamen, (1 / 2.0));
        System.out.println("x=" + x + " , y=" + y);
        
        x= 3.16;
        chisl = Math.abs(a - b * x);
        znamen = Math.pow((Math.log(x)), 3);
        y = Math.pow(chisl / znamen, (1 / 2.0));
        System.out.println("x=" + x + " , y=" + y);
       
    }
}
