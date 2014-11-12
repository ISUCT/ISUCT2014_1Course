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
 * @author Stud_17
 */
public class fortestTest {
    
    public fortestTest() {
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
     * Test of mySumm method, of class fortest.
     */
    @Test
    public void testMySummNegative() {
        System.out.println("mySumm Negative");
        int a = -2;
        int b = 3;
        fortest instance = new fortest();
        int expResult = 5;
        int result = instance.mySumm(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMySumm() {
        System.out.println("mySumm");
        int a = 2;
        int b = 3;
        fortest instance = new fortest();
        int expResult = 5;
        int result = instance.mySumm(a, b);
        assertEquals(expResult, result);
    }
}
