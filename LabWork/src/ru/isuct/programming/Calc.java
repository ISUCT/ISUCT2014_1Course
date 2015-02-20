/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

/**
 *
 * @author user
 */
public class CalcTest {
    
    public CalcTest() {
    }
    
    
    public static void setUpClass() {
    }
    
    
    public static void tearDownClass() {
    }
   
    public void setUp() {
    }
    
    
    public void tearDown() {
    }

    /**
     * Test of taskBSimple method, of class Calc.
     */
   
    public void testTaskBSimple() {
        System.out.println("taskBSimple");
        Calc instance = new Calc();
        instance.taskBSimple();
        
    }

    /**
     * Test of calcFunction method, of class Calc.
     */
    
    public void testCalcFunction() {
        System.out.println("calcFunction");
        double aLocal = 0.1;
        double bLocal = 0.5;
        double xLocal = 0.2;
        Calc instance = new Calc();
        double expResult = 4.402975341621186E-5;
        double result = instance.calcFunction(aLocal, bLocal, xLocal);
        assertEquals(expResult, result, 0.0);
      
    }

    /**
     * Test of taskASimple method, of class Calc.
     */
    
    }

    /**
     * Test of taskBImproved method, of class Calc.
     */
    
    

