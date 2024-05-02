package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry {
    private String location;
    private int repetitions;
    private int recoveryTime;

    public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String loc, int rep, int rt) {
        super(n, d, m, y, h, min, s, dist);
        this.location = loc;
        this.repetitions = rep;
        this.recoveryTime = rt;
    }

    
}
