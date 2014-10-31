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
//        SimpleTypes sTypes = new SimpleTypes();
//        sTypes.demo();
//        SimpleArray sArray = new SimpleArray();
//        sArray.demo();
        // TODO code application logic here
        Camera myCam = new Camera();
        myCam.sayHello();
        Camera Panasonik = new Camera();
 Panasonik.setName("Panasonik");
 Panasonik.sayHello();
 Panasonik.setPicturenumber(5);
 int spd = Panasonik.getPicturenumber();
 System.out.println("Picturenumber = "+ spd);
    }
}
