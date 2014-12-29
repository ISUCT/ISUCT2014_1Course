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
 * @author AlexeyRovo
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
     * Test of taskASimple method, of class Calc.
     */
    @Test
    public void testTaskASimple() {
        System.out.println("taskASimple");
        double xlocal = 0.26;
        Calc instance = new Calc();
        instance.taskASimple();
        double expResult = 26.84410487237168;
        double result = instance.calcFunction(xlocal);
        assertEquals(expResult, result, 0.01);
       
    }
    
}
