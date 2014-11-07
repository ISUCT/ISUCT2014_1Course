/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author jskonst
 */
public class Launcher_for_pizza {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza myPizza = new Pizza();
        myPizza.setName("Пеперони");
        myPizza.setWeight(350);
        myPizza.sayHello();
      
    }
}
