/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author stud_5
 */
public class Calc { 
        public void taskSimple (){
        double a = 2.0;
        double b = 3.0;
        double x = 0.08;
        double y = Math.pow(Math.asin(x),a) + (Math.pow(Math.acos(x),b));
       System.out.println("x="+x+" , y="+y);
       
      x=0.26;
      y = Math.pow(Math.asin(x),a) + (Math.pow(Math.acos(x),b));
      System.out.println("x="+x+" , y="+y);
      
    x=0.35;
    y = Math.pow(Math.asin(x),a) + (Math.pow(Math.acos(x),b));
      System.out.println("x="+x+" , y="+y);
      
      x=0.41;
       y = Math.pow(Math.asin(x),a) + (Math.pow(Math.acos(x),b));
      System.out.println("x="+x+" , y="+y);  
      
      x=0.53;
      y = Math.pow(Math.asin(x),a) + (Math.pow(Math.acos(x),b));
      System.out.println("x="+x+" , y="+y);
  }    
}
