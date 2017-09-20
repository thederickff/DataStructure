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

    private Object[] vertices;
    private Dictionary adjList;
    
    public Graph(int initialLength) {
        this.vertices = new Object[initialLength];
        this.adjList = new Dictionary();
    }
    
    /**
     * This adds a new vertex on the graph
     * @param v the object vertex
     */
    public void addVertex(Object v) {
        
    }
}
