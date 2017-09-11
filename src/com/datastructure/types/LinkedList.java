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
    private int length;

    public LinkedList() {
        this.head = null;
        this.length = 0;
    }

    public boolean append(Object object) {
        Node newNode = new Node(object);
        Node current;

        if (this.head == null) {
            this.head = newNode;
            length++;
            return true;
        } else {
            current = this.head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
            length++;
            return true;
        }
        // return false;
    }

    public int size() {
        return this.length;
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
