/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructure.types;

/**
 * This class is a LinkedList data structure type.
 * @author derickfelix
 */
public class LinkedList {

    private Node head;
    private int length;

    public LinkedList() {
        this.head = null;
        this.length = 0;
    }

    /**
     * This add a new item to the end of the list
     *
     * @param item - the desired item to be add to the list
     * @return - if the item was added successfully
     */
    public boolean append(Object item) {
        Node newNode = new Node(item);
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

    /**
     * This checks if the list is empty
     *
     * @return - true if the list doesn't contain any elements and false
     * otherwise
     */
    public boolean isEmpty() {
        return this.length < 1;
    }

    /**
     * As the list uses a Node class as an item, we need to overwrite 
     * the default toString method inherited from the java object to
     * output only the element values.
     *
     * @return - All the values of the linkedList.
     */
    @Override
    public String toString() {
        Node current = this.head;
        String result = "[";
        while (current != null) {
            result += current.item;
            // Format
            if (current.next != null) {
                result += ", ";
            } else {
                result += "]";
            }
            current = current.next;
        }
        return result;
    }

    public int size() {
        return this.length;
    }

    /**
     * Class responsible to handle the linkedList as being a component 
     * of the list.
     */
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
