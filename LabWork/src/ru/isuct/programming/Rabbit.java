/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author stud_5
 */
public class Rabbit {
  private String name = "";
    private int age;
    private int weight;
    private String greeting = "Jump Jump";
    
    public void setName(String aName){
        name = aName;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int aAge){
        age = aAge;
    }
    
    public int getAge(){
        return age;
    }
    
    public void sayHello(){
        System.out.println(name + " " + greeting );
    }
}

