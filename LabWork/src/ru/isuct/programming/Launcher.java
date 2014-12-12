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
  
      SimpleTypes eTypes = new SimpleTypes ();
      eTypes.demo();
      SimpleArray eArray = new SimpleArray ();
      eArray.demo ();
     
      Calc myCalc = new Calc();
      myCalc.taskBSimple();
      
      myCalc.TaskASimple();
      
      double[] x = {0.1,0.3,0.4,0.45,0.65};
      myCalc.taskBImproved(2.2, 3, x);
        // TODO code application logic here

      Car audi = new Car();
      audi.setName("Car");
      audi.sayHello();
      audi.setNumberofwheels(4);
      int now = audi.getNumberofwheels();
      System.out.println("Numberofwheels = "+ now);

    }
}
