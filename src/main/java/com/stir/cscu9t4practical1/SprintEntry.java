package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {
    private String sessionType;
    private int repetitions;
    private int recoveryTime;

    public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String st, int rep, int rt) {
        super(n, d, m, y, h, min, s, dist);
        this.sessionType = st;
        this.repetitions = rep;
        this.recoveryTime = rt;
    }

    
    
}
