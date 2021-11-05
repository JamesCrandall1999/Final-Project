package com.company.models;

public class Movie {
    private String imdbNumber;
    private String title;
    private String year;
    private String mpaaRating;
    private String runLength;
    private String genre;
    private String dateAdded;
    private String wasWatched;
    private String previousDateWatched;
    private String youtubeLink;
    private String rottentomatoesLink;


    public Movie(String imdbNumber, String title, String year, String mpaaRating, String runLength, String genre, String dateAdded, String wasWatched, String previousDateWatched, String youtubeLink, String rottentomatoesLink) {
        this.imdbNumber = imdbNumber;
        this.title = title;
        this.year = year;
        this.mpaaRating = mpaaRating;
        this.runLength = runLength;
        this.genre = genre;
        this.dateAdded = dateAdded;
        this.wasWatched = wasWatched;
        this.previousDateWatched = previousDateWatched;
        this.youtubeLink = youtubeLink;
        this.rottentomatoesLink = rottentomatoesLink;
    }

    public String getImdbNumber() {
        return imdbNumber;
    }

    public void setImdbNumber(String imdbNumber) {
        this.imdbNumber = imdbNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
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

    public String isWasWatched() {
        return wasWatched;
    }

    public void setWasWatched(String wasWatched) {
        this.wasWatched = wasWatched;
    }

    public String getPreviousDatesWatched() {
        return previousDateWatched;
    }

    public void setPreviousDatesWatched(String previousDateWatched) {
        this.previousDateWatched = previousDateWatched;
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
