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
public class Hash {
    private String[] items;
    private String[] keys;
    private int size;
    
    public Hash() {
        this.size = 100;
        this.keys = new String[size];
        this.items = new String[size];
    }
    
    public void put(String key, String value) {
        this.keys[getPosition(key)] = key;
        this.items[getPosition(key)] = value;
    }
    public void remove(String key) {
        this.keys[getPosition(key)] = null;
        this.items[getPosition(key)] = null;
    }
    public String get(String key) {
        
        return this.items[getPosition(key)];
    }
    private int getPosition(String value){
        int pos = value.codePointAt(0) * 3;
        for(int i = 1; i < value.length(); i++){
            pos += value.codePointAt(i);
        }
        
        return pos % 37;
    }

    @Override
    public String toString() {
        String toString = "";
        for (int i = 0; i < this.items.length; i++) {
            if(this.items[i] != null) {
                toString +=" ['" + this.keys[i] + "':'" + this.items[i] +"'] ";
            }
        }
        
        return toString;
    }
    
    
}
