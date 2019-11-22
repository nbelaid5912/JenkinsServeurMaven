/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usager
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Main.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int x = 0;
        int y = 0;
        int expResult = 0;
        int result = Main.add(x, y);
        assertEquals(expResult, result);
        
    }
    
}
