package model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;



public class Dijkstra {
    

    // Implementation of Dijkstra algorithm

    public static void dijkstra(Graph g) {


        PriorityQueue<Node> pq = new PriorityQueue<>(g.getNumVertex(), Comparator.comparingInt(node -> node.weight));
        int[] dist = new int[g.getNumVertex()];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[g.getSrc()] = 0;
        pq.add(new Node(g.getSrc(), 0));

        while (!pq.isEmpty()) {
            int u = pq.poll().dest;

            for (Node neighbor : g.getAdjList().get(u)) {
                int v = neighbor.dest;
                int weight = neighbor.weight;

                int newDist = dist[u] + weight;
                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    pq.add(new Node(v, newDist));
                }
            }
        }

        // Print shortest distances
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < g.getNumVertex(); i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }

    }// end method dijkstra


}// end class Dijkstra
