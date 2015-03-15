/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author User-PC
 */
public class main {
    public static void main (String[] args) {
        TemperatureConverter my = new TemperatureConverter();
        System.out.println(my.convertTemp(36,'С'));
       
        System.out.println(my.convertTemp(36,'F'));
         
        
    }
    
}
