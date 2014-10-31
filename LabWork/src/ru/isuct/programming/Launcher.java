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
public class Launcher {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleTypes sTypes = new SimpleTypes();
        sTypes.demo ();
        SimpleArray sArray = new SimpleArray();
        sArray.demo();
        
        Car Mersedes = new Car();
        Mersedes.setName("Mersedes");
        Mersedes.sayHello();
        Mersedes.setSpeed(60);
        int spd = Mersedes.getSpeed();
        System.out.println("Speed = "+ spd);
  
      }
}

