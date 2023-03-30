package org.example.structs;

import java.util.Arrays;
import java.util.LinkedList;

public class Graph {

    private int V; // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency Lists

    // Constructor
    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i){
            adj[i] = new LinkedList<>();
        }
        System.out.println(Arrays.toString(adj));
    }

    public void addEdge(int v, int w) { adj[v].add(w); }

    @Override
    public String toString() {
        return "Graph{" +
                "V=" + V +
                ", adj=" + Arrays.toString(adj) +
                '}';
    }
}
