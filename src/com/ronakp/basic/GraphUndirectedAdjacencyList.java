package com.ronakp.basic;

import java.lang.Exception;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class GraphUndirectedAdjacencyList<T> {
    
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
        if(!map.get(source).contains(destination) && !map.get(destination).contains(source)) {
            map.get(source).add(destination);
            map.get(destination).add(source);
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
        HashSet<T> visited = new HashSet<>();
        DFSTraversalRecursive(root, visited);
    }

    private void DFSTraversalRecursive(T source, HashSet<T> visited) {
        if (!visited.contains(source)) {
            visited.add(source);
            System.out.println(source);
            for(T neighbor : map.get(source)) {
                DFSTraversalRecursive(neighbor, visited);
            }
        }
    }

    public boolean DFSSearch(T source, T destination) {
        HashSet<T> visited = new HashSet<>();
        return DFSSearchRecursive(source, destination, visited);
    }

    private boolean DFSSearchRecursive(T source, T destination, HashSet<T> visited) {
        if(visited.contains(source)) {
            return false;
        }
        visited.add(source);
        if(source == destination) {
            return true;
        }
        for(T neighbor : map.get(source)) {
            if(DFSSearchRecursive(neighbor, destination, visited)) {
                return true;
            } 
        }
        return false;
    }

    public void BFSTraversal(T root) {
        LinkedList<T> nextVisit = new LinkedList<>();
        LinkedList<T> printList = new LinkedList<>();
        HashSet<T> visited = new HashSet<>();
        nextVisit.add(root);
        while(!nextVisit.isEmpty()) {
            T node = nextVisit.remove();
            if(visited.contains(node)) { 
                continue;
            } else {
                printList.add(node);
            }
            visited.add(node);
            for(T neighbor : map.get(node)) {
                nextVisit.add(neighbor);
            }
        }
        System.out.println(printList);
    }

    public boolean BFSSearch(T source, T destination) {
        LinkedList<T> nextVisit = new LinkedList<>();
        HashSet<T> visited = new HashSet<>();
        nextVisit.add(source);
        while(!nextVisit.isEmpty()) {
            T node = nextVisit.remove();
            if(node == destination) {
                return true;
            }
            if(visited.contains(node)) {
                continue;
            }
            visited.add(node);
            for(T neighbor : map.get(node)) {
                nextVisit.add(neighbor);
            }
        }
        return false;
    }
}

class Run {
        
    public static void main(String[] args) {
        GraphUndirectedAdjacencyList<String> g = new GraphUndirectedAdjacencyList<>();
        try {
            g.addEdge("A", "G");
            g.addEdge("A", "L");
            g.addEdge("L", "G");
            g.addEdge("B", "A");
            g.addEdge("B", "L");
            g.addEdge("B", "C");
            g.addEdge("C", "F");
            g.addEdge("B", "D");
            g.addEdge("C", "D");
            g.addEdge("C", "E");
            g.addEdge("F", "E");

        } catch (Exception e) {
            System.out.println(e);
        }
        g.DFSTraversal("A");
        g.BFSTraversal("A");
        System.out.println(g.DFSSearch("L", "E"));
        System.out.println(g.BFSSearch("L", "E"));
    }
}