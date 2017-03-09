/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonachi;

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
public class FibonachiTest {
    
    public FibonachiTest() {
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
     * Test of isFib method, of class Fibonachi.
     */
    @Test
    public void testIsFib() {
        int x = 7;
        Boolean expResult = false;
        Boolean result = Fibonachi.isFib(x);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsFib2() {
        int x = 8;
        Boolean expResult = true;
        Boolean result = Fibonachi.isFib(x);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsFib3() {
        int x = 13;
        Boolean expResult = true;
        Boolean result = Fibonachi.isFib(x);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testIsFib4() {
        int x = 21;
        Boolean expResult = true;
        Boolean result = Fibonachi.isFib(x);
        assertEquals(expResult, result);
    }
    
      @Test
    public void testIsFib5() {
        int x = 102342302;
        Boolean expResult = false;
        Boolean result = Fibonachi.isFib(x);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testIsFib6() {
        int x = 10324202;
        Boolean expResult = false;
        Boolean result = Fibonachi.isFib(x);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testIsFib7() {
        int x = 10023452;
        Boolean expResult = false;
        Boolean result = Fibonachi.isFib(x);
        assertEquals(expResult, result);
    }
      @Test
    public void testIsFib8() {
        int x = 10023452;
        Boolean expResult = false;
        Boolean result = Fibonachi.isFib(x);
        assertEquals(expResult, result);
    }
      @Test
    public void testIsFib9() {
        int x = 1452;
        Boolean expResult = false;
        Boolean result = Fibonachi.isFib(x);
        assertEquals(expResult, result);
    }
      @Test
    public void testIsFib10() {
        int x = 23452;
        Boolean expResult = false;
        Boolean result = Fibonachi.isFib(x);
        assertEquals(expResult, result);
    }
    
  
   
    
}
