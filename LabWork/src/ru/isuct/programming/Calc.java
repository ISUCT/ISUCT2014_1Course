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
        //     y = ((arcsin в квадрате)X + (arccos в степени 4)Х)в кубе
        //------------------------------------------------

        double x = 0.1;

        double y = Math.pow((Math.pow((Math.asin(x)),2))+
                            (Math.pow((Math.acos(x)),4)),
                            3) ;
        System.out.println("x="+x+" , y="+y);
        
        //----------------------------------------------
        x = 0.35;

        y = Math.pow((Math.pow((Math.asin(x)),2))+
                     (Math.pow((Math.acos(x)),4)),
                     3) ;
        System.out.println("x="+x+" , y="+y);
        
        //------------------------------------------------------
        
        x = 0.4;

        y = Math.pow((Math.pow((Math.asin(x)),2))+
                     (Math.pow((Math.acos(x)),4)),
                     3) ;
        System.out.println("x="+x+" , y="+y);
        
        //--------------------------------------------------------------
        
        
        x = 0.55;

        y = Math.pow((Math.pow((Math.asin(x)),2))+
                     (Math.pow((Math.acos(x)),4)),
                     3) ;
        System.out.println("x="+x+" , y="+y);
        
        //-------------------------------------------------------------
        
        
        x = 0.6;

        y = Math.pow((Math.pow((Math.asin(x)),2))+
                     (Math.pow((Math.acos(x)),4)),
                     3) ;
        System.out.println("x="+x+" , y="+y);
        

    }
}
