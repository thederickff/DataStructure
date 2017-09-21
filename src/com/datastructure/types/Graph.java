/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.datastructure.types;

/**
 * @name Graph
 * @author derickfelix
 * @date Sep 20, 2017
 */
public class Graph {

    private Stack vertices;
    private Dictionary adjList;
    
    public Graph(int initialLength) {
        this.vertices = new Stack();
        this.adjList = new Dictionary();
    }
    
    /**
     * This adds a new vertex on the graph
     * @param v the object vertex
     */
    public void addVertex(Object v) {
    }
    
    /**
     * Add a new edge between two vertex
     * @param v the vertex a
     * @param w the vertex b
     */
    public void addEdge(Object v, Object w) {
    }
    
    /**
     * This returns a string with all vertex and their edges
     * 
     * @return - All the elements of the stack
     */
    @Override
    public String toString() {
        return "";
    }
}
