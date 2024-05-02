package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry {
    private String location;

    public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String loc) {
        super(n, d, m, y, h, min, s, dist);
        this.location = loc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String getEntry() {
        String result = super.getName() + " swam " + getDistance() + " km " + (location.equals("pool") ? "in the pool" : "outdoors") +
                        " in " + getHour() + ":" + getMin() + ":" + getSec() +
                        " on " + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
        return result;
    }
}
