/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author jskonst
 */
public class SimpleArray {
     public void demo(){
          int[] arr = new int [5];
          arr[0] = 1;
          arr[1] = 2;
          arr[2] = 3;
          arr[3] = 4;
          arr[4] = 5;
          int x = 0;
         while (x < arr.length) 
           System.out.println("arr["+x+" = "+ arr[x]);
         x = x + 1;             
    }
}
