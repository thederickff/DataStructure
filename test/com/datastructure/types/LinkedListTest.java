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
public class LinkedListTest {
    
    private LinkedList instance;
    
    public LinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new LinkedList();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAppend() {
        // TODO review the generated test code and remove the default call to fail.
        instance.append('a');
        instance.append('b');
        instance.append('c');
        int expSize = 3;
        assertEquals(expSize, 3);
        assertFalse(instance.isEmpty());
        assertEquals("[a, b, c]", instance.toString());
    }
    
    @Test
    public void testRemove() {
        System.out.println("Test Remove");
        instance = new LinkedList();
        instance.append('a');
        instance.append('b');
        instance.append('c');
        instance.remove('a');
        instance.remove('b');
        instance.remove('c');
        int expSize = 0;
        assertEquals(expSize, 0);
        assertTrue(instance.isEmpty());
        
    }
    
}
