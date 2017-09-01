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
public class BinarySearchTree {
    private Node root;
    
    public BinarySearchTree() {
        this.root = null;
    }
    
    /**
     * This inserts a new key in the tree
     * @param key - the key desired to be inserted
     */
    public String insert(String key) {
        this.root = new Node(key);
        return this.root.key;
    }
    
    public boolean search(String key) {
        
        return false;
    }
    /**
     * Node class of the tree
     */
    private class Node {
        public String key;
        public Node left;
        public Node right;
        
        public Node(String key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }
    
    
}
