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
 * @author stud
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
        int a = 2;
        int b = 3;
        ForTests instance = new ForTests();
        int expResult = 5;
        int result = instance.mySumm(a, b);
        assertEquals(expResult, result);    
    } 
   
    @Test
    public void testMySummNegative() {
        System.out.println("mySumm Negative");
        int a = -2;
        int b = 3;
        ForTests instance = new ForTests();
        int expResult = 5;
        int result = instance.mySumm(a, b);
        assertEquals(expResult, result);    
    }
    
    
}