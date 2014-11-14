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
        double a = 7.2;
        double x = 4.2;
        double b = 2.4;
        Calc instance = new Calc();
        double expResult = 0.9871428898897026;
        double result = instance.calcFunction(a, b, x);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of taskASimle method, of class Calc.
     */
    
    }

    /**
     * Test of taskBImproved method, of class Calc.
     */
    
    

