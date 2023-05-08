package com.example.imdb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.imdb.Adapter.MovieAdapter;
import com.example.imdb.Model.MovieModel;
import com.example.imdb.Retrofit.ApiClient;
import com.example.imdb.Retrofit.MovieInterface2;
import com.example.imdb.Retrofit.retrofitModels.ResponseDataMovie;

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
    private MovieInterface2 movieInterface2;
    private void callData(){
        Call<List<ResponseDataMovie>> movieInterface2ResponseDataMovie = movieInterface2.getResponseDataMovie();
        movieInterface2ResponseDataMovie.enqueue(new Callback<List<ResponseDataMovie>>() {
            @Override
            public void onResponse(Call<List<ResponseDataMovie>> call, Response<List<ResponseDataMovie>> response) {
                List<ResponseDataMovie> responseDataMovie = response.body();
                Log.i(TAG, "onResponse: " + responseDataMovie);
            }

            @Override
            public void onFailure(Call<List<ResponseDataMovie>> call, Throwable throwable) {
                Log.e(TAG, "onFailure: " + throwable.getMessage() );
            }
        });
    }
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //retrofit
        movieInterface2 = ApiClient.getClient().create(MovieInterface2.class);
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



