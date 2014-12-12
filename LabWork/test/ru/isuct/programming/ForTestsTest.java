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
 * @author Stud_5
 */
public class ForTestsTest {
    
    public ForTestsTest() {
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
     * Test of mySumm method, of class ForTests.
     */
    @Test
    public void testMySumm() {
        System.out.println("mySumm");
        int a = 8;
        int b = 4;
        ForTests instance = new ForTests();
        int expResult = 12;
        int result = instance.mySumm(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testMySummNegative() {
        System.out.println("mySumm");
        int a = -4;
        int b = 4;
        ForTests instance = new ForTests();
        int expResult = 8;
        int result = instance.mySumm(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testMySummBothNegative() {
        System.out.println("mySumm");
        int a = -8;
        int b = -4;
        ForTests instance = new ForTests();
        int expResult = 12;
        int result = instance.mySumm(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
        int first = 2;
        int second = 3;
        ForTests instance = new ForTests();
        int expResult = 5;
        int result = instance.mySumm(first, second);
        assertEquals(expResult, result);
    }
 
    @Test
    public void testMySummNegative() {
        System.out.println("mySumm Negative");
        int first = -2;
        int second = 3;
        ForTests instance = new ForTests();
        int expResult = 5;
        int result = instance.mySumm(first, second);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMySummBothNegative() {
        System.out.println("mySumm Negative");
        int first = -9;
        int second = -3;
        ForTests instance = new ForTests();
        int expResult = 12;
        int result = instance.mySumm(first, second);
        assertEquals(expResult, result);
    }
    
    
    
}
