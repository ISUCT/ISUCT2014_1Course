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
    public void taskBSimple(){
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
        double a = 2.8;
        double b = 2.5;
        double x = 2;
        double chisl = Math.pow(Math.sin(x),2) + Math.pow((a*x -b),(1/3));
        double znamen = (Math.log(x))/(Math.log(5));
        double y = chisl/znamen;
        System.out.println("x="+x+" , y="+y);
        
        x = 3;
        chisl = Math.pow(Math.sin(x),2) + Math.pow((a*x -b),(1/3));
        znamen = (Math.log(x))/(Math.log(5));
        y = chisl/znamen;
        System.out.println("x="+x+" , y="+y);
        
        x = 4;
        chisl = Math.pow(Math.sin(x),2) + Math.pow((a*x -b),(1/3));
        znamen = (Math.log(x))/(Math.log(5));
        y = chisl/znamen;
        System.out.println("x="+x+" , y="+y);
        
        x = 5;
        chisl = Math.pow(Math.sin(x),2) + Math.pow((a*x -b),(1/3));
        znamen = (Math.log(x))/(Math.log(5));
        y = chisl/znamen;
        System.out.println("x="+x+" , y="+y);
    }
}
