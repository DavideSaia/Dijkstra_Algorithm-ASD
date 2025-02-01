package model;


import java.util.*;



public class Graph {
    
    //VARIABLES

    private int numberOfVertex; // Number of vertices
    protected List<List<Node>> adjList; // Adjacency list
    private Randomic random; // Random
    private double density; 
    
    //----------------------------------------------------------------

    //INITIALIZATION CONSTRUCTOR

    public Graph(int n) {
        numberOfVertex = n;
        random = new Randomic();
        adjList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
    }// end constructor

    //----------------------------------------------------------------
    
    // Implementation of adjiacency list 

    public void addEdge(int src, int dest, int weight) {
        adjList.get(src).add(new Node(dest, weight)); 
        adjList.get(dest).add(new Node(src, weight));
    }// end addEdge

    //----------------------------------------------------------------

    //METHOD TO UPDATE THE GRAPH ATTRIBUTE OR GET THEM 

    public int getNumVertex(){
        return numberOfVertex;
    }

    public List<List<Node>> getAdjList(){
        return adjList;
    }

    public int getSrc(){
        return 0;
    }

    public void addLinkToVertex(int m){
        for(int i=0; i<m;i++){
            addEdge(random.genRandomVertex(getNumVertex()), random.genRandomVertex(getNumVertex()), random.genRandomWeight());
        }
    }// end addLinkToVertex()
    

    public void setDensity(double d){
        this.density = d;
    }// end setDensity()

    public double getDensity(){
        return density;
    }// end getDensity()


}// end class Graph
