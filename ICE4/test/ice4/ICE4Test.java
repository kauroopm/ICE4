/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kauro
 */
public class ICE4Test {
    
    public ICE4Test() {
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
     * Test of main method, of class ICE4.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ICE4.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of first method, of class ICE4.
     */
    @Test
    public void testFirst() {
        System.out.println("first");
        int expResult = 0;
        int result = ICE4.first();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of second method, of class ICE4.
     */
    @Test
    public void testSecond() {
        System.out.println("second");
        int expResult = 0;
        int result = ICE4.second();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of third method, of class ICE4.
     */
    @Test
    public void testThird() {
        System.out.println("third");
        boolean expResult = false;
        boolean result = ICE4.third();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
