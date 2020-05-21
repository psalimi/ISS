package com.example.iss;

import com.google.gson.annotations.SerializedName;

public class PassOver {

    @SerializedName("risetime")
    private long riseTime;
    @SerializedName("duration")
    private int duration;

    public PassOver(int riseTime, int duration) {
        this.riseTime = riseTime;
        this.duration = duration;
    }

    public long getRiseTime() {
        return riseTime;
    }

    public void setRiseTime(long riseTime) {
        this.riseTime = riseTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
