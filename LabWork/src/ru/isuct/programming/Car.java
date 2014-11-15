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
public class Car {
    private String name = "Car";
    private int numberofwheels;
    private int model;
    private int size;
    private String greeting = "Hi";
    
    public void setName(String aName){
        name = aName;
    }
    public String getName(){
        return name;
    }
    public void setNumberofwheels(int aNumberofwheels){
        numberofwheels = aNumberofwheels;
    }
    public int getNumberofwheels(){
        return numberofwheels;
    }
    public void sayHello(){
        System.out.println(name + ' ' + greeting );
    }
}