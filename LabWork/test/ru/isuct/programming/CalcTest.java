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

    /**
     * Test of taskBImproved method, of class Calc.
     */
    @Test
    public void testTaskBImproved() {
        System.out.println("taskBImproved");
        double a = 0.0;
        double b = 0.0;
        double[] xn = {1,2,3};
        Calc instance = new Calc();
        instance.taskBImproved(a, b, xn);
     
    }

    /**
     * Test of calcFunction method, of class Calc.
     */
    @Test
    public void testCalcFunction() {
        System.out.println("calcFunction");
        double a = -2.5;
        double b = 6.3;
        double xn = 5;
        Calc instance = new Calc();
        double expResult = 5.858181878186781;
        double result = instance.calcFunction(a, b,xn );
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of taskASimple method, of class Calc.
     */
  
    }

