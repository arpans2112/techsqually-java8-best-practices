package com.techsqually.LinkedListTest.LinkedListChallange1;

public class Song {

    private String titile;
    private double duration;

    public Song(String titile, double duration) {
        this.titile = titile;
        this.duration = duration;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
