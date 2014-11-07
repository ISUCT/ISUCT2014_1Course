/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author stud_5
 */
public class Computer {
    String name ="LG";
    private int speed;
    private int Hardspace;
    private int resolutionlevel;
    private String greeting ="Helloy";

public void setName(String aName){
name = aName;
 }

public String getName(){
    return name;
 }

public void setHardspace(int aHardspace){
 speed = aHardspace;
 }

 public int getHardspace(){
 return Hardspace;
 }
 
 public void sayHello(){
 System.out.println(name + " " + greeting );
 }
}
