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
  private int numberofwheels;
    
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
     public void setNumberofwheels(int aNumberofwheels){
        numberofwheels = aNumberofwheels;
    }
    public int getNumberofwheels(){
        return numberofwheels;
    }
   
 }

