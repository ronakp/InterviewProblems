package com.ronakp.basic;

import java.lang.Exception;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class GraphAdjacencyListProblem1<T> {
    
    private HashMap<T, LinkedList<T>> map = new HashMap<>();

    public void addVertex(T v) throws Exception {
        if(map.containsKey(v)) {
            throw new Exception("Vertex Exists");
        } else {
            map.put(v, new LinkedList<T>());
        }
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
        for(Map.Entry<T, LinkedList<T>> entry : map.entrySet()) {
            if(entry.getKey() == v) {
                map.remove(v);
            } else {
                if(entry.getValue().contains(v)) {
                    entry.getValue().remove(v);
                }
            }
        }
    }

    public void deleteEdge(T source, T destination) throws Exception {
        if(this.map.containsKey(source) && this.map.containsKey(destination)) {
            this.map.get(source).remove(destination);
            this.map.get(destination).remove(source);
        } else {
            throw new Exception("Invalid Source or Destination");
        }
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
