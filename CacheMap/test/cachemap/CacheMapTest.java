/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachemap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author доця
 */
public class CacheMapTest {
    
    public CacheMapTest() {
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
     * Test of put method, of class CacheMap.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        String key = "mikola";
        Object val = 5;
        CacheMap instance = null;
        Object expResult = 5;
        Object result = instance.put(key, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class CacheMap.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Object key = "Mikola";
        CacheMap instance = null;
        Object expResult = 5;
        Object result = instance.get(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of matchStartsWith method, of class CacheMap.
     */
    @Test
    public void testMatchStartsWith() {
        System.out.println("matchStartsWith");
        String prefix = "m";
        CacheMap instance = null;
        Object expResult = 5;
        Object result = instance.matchStartsWith(prefix);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CacheMap.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CacheMap.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
