package com.example.imdb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.imdb.Adapter.MovieAdapter;
import com.example.imdb.model.MovieModel;
import com.example.imdb.model.MovieResponse;
import com.example.imdb.retrofit.ApiClient;
import com.example.imdb.retrofit.MovieApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements OnItemClickMovie {
    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;
    private List<MovieModel> movieModelList;

    //retrofit
    private static final String TAG = "MainActivity";
    private MovieApiInterface movieApiInterface;
    private void callData(){
        Call<MovieResponse> movieInterface2ResponseDataMovie = movieApiInterface.getPopularMovie(3);
        movieInterface2ResponseDataMovie.enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
               MovieResponse responseDataMovie = response.body();
                Log.i(TAG, "onResponse: " + responseDataMovie);
            }

            @Override
            public void onFailure(Call<MovieResponse> call, Throwable throwable) {
                Log.i(TAG, "onFailure: " + throwable.getMessage());
            }
        });
    }
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //retrofit
        movieApiInterface = ApiClient.getClient();
        callData();
        //

        recyclerView=findViewById(R.id.recyclerview_movie_list);
        movieModelList =new ArrayList<>();
        movieModelList.add(new MovieModel("","Th","9093","","","https://m.imdb.com/title/tt11290880/"));


        movieAdapter=new MovieAdapter(this, movieModelList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext(),RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(movieAdapter);
    }

    @Override
    public void OnItemClick(MovieModel movieModel) {

    }
}



