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
public class LinkedList {
    
    private Node head;
    
    public LinkedList() {
        this.head = null;
    }
    
    public boolean append(Object object) {
        Node newNode = new Node(object);
        
        if(this.head == null) {
            this.head = newNode;
            return true;
        } else {
            Node current = this.head;
            
            while(current.next != null) {
                current = current.next;
            }
            
            current = newNode;
            current.next = null;
            return true;
        }
       // return false;
    }
   
    
    
    private class Node {
        private Object item;
        private Node next;
        
        public Node(Object item) {
            this.item = item;
            this.next = null;
        }

        public Object getItem() {
            return item;
        }

        public void setItem(Object item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        
        
    }
}
