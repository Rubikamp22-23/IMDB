package com.example.imdb.Retrofit;

import com.example.imdb.Retrofit.retrofitModels.ResponseDataMovie;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieInterface2 {
    @GET("51e314fae7484debb5f618ebb580cb3b")
    Call<List<ResponseDataMovie>>getResponseDataMovie();

}

