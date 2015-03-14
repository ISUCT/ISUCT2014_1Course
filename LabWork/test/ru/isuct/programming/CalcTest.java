/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stud_5
 */
public class CalcTest {
    
    public CalcTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testTaskASimple() {
        System.out.println("taskASimple");
        Calc instance = new Calc();
        instance.taskASimple();
        
        
    }

    /**
     * Test of calcFunction method, of class Calc.
     */
    @Test
    public void testCalcFunction() {
        System.out.println("calcFunction");
        double aLocal = 5;
        double bLocal = 6;
        double xLocal = 3;
        Calc instance = new Calc();
        double expResult = 0.39673612833564886;
        double result = instance.calcFunction(aLocal, bLocal, xLocal);
        assertEquals(expResult, result, 0.0);
        
      }
}
