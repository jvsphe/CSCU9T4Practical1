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

    public String getSessionType() {
        return this.sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public int getRepetitions() {
        return this.repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public int getRecoveryTime() {
        return this.recoveryTime;
    }

    public void setRecoveryTime(int recoveryTime) {
        this.recoveryTime = recoveryTime;
    }

    @Override
    public String getEntry() {
        String result = getName() + " did " + repetitions + " " + sessionType + " (with " + recoveryTime + " min. recovery between); running " +
                getDistance() + " km in " + getHour() + ":" + getMin() + ":" + getSec() +
                " on " + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
        return result;
    }
}
