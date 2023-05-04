package com.example.imdb.Model;

public class MovieModel {

    private String MovieName;
    private String Year;


    public MovieModel(String movieName, String year) {
        MovieName = movieName;
        Year = year;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }
}
