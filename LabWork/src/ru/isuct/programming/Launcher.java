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
public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit krolik = new Rabbit();
        krolik.setName("krolik");
        krolik.sayHello();
        krolik.setAge(2);
        int spd = krolik.getAge();
        System.out.println("age= " + spd);
    }
}
