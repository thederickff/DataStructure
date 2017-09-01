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
     *
     * @param key - the key desired to be inserted
     */
    public String insert(String key) {
        Node newNode = new Node(key);

        if (this.root == null) {
            this.root = newNode;
        } else {
            insertNode(root, newNode);
        }

        return this.root.key;
    }

    private void insertNode(Node node, Node newNode) {
        if (newNode.key.length() < node.key.length()) {
            if (node.left == null) {
                node.left = newNode;
            } else {
                insertNode(node.left, newNode);
            }
        } else {
            if (node.right == null) {
                node.right = newNode;
            } else {
                insertNode(node.right, newNode);
            }
        }
    }

    public boolean search(String key) {
        boolean found = false;
        if (this.root.key.equals(key)) {
            found = true;
            return found;
        } else {
            searchChild(this.root, key);
            if(found == true) {
                return found;
            }
        }
        
        return found;
    }
    
    private boolean searchChild(Node node, String key) {
        boolean found = false;
        // Left
        if (node.left.key.equals(key)) {
            found = true;
            return found;
        } else {
            found = searchChild(node.left, key);
            if(found == true) {
                return found;
            }
        }
        // Right
        if (node.right.key.equals(key)) {
            found = true;
            return found;
        } else {
            found = searchChild(node.right, key);
            if(found == true) {
                return found;
            }
        }
        
        return found;
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
