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
        double chisl = (a) + Math.pow((Math.tan(b * x)), 2);
        double znamen = (b) + Math.pow((1 / Math.tan(a * x)), 2);
        double y = chisl / znamen;
        System.out.println("x=" + x + " , y=" + y);
        
        x = 0.3;
        chisl = (a) + Math.pow((Math.tan(b * x)), 2);
        znamen = (b) + Math.pow((1 / Math.tan(a * x)), 2);
        y = chisl / znamen;
        System.out.println("x=" + x + " , y=" + y);
        
        x = 0.44;
        chisl = (a) + Math.pow((Math.tan(b * x)), 2);
        znamen = (b) + Math.pow((1 / Math.tan(a * x)), 2);
        y = chisl / znamen;
        System.out.println("x=" + x + " , y=" + y);
        
        x = 0.6;
        chisl = (a) + Math.pow((Math.tan(b * x)), 2);
        znamen = (b) + Math.pow((1 / Math.tan(a * x)), 2);
        y = chisl / znamen;
        System.out.println("x=" + x + " , y=" + y);
        
        x = 0.56;
        chisl = (a) + Math.pow((Math.tan(b * x)), 2);
        znamen = (b) + Math.pow((1 / Math.tan(a * x)), 2);
        y = chisl / znamen;
        System.out.println("x=" + x + " , y=" + y);
       
    }
}
