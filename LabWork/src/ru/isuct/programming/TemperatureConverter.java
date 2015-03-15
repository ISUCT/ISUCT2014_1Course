/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author User-PC
 */
public class TemperatureConverter {
    public String convertTemp(double temperature, char convertTo) {
        String conv=""+temperature;
        if (convertTo == 'F') {
            conv+=" C";//если переводим в фаренгейты,значит подаем цельсии, в строку добавляем С
            temperature = temperature*9 / 5 + 32;//цельсий =(фаренгейт — 32)
        } else {
            conv+=" F";//если переводим в цельсии,значит подаем фаренгейты, в строку добавляем F
            temperature =((temperature - 32) * 5) / 9;//фаренгейт = цельсий + 32
        }
        conv+=" = "+temperature+" "+convertTo;//добавляем в строку полученное значение температуры и букву, которую подавали
        return conv;
    }
    }
    

