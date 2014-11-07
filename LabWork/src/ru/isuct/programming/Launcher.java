/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * 
 */
public class Launcher {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      SimpleTypes eTypes = new SimpleTypes ();
      eTypes.demo();
      SimpleArray eArray = new SimpleArray ();
      eArray.demo ();
     
      Calc myCalc = new Calc();
      myCalc.taskBSimple();
      
      myCalc.TaskASimple();
        // TODO code application logic here

      Player panasonic = new Player();
      panasonic.setName("Panasonic");
      panasonic.sayHello();
      panasonic.setTitleofsong(980665);
      int tos = panasonic.getTitleofsong();
      System.out.println("Titleofsong = "+ tos);

    }
}
