package com.example.iss;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Request {

    @SerializedName("latitude")
    private double latitude;
    @SerializedName("longitude")
    private double longitude;
    @SerializedName("altitude")
    private double altitude;
    @SerializedName("passes")
    private int passes;
    @SerializedName("datetime")
    private Date datetime;

    public Request(double latitude, double longitude, double altitude, int passes, Date datetime) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.passes = passes;
        this.datetime = datetime;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public int getPasses() {
        return passes;
    }

    public void setPasses(int passes) {
        this.passes = passes;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}