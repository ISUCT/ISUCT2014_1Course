/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author user
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
     * Test of calcFunction method, of class Calc.
     */
    @Test
    public void testCalcFunction() {
        System.out.println("calcFunction");
        double aLocal = 0.0;
        double bLocal = 0.0;
        double xLocal = 0.0;
        Calc instance = new Calc();
        double expResult = 0.0;
        double result = instance.calcFunction(aLocal, bLocal, xLocal);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
