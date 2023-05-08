package com.example.imdb.Model;
import java.time.Year;

public class MovieModel {
    private String image;
    private String names;
    private String year;
    private String i_m_d_b;
    private String genres;
    private String link;

    public String getI_m_d_b() {
        return i_m_d_b;
    }

    public void setI_m_d_b(String i_m_d_b) {
        this.i_m_d_b = i_m_d_b;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public MovieModel(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public MovieModel(String image, String names, String year,String genres,String i_m_d_b,String link) {
        this.image = image;
        this.names = names;
        this.year=year;
        this.genres=genres;
        this.i_m_d_b=i_m_d_b;
        this.link=link;

    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}

