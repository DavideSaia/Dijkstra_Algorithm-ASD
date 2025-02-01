package model;

import java.io.IOException;

public class Main {

    private static final String filename = "performance.csv";
    private static final String charset = "UTF-8";
    private static final double SCALE_FACTOR = 1000000000.0;

    // range of density values and collection graph dimension
    private static final int INITIAL_DENSITY = 10;
    private static final int FINAL_DENSITY = 100000;
    private static final int COLL_DIM= 10;

    //----------------------------------------------------------------

    // METHOD FOR CREATION OF TEST GRAPHS

        private Graph createGraph(double d, int n){
            int m = (int)(n*d);
                Graph g = new Graph(n); // create a new graph with n vertecies
                g.addLinkToVertex(m);// add the proportional number of arcs 
                g.setDensity(d);
            return g;
        }// end createGraph()


        private Graph[] getTestGraphs(double d){
            int i = 0;
            int j = 100;
            Graph[] collGraphs = new Graph[COLL_DIM];

            while (i < collGraphs.length){
                collGraphs[i] = createGraph(d, j);
                i++;
                j+=1000;
            }
            return collGraphs;
        }// end getTestGraph()


        // END METHOD FOR CREATION TEST GRAPHS

        //----------------------------------------------------------------

        //METHOD FOR DIJKSTRA ALGORITHM TEST

        private void testDijkstra(Graph[] g){
            double start;
            double end;
            double time;
            for(int i=0; i<g.length;i++){
                start = System.nanoTime();
                    Dijkstra.dijkstra(g[i]);
                end = System.nanoTime();

                time = ((end - start)/SCALE_FACTOR);

                try {
                    WriteCSV.print(filename, charset,WriteCSV.setPerformanceList(time,g[i].getNumVertex(),g[i].getDensity()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }// end for()
        }// end testDijkstra()

        //----------------------------------------------------------------

        public static void main(String[] args) {

        Main m = new Main();
            for(int i=INITIAL_DENSITY; i<FINAL_DENSITY;i+=10000){
                m.testDijkstra(m.getTestGraphs(i));
            }
        }// end main()

}// end class
