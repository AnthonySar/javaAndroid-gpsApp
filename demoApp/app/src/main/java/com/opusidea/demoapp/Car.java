package com.opusidea.demoapp;

public class Car {

    private int year;
    private String name;
    private boolean stillRunning;

    public Car(int year, String name, boolean stillRunning) {
        this.year = year;
        this.name = name;
        this.stillRunning = stillRunning;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStillRunning() {
        return stillRunning;
    }

    public void setStillRunning(boolean stillRunning) {
        this.stillRunning = stillRunning;
    }
}
