/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classicalweightvalue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amon.Sabul
 */
public class ClassicalWeightValueTest {
    
    public ClassicalWeightValueTest() {
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
     * Test of max method, of class ClassicalWeightValue.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = ClassicalWeightValue.max(a, b);
        assertEquals(expResult, result);
        //TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of knapSack method, of class ClassicalWeightValue.
     */
    @Test
    public void testKnapSack() {
        System.out.println("knapSack");
        int W = 0;
        int[] wt = null;
        int[] val = null;
        int n = 0;
        int expResult = 0;
        int result = ClassicalWeightValue.knapSack(W, wt, val, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ClassicalWeightValue.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ClassicalWeightValue.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
