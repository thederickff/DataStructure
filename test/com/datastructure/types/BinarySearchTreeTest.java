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
public class BinarySearchTreeTest {
    
    BinarySearchTree instance;
    public BinarySearchTreeTest() {
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
     * Test of insert method, of class BinarySearchTree.
     */
    @Test
    public void testInsert() {
        instance = new BinarySearchTree();
        instance.insert("abc");
        instance.insert("ab");
        instance.insert("abc");
        instance.insert("a");
        instance.insert("abcd");
        instance.insert("abcde");
        instance.insert("abc");
        instance.insert("abcd");
        instance.insert("ab");
        
        assertEquals(false, instance.search("abc"));
        assertEquals(false, instance.search("ab"));
        assertEquals(false, instance.search("a"));
    }

    /**
     * Test of search method, of class BinarySearchTree.
     */
    @Test
    public void testSearch() {
        
    }
    
}
