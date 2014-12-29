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
import java.util.*;

public class DotComBust {
    private final GameHelper helper = new GameHelper();
    private final ArrayList<DotCom> dotComsList = new ArrayList<>();
    private int numOfGuesses = 0;
    
    private void setUpGame(){
        // Создадим несколько сайтов и присвоим им адреса
        DotCom one = new DotCom ();
        one.setName ("Pets.com");
        DotCom two = new DotCom ();
        two.setName ("eToys.com");
        DotCom three = new DotCom ();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        
        System.out.println("Ваша цель - потопить три сайта.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");
        
          for (DotCom dotComSet : dotComsList) {
              
              ArrayList<String> newLocation = helper.placeDotCom(3);
              
              dotComSet.setLocationCells(newLocation);
          }
    }
    private void startPlaying(){
        while (!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput ("Сделайте ход");
            checkUserGuess (userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom dotComTest : dotComsList) {
            result = dotComTest.checkYourself(userGuess);
            if (result.equals ("Попал")) {
                break;
            }
            if (result.equals ("Потопил")){
                boolean remove = dotComsList.remove(dotComTest);
                break;
            }
        }
        System.out.println (result);
    }
    private void finishGame(){
        System.out.println ("fubar");
        if (numOfGuesses <=18){
            System.out.println ("Это заняло у вас всго" + numOfGuesses + "попыток");
        } else {
            System.out.println ("Это заняло у вас довольно много времени." + numOfGuesses + "попыток");
            System.out.println ("Рыбы водят хороводы вокруг ваших вложений");
        }
    }
    public static void main(String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}

    

                
                
            
            
        
    
        
 
    
    


    
    
    
    
    
    
    
    
    
   
              
          
        
    
    
    
    

