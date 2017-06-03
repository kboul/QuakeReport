package com.example.android.quakereport;

/**
 * Created by KostasBoul on 01.06.17.
 */

public class Earthquake {

    private Double magnitude;
    private String location;
    private long timeInMilliseconds;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake (Double magnitude, String location, long timeInMilliseconds) {
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMilliseconds = timeInMilliseconds;
    }

    public Double getMagnitude() { return magnitude; }

    public String getLocation() {
        return location;
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }
}
