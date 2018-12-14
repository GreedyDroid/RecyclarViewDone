package com.example.nurud.recyclarviewdone;

class Movie {

    private String moveName;
    private String year;
    private int image;

    public Movie(String moveName, String year, int image) {
        this.moveName = moveName;
        this.year = year;
        this.image = image;
    }

    public Movie() {
    }

    public String getMoveName() {
        return moveName;
    }

    public String getYear() {
        return year;
    }

    public int getImage() {
        return image;
    }
}
