/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author Stud_5
 */
public class Car {
  private String   name = "Mersedes";
  private int speed;
  private int memory;
  private String greeting = "vzvzvz";
  
    
     public void setName(String aName){
         name = aName;
     }
     public String getName(){
              return name;
     }
     public void setSpeed(int aSpeed){
         speed = aSpeed;
     }
     public int getSpeed(){
         return speed;
       
       
    } 
     public void sayHello(){
         System.out.println(name + " " + greeting );
     }
    
   
 }
