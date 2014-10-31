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
    public void taskBSimple(){
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
double chisl = (Math.pow(a,x)-Math.pow(b,x))*Math.pow(a*b,1/3);
double znamen = (Math.log(a/b))/(Math.log(10));
double y = chisl/znamen;
System.out.println("x="+x+" , y="+y);
x = 3.56;
chisl = (Math.pow(a,x)-Math.pow(b,x))*Math.pow(a*b,1/3);
znamen = (Math.log(a/b))/(Math.log(10));
y = chisl/znamen;
System.out.println("x="+x+" , y="+y);
x = 2.78;
chisl = (Math.pow(a,x)-Math.pow(b,x))*Math.pow(a*b,1/3);
znamen = (Math.log(a/b))/(Math.log(10));
y = chisl/znamen;
System.out.println("x="+x+" , y="+y);
x = 5.28;
chisl = (Math.pow(a,x)-Math.pow(b,x))*Math.pow(a*b,1/3);
znamen = (Math.log(a/b))/(Math.log(10));
y = chisl/znamen;
System.out.println("x="+x+" , y="+y);
x = 3.21;
chisl = (Math.pow(a,x)-Math.pow(b,x))*Math.pow(a*b,1/3);
znamen = (Math.log(a/b))/Math.log(10);
y = chisl/znamen;
System.out.println("x="+x+" , y="+y);
    }
}
