/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dima
 */
public class SimpleCalcTest {
    
    public SimpleCalcTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSum method, of class SimpleCalc.
     */
    @Test
    public void testGetSum() {
        System.out.println("getSum");
        SimpleCalc instance = null;
        double expResult = 0.0;
        double result = instance.getSum();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiff method, of class SimpleCalc.
     */
    @Test
    public void testGetDiff() {
        System.out.println("getDiff");
        SimpleCalc instance = null;
        double expResult = 0.0;
        double result = instance.getDiff();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMult method, of class SimpleCalc.
     */
    @Test
    public void testGetMult() {
        System.out.println("getMult");
        SimpleCalc instance = null;
        double expResult = 0.0;
        double result = instance.getMult();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiv method, of class SimpleCalc.
     */
    @Test
    public void testGetDiv() {
        System.out.println("getDiv");
        SimpleCalc instance = null;
        double expResult = 0.0;
        double result = instance.getDiv();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
