/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author stud_5
 */
public class Dog {
    String name = "Gera";
    private int size;
    private int parode;
    private int age;
    private String greeting = "gaf-gaf";
    
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
