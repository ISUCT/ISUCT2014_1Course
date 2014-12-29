/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Пакеты;

/**
 *
 * @author Администратор
 */
public class Klaviatura {
    private String name = "";
    private int weight;
    private int dopknopki = 10;
    private String greatling = "Нажми на меня";
    
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
        System.out.println (name + ", " + weight );
        System.out.println (greatling);
        
    }
    
}
