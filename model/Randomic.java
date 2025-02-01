package model;

import java.util.Random;

public class Randomic {
    
    private Random random;

    public Randomic() {
        random = new Random(System.currentTimeMillis());
    }// end Randomic()

    //----------------------------------------------------------------

    // METHOD THAT GENERATE RANDOM NUMBER TO IMPLEMENT DIJKSTRA ALGORITHM

    public int genRandomWeight() {
        random.setSeed(System.nanoTime());
        int r = random.nextInt(20);
        r = (r + random.nextInt(20))%20 + 1;
        return r;
    }// end genRandomWeight()

    public int genRandomVertex(int n) {
        random.setSeed(System.nanoTime());
        int v = random.nextInt(n);
        v = (v + random.nextInt(n))%n;
        return v;
    }// end genRandomSource()

}// end class Randomic 
