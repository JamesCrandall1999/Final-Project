package com.company.models;

public class Movie {
    private int imdbNumber;
    private String title;
    private int year;
    private String mpaaRating;
    private String runLength;
    private String genre;
    private String dateAdded;
    private boolean wasWatched;
    private String[] previousDatesWatched;
    private String youtubeLink;
    private String rottentomatoesLink;



    public int getImdbNumber() {
        return imdbNumber;
    }

    public void setImdbNumber(int imdbNumber) {
        this.imdbNumber = imdbNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public String getRunLength() {
        return runLength;
    }

    public void setRunLength(String runLength) {
        this.runLength = runLength;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public boolean isWasWatched() {
        return wasWatched;
    }

    public void setWasWatched(boolean wasWatched) {
        this.wasWatched = wasWatched;
    }

    public String[] getPreviousDatesWatched() {
        return previousDatesWatched;
    }

    public void setPreviousDatesWatched(String[] previousDatesWatched) {
        this.previousDatesWatched = previousDatesWatched;
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public String getRottentomatoesLink() {
        return rottentomatoesLink;
    }

    public void setRottentomatoesLink(String rottentomatoesLink) {
        this.rottentomatoesLink = rottentomatoesLink;
    }
}
