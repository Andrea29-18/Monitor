package com.example.monitor.api;

import com.squareup.moshi.Json;

public class Properties {
    @Json(name="mag")
    private double magnitude;
    private String place;
    private long time;

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public double getMagnitude() {
        return magnitude;
    }
    public String getPlace() {
        return place;
    }
    public long getTime() {
        return time;
    }

}
