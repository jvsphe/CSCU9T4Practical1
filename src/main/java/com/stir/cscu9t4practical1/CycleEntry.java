package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry {
    private String terrain;
    private String tempo;

    public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String terr, String temp) {
        super(n, d, m, y, h, min, s, dist);
        this.terrain = terr;
        this.tempo = temp;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    @Override
    public String getEntry() {
        String result = super.getName() + " cycled " + getDistance() + " km on a " + terrain +
                        " terrain at a " + tempo + " tempo in " +
                        getHour() + ":" + getMin() + ":" + getSec() +
                        " on " + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
        return result;
    }
}
