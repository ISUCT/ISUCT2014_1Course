/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming.sinksyte;

/**
 *
 * @author Администратор
 */
public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    private int[] locationCelss;
    
    public void setLocationCells (int[]locs) {
        locationCelss = locs;
    }
    
    public String checkYourself (String stringGuess){
        int guess = Integer.parseInt (stringGuess);
        String result = "Мимо";
        for (int cell : locationCells){
            if (guess == cell){
                result = "Попал";
                numOfHits++;
                break;
                
                
            }
        }
        if (numOfHits == locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
            return result;
        
    }

    String checkYorself(String userGuess) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
