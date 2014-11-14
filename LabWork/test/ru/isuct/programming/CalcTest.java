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
 * @author Stud_5
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

    /**
     * Test of taskBSimple method, of class Calc.
     */
    @Test
    public void testTaskBSimple() {
        System.out.println("taskBSimple");
        Calc instance = new Calc();
        instance.taskBSimple();
        
    }

    /**
     * Test of calcFunction method, of class Calc.
     */
    @Test
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
    
    

