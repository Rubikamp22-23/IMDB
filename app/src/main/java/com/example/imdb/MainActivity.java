package com.example.imdb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.imdb.Adapter.MovieAdapter;
import com.example.imdb.Model.MovieModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;
    private List<MovieModel> movieModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview_movie_list);
        movieModelList = new ArrayList<>();
        movieModelList.add(new MovieModel("jont", "9828"));
        movieModelList.add(new MovieModel("jont", "9828"));
        movieModelList.add(new MovieModel("jont", "9828"));
        movieModelList.add(new MovieModel("jont", "9828"));
        movieModelList.add(new MovieModel("jont", "9828"));
        movieModelList.add(new MovieModel("jont", "9828"));

        movieAdapter = new MovieAdapter(movieModelList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext(), RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(movieAdapter);
    }

    }