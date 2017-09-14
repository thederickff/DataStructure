/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructure.types;

/**
 *
 * @author derickfelix
 */
public class Set {

    private Object[] items;
    private int size;

    public Set(int size) {
        this.items = new Object[size];
        this.size = 0;
    }

    /**
     * This adds a new item to the set
     *
     * @param value the element desired
     * @return - if the element was added in the set
     */
    public boolean add(Object value) {
        increaseSize();

        if (!has(value)) {
            this.items[size] = value;
            this.size++;
            return true;
        }
        return false;
    }

    /**
     * This removes the value from the set
     *
     * @param value the element desired
     * @return Boolean - if the element was removed in the set
     */
    public boolean remove(Object value) {
        if (this.has(value)) {
            for (int i = 0; i < this.items.length; i++) {
                if (this.items[i].equals(value)) {
                    this.items[i] = null;
                }
            }
        }
        return false;
    }

    /**
     * This increases the size of the set if there is no more space
     */
    public void increaseSize() {
        if (this.size == this.items.length) {
            Object[] newArray = new Object[(this.size * 3) / 2 + 1];
            for (int i = 0; i < this.size; i++) {
                newArray[i] = this.items[i];
            }
            this.items = newArray;
        }
    }

    /**
     * This returns true if the value exists in the set and false otherwise
     * 
     * @param value the element desired to be verified
     * @return Boolean - if the value exists in the set
     */
    public boolean has(Object value) {
        for (Object item : this.items) {
            if (item.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This removes all the items from the set
     */
    public void clear() {
        for (int i = 0; i < this.items.length; i++) {
            this.items[i] = null;
            this.size--;
        }
    }
    
    /**
     * This returns how many elements the set contains.
     * 
     * @return Integer - the element's size
     */
    public int getSize() {
        return this.size;
    }

    /**
     * This returns an array of all the values of the set
     * 
     * @return Object - array of elements
     */
    public Object[] getItems() {
        return this.items;
    }

    /**
     * This returns a string with all the elements of the set 
     * 
     * @return String - elements on the array
     */
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < items.length - 1; i++) {
            result += this.items[i] + " - ";
        }
        
        result += this.items[this.items.length - 1];
        return result;
    }

}
