/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author stud_5
 */
public class Camera {
    String name ="Panasonik";
    private int speed;
    private int picturenumber;
    private int resolutionlevel;
    private String greeting ="Helloy";

public void setName(String aName){
name = aName;
 }

public String getName(){
    return name;
 }

public void setPicturenumber(int aPicturenumber){
 speed = aPicturenumber;
 }

 public int getPicturenumber(){
 return picturenumber;
 }
 
 public void sayHello(){
 System.out.println(name + " " + greeting );
 }
} 

