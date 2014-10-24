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
public class Rocket {
    private String name = "";
    private int speed;
    private int fuelLevel;
    private String greeting = "Poexali";
    
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
