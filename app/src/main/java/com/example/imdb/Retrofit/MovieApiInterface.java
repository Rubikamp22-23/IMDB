package com.example.imdb.retrofit;

import com.example.imdb.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiInterface {
//    @GET("51e314fae7484debb5f618ebb580cb3b")
//    Call<List<ResponseDataMovie>>getResponseDataMovie();


    /**
     * https://api.themoviedb.org/3/movie/popular?api_key=f882fe7e318f300420b26bdf6e0db009&page=3 =>popular movies in page 3
     * https://api.themoviedb.org/3/movie/181812?api_key=f882fe7e318f300420b26bdf6e0db009 => details of movies
     * https://api.themoviedb.org/3/ => base url
     */

    //details
//    @GET("movie/{movie_id}")
//    fun getMovieDetails(@Path("movie_id")movieId:Int):Single<MovieDetails>

    //popular
    @GET("movie/popular")
    Call<MovieResponse> getPopularMovie(@Query("page") Integer page);

}

