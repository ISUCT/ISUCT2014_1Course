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
        double a = 0.4;
        double b = 0.8;
        double x = 4.48;
        Calc instance = new Calc();
        double expResult = 1.1676767574631592;
        double result = instance.calcFunction(a, b, x);
        assertEquals(expResult, result, 0.001);
     
    }

    /**
     * Test of taskASimple method, of class Calc.
     */
   
    }

    /**
     * Test of taskBImproved method, of class Calc.
     */
   

