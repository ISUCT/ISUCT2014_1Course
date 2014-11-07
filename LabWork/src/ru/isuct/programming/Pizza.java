package ru.isuct.programming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Администратор
 */
    public class Pizza {
    private String name = "";
    private int weight;
    private int diametr = 30;
    private String greatling = "Приятного аппетита";
    
    public void setName (String aName){
        name = aName ;
    }
    public String getName (){
        return name;
    }
    public void setWeight (int aWeight){
        weight = aWeight;
    }
    public int getWeight (){
        return weight;
    }
    public void sayHello (){
        System.out.println (name + ", " + weight + " " + "грамм");
        System.out.println (greatling);
        
    }
    
}
