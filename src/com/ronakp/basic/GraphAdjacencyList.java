package com.ronakp.basic;

import java.beans.DesignMode;
import java.lang.Exception;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

import javax.lang.model.util.ElementScanner14;

public class GraphAdjacencyList<T> {
    
    private HashMap<T, LinkedList<T>> map = new HashMap<>();

    public void addVertex(T v) throws Exception {
        if(map.containsKey(v)) {
            throw new Exception("Vertex Exists");
        } else {
            map.put(v, new LinkedList<T>());
        }
    }

    public void addEdge(T source, T destination) throws Exception {
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
        if(!map.get(source).contains(destination)) {
            map.get(source).add(destination);
        } else {
            throw new Exception("Edge Exists");
        }
        
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
        LinkedList<T> visited = new LinkedList<>();
        DFSTraversalRecursive(root, visited);
        for (T element : visited) {
            System.out.println(element);
        }
    }

    public void DFSTraversalRecursive(T source, LinkedList<T> visited) {
        if (!visited.contains(source)) {
            visited.add(source);
            for(T neighbor : map.get(source)) {
                DFSTraversalRecursive(neighbor, visited);
            }
        }
    }

    public boolean DFSSearch(T source, T destination) {
        HashSet<T> visited = new HashSet<>();
        return DFSSearchRecursive(source, destination, visited);
    }

    public boolean DFSSearchRecursive(T source, T destination, HashSet<T> visited) {
        if(source == destination) {
            return true;
        }
        visited.add(source);
        for(T neighbor : map.get(source)) {
            if(!visited.contains(neighbor)) {
                if(neighbor == destination) {
                    return true;
                } else {
                    DFSSearchRecursive(neighbor, destination, visited);
                }
            }
        }
        return false;
    }

    public void BFSTraversal(T root) {

    }

    public void BFSSearch(T v) {

    }
}
