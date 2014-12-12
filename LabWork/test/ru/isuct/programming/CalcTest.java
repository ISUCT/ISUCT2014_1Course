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
 * 
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
        double a = 2.9;
        double b = 3.5;
        double x = 9.1;
        Calc instance = new Calc();
        double expResult = 3.997765086620711;
        double result = instance.calcFunction(a, b, x);
        assertEquals(expResult, result, 0.001);
        
    }

    
    /**
     * Test of taskBImproved method, of class Calc.
     */
    
    
