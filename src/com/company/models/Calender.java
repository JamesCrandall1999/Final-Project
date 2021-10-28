package com.company.models;

public class Calender {
    private int imdbNumber;
    private String movieNight;
    private boolean rollCall[];

    public int getImdbNumber() {
        return imdbNumber;
    }

    public void setImdbNumber(int imdbNumber) {
        this.imdbNumber = imdbNumber;
    }

    public String getMovieNight() {
        return movieNight;
    }

    public void setMovieNight(String movieNight) {
        this.movieNight = movieNight;
    }

    public boolean[] getRollCall() {
        return rollCall;
    }

    public void setRollCall(boolean[] rollCall) {
        this.rollCall = rollCall;
    }
}
