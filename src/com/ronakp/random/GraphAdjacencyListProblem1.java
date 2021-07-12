package com.ronakp.random;

import java.lang.Exception;
import java.util.HashMap;
import java.util.LinkedList;

public class GraphAdjacencyListProblem1<T> {
    
    private HashMap<T, LinkedList<T>> map = new HashMap<>();

    public void addVertex(T v) throws Exception {
        if(map.containsKey(v)) {
            throw new Exception("Vertex Exists");
        }
        map.put(v, new LinkedList<T>());
    }

    public void addEdge(T source, T destination) {
        if(!map.containsKey(source)) {
            try {
                addVertex(source);
            } catch (Exception e) {
                System.out.println(e);   
            }
        }
        if(!map.containsKey(destination)) {
            try {
                addVertex(destination);
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
        map.get(source).add(destination);
    }

    public void deleteVertex(T v) {

    }

    public void deleteEdge(T source, T destination) {

    }

    public void DFSTraversal(T root) {

    }

    public void DFSSearch(T v) {

    }

    public void BFSTraversal(T root) {

    }

    public void BFSSearch(T v) {

    }
}
