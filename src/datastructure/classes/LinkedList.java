/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.classes;

/**
 *
 * @author derickfelix
 */
public class LinkedList {

    private Node items;

    private class Node {

        private String element;
        private Node next;

        public Node(String element) {
            this.element = element;
            this.next = null;
        }

        public String getElement() {
            return element;
        }

        public void setElement(String element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }

    /**
     * This adds a new item to the end of the list
     * @param element - the item you want to add
     */
    public void append(String element) {

    }

    /**
     * This inserts a new item at specified position in the list
     * @param element - the item you want to add
     */
    public void insert(String element) {

    }
    
    /**
     * This remove an item from the list
     * @param element - the item you want to add
     */
    public void remove(String element) {
        
    }
    
    /**
     * This returns the index of the element from the list
     * @param element - the item you want to add
     * @return - index of the element from the list
     */
    public int indexOf(String element) {
       
       return -1;
    }
    
    /**
     *  This removes an item from a specified position in the list
     * @param position position of the item from the list
     */
    public void removeAt(int position) {
       
    }
    
    /**
     * Verify if the list empty
     * @return - true if the linked list does not contain any elements  
     * - false if the size of the linked list is bigger than 0
     */
    public boolean isEmpty() {
        
        return false;
    }
    
    /**
     * This returns how many elements the linked list contains.
     * It is similar to the length property of the array
     * @return the size of the list
     */
    public int size() {
        return 0;
    }

    /**
     * As the list uses a Node class as an item, we need to overwrite
     * the default toString method inherited from the JavaScript object 
     * to output only the element uses.
     * @return 
     */
    @Override
    public String toString() {
        return "LinkedList{" + "items=" + items + '}';
    }
    
    
    
}
