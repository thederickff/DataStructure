/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructure.types;

/**
 * @name Stack
 * @author derickfelix
 * @date Sep 20, 2017
 */
public class Stack {

    private Object[] items;
    private int length;
    
    public Stack(int initialLength) {
        this.items = new Object[initialLength];
        this.length = 0;
    }

    /**
     * This adds a new item to the top of the stack
     *
     * @param element the element to be added
     */
    public void push(Object element) {
    }

    /**
     * This removes the top item from the stack.
     *
     * @param element the element to be removed
     * @return - The element removed
     */
    public Object pop(Object element) {
        return null;
    }

    /**
     * This gets the top element of the stack, the stack does not change.
     *
     * @return - The top element of the stack
     */
    public Object peek() {
        return null;
    }
    
    /**
     * This checks if the stack is empty.
     * 
     * @return - True if the stack doesn't contain any element and false otherwise
     */
    public boolean isEmpty() {
       return true; 
    }
    
    /**
     * This removes all the elements of the stack.
     */
    public void clear() {
    }
    
    /**
     * This returns how many elements the stack contains.
     * 
     * @return - The length of the stack
     */
    public int size() {
        return this.length;
    }
}
