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
     * Test of taskSimple method, of class Calc.
     */
    @Test
    public void testTaskSimple() {
        System.out.println("taskSimple");
        Calc instance = new Calc();
        instance.taskSimple();

    }

    /**
     * Test of TaskASimple method, of class Calc.
     */
    @Test
    public void testTaskASimple() {
        System.out.println("TaskASimple");
        Calc instance = new Calc();
        instance.TaskASimple();

    }

    /**
     * Test of taskImproved method, of class Calc.
     */
    @Test
    public void testCalcFunction() {
        System.out.println("calcFunction");
        double a = 2.0;
        double b = 1.1;
        double x = 0.1;
        Calc instance = new Calc();
        double expResult = 1.538;
        double result = instance.calcFunction(a, b, x);
        assertEquals(expResult, result, 0.01);

    }
}
