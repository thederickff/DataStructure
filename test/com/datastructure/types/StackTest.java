/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructure.types;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author derickfelix
 */
public class StackTest {
    
    private Stack instance;
    
    public StackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.instance = new Stack();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        instance.push(1);
        String expResult = "[1]";
        assertEquals(expResult, instance.toString());
        instance.push(2);
        expResult = "[1, 2]";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of pop method, of class Stack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        instance = new Stack();
        instance.push(1);
        instance.push(2);
        instance.push(3);
        instance.push(4);
        instance.push(5);
        instance.push(6);
        instance.pop();
        String expResult = "[1, 2, 3, 4, 5]";
        assertEquals(expResult, instance.toString());
        instance.pop();
        instance.pop();
        expResult = "[1, 2, 3]";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of peek method, of class Stack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
    }

    /**
     * Test of isEmpty method, of class Stack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
    }

    /**
     * Test of clear method, of class Stack.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
    }

    /**
     * Test of size method, of class Stack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
    }
    
}
