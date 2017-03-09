/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.palindrom;

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
public class print_palindromTest {
    
    public print_palindromTest() {
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

    @Test
    public void testSomeMethod() {
        print_palindrom pg = new print_palindrom();
        Boolean result = pg.isPalindrome("1223221");
        assertEquals(true, result);
    }
     @Test
    public void testSomeMethod2() {
        print_palindrom pg = new print_palindrom();
        Boolean result = pg.isPalindrome("122433221");
        assertEquals(false, result);
    }
    @Test
    public void testSomeMethod3() {
        print_palindrom pg = new print_palindrom();
        Boolean result = pg.isPalindrome("1224334221");
        assertEquals(true, result);
    }
    @Test
    public void testSomeMethod4() {
        print_palindrom pg = new print_palindrom();
        Boolean result = pg.isPalindrome("122235876433221");
        assertEquals(false, result);
    }
    @Test
    public void testSomeMethod5() {
        print_palindrom pg = new print_palindrom();
        Boolean result = pg.isPalindrome("1224999933221");
        assertEquals(false, result);
    }
    @Test
    public void testSomeMethod6() {
        print_palindrom pg = new print_palindrom();
        Boolean result = pg.isPalindrome("012243342210");
        assertEquals(true, result);
    }
}
