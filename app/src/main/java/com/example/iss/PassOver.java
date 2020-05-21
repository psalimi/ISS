package com.example.iss;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class PassOver {

    @SerializedName("risetime")
    private Date riseTime;
    @SerializedName("duration")
    private int duration;

    public PassOver(Date riseTime, int duration) {
        this.riseTime = riseTime;
        this.duration = duration;
    }

    public Date getRiseTime() {
        return riseTime;
    }

    public void setRiseTime(Date riseTime) {
        this.riseTime = riseTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
