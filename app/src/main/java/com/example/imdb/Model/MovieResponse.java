package com.example.imdb.model;


import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class MovieResponse {
    private int page;
    @SerializedName("results")
    private List<MovieItem> movies;
    @SerializedName("total_pages")
    private int totalPages;
    @SerializedName("total_results")
    private int totalResult;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<MovieItem> getMovies() {
        return movies;
    }

    public void setMovies(List<MovieItem> movies) {
        this.movies = movies;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(int totalResult) {
        this.totalResult = totalResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovieResponse)) return false;
        MovieResponse that = (MovieResponse) o;
        return getPage() == that.getPage() && getTotalPages() == that.getTotalPages() && getTotalResult() == that.getTotalResult() && getMovies().equals(that.getMovies());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPage(), getMovies(), getTotalPages(), getTotalResult());
    }

    @Override
    public String toString() {
        return "MovieResponse{" +
                "page=" + page +
                ", movies=" + movies +
                ", totalPages=" + totalPages +
                ", totalResult=" + totalResult +
                '}';
    }
}