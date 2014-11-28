/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming.sinksyte;

/**
 *
 * @author stud_5
 */
public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYorself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits
                == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}