/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructure.types;

import java.util.Arrays;
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
public class DictionaryTest {

    private Dictionary instance;

    public DictionaryTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.instance = new Dictionary();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of set method, of class Dictionary.
     */
    @Test
    public void testSet() {
        // Set method
        instance.set("Rick", "Blue");
        instance.set("Rick", "Green");
        instance.set("Ryan", "Green");
        instance.set("Brad", "Yellow");
        System.out.println(instance.toString());
        // Has method
        assertTrue(instance.has("Rick"));
        assertFalse(instance.has("Loren"));
        assertFalse(instance.has("Blue"));
        // Keys and Values methods
        Object[] keys = instance.keys();
        System.out.println(Arrays.toString(keys));
        Object[] values = instance.values();
        System.out.println(Arrays.toString(values));
        // Size Method
        assertEquals(3, instance.size());
        // Get Method
        assertEquals("Rick", instance.get("Rick"));
        // Clear Method
        instance.clear();
        assertEquals(0, instance.size());
        assertFalse(instance.has("Rick"));
        assertFalse(instance.has("Ryan"));
        System.out.println(instance.toString());
        // Remove Method
        instance.set("Lorem", "18");
        instance.set("Gobery", "23");
        instance.set("Stevs", "21");
        instance.set("Mary", "22");
        instance.set("Brian", "21");
        instance.remove("Gobery");
        System.out.println(instance.toString());
        instance.remove("Mary");
        System.out.println(instance.toString());
    }

}
