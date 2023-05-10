package com.example.imdb.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class MovieItem {
    private int id;
    @SerializedName("poster_path")
    private String posterPath;
    @SerializedName("release_date")
    private String releaseDate;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovieItem)) return false;
        MovieItem movieItem = (MovieItem) o;
        return getId() == movieItem.getId() && Objects.equals(getPosterPath(), movieItem.getPosterPath()) && Objects.equals(getReleaseDate(), movieItem.getReleaseDate()) && Objects.equals(getTitle(), movieItem.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPosterPath(), getReleaseDate(), getTitle());
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "id=" + id +
                ", posterPath='" + posterPath + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
