/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author Администратор
 */
public class Player {
    private String name = "";
    private int titleofsong;
    private int numberofbuttons;
    private int size;
    private String greeting = "Hello, man";
    
    public void setName(String aName){
        name = aName;
    }
    public String getName(){
        return name;
    }
    public void setTitleofsong(int aTitleofsong){
        titleofsong = aTitleofsong;
    }
    public int getTitleofsong(){
        return titleofsong;
    }
    public void sayHello(){
        System.out.println(name + ' ' + greeting );
    }
}
