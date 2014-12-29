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
public class FortestTest {
    
    public FortestTest() {
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
     * Test of mySumm method, of class Fortest.
     */
    @Test
    public void testMySummNegative() {
        System.out.println("mySummNegative");
        int a = -2;
        int b = 3;
        Fortest instance = new Fortest();
        int expResult = 5;
        int result = instance.mySumm(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testMySumm() {
        System.out.println("mySumm");
        int a = 2;
        int b = 3;
        Fortest instance = new Fortest();
        int expResult = 5;
        int result = instance.mySumm(a, b);
        assertEquals(expResult, result);
    }
    @Test
        public void testMySummNegative2() {
        System.out.println("mySummNegative2");
        int a = -2;
        int b = -3;
        Fortest instance = new Fortest();
        int expResult = 5;
        int result = instance.mySumm(a, b);
        assertEquals(expResult, result);
    
    }
}
