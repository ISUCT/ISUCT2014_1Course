/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author Stud_5
 */
public class Student {

    private String name = " ";
    private int age;
    private int course;
    private int raiting;
    private String greeting = "Let's go!";

    public void setAge(int aAge) {
        age = aAge;
    }

    public int getAge() {
        return age;
    }

    public void setName(String aName) {
        name = aName;
    }
}
