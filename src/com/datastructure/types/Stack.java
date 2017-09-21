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

    public Stack() {
        // Set 5 as the initial array length
        this.items = new Object[5];
        this.length = 0;
    }

    /**
     * This adds a new item to the top of the stack
     *
     * @param element the element to be added
     */
    public void push(Object element) {
        growArray();
        for(int i = 0; i < this.items.length; i++) {
            if(this.items[i] == null) {
                this.items[i] = element;
                this.length++;
                break;
            }
        }
    }

    /**
     * This removes the top item from the stack.
     *
     * @param element the element to be removed
     * @return - The element removed
     */
    public Object pop() {
        Object obj = this.items[this.length-1];
        this.items[this.length-1] = null;
        this.length--;
        return obj;
    }

    /**
     * This gets the top element of the stack, the stack does not change.
     *
     * @return - The top element of the stack
     */
    public Object peek() {
        return this.items[this.length-1];
    }

    /**
     * This checks if the stack is empty.
     *
     * @return - True if the stack doesn't contain any element and false
     * otherwise
     */
    public boolean isEmpty() {
        return this.length < 1;
    }

    /**
     * This removes all the elements of the stack.
     */
    public void clear() {
        // this.length on the for directly is not working!
        int count = this.length;
        for (int i = 0; i < count; i++) {
            pop();
        }
    }

    /**
     * This returns how many elements the stack contains.
     *
     * @return - The length of the stack
     */
    public int size() {
        return this.length;
    }
    
    /**
     * This returns a string with all the elements of the stack 
     * 
     * @return - All the elements of the stack
     */
    @Override
    public String toString() {
        String r = "[";
        for(int i =0; i < this.length; i++) {
            r += this.items[i];
            if(i + 1 < this.length) {
             r += ", ";    
            } 
        }
        r += "]";
        return r;
    }

    /**
     * This can grows the maximum length of the items array.
     */
    private void growArray() {
        if (this.length >= this.items.length) {
            Object[] newArray = new Object[(this.length * 3) / 2];
            // Copy the this.array to the newArray
            System.arraycopy(this.items, 0, newArray, 0, this.items.length);
            this.items = newArray;
        }
    }
}
