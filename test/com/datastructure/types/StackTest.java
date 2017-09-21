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
        instance.pop();
        instance.pop();
        instance.pop();
        expResult = "[]";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of peek method, of class Stack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        instance = new Stack();
        instance.push('a');
        instance.push('b');
        instance.push('c');
        char item = (char) instance.peek();
        assertEquals('c', item);
        instance.push('@');
        item = (char) instance.peek();
        assertEquals('@', item);
    }

    /**
     * Test of isEmpty method, of class Stack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        instance = new Stack();
        assertTrue(instance.isEmpty());
        instance.push("ab");
        instance.push("cd");
        assertFalse(instance.isEmpty());
        instance.pop();
        instance.pop();
        assertTrue(instance.isEmpty());
    }

    /**
     * Test of clear method, of class Stack.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        instance = new Stack();
        instance.push(30);
        instance.push(40);
        instance.push(50);
        instance.clear();
        assertTrue(instance.isEmpty());
        for (int i = 0; i < 10; i++) {
            instance.push(i);
        }
        instance.clear();
        assertTrue(instance.isEmpty());
    }

    /**
     * Test of size method, of class Stack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        instance = new Stack();
        int expResult = 10;
        for (int i = 0; i < 10; i++) {
            instance.push(i*3);
        }
        assertEquals(expResult, instance.size());
    }
    
}
