package com.example.imdb.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imdb.Data;
import com.example.imdb.Details;
import com.example.imdb.model.MovieModel;
import com.example.imdb.OnItemClickMovie;
import com.example.imdb.R;

import java.util.List;


public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private OnItemClickMovie onItemClickMovie;
    private List<MovieModel> movieModelList;

    public MovieAdapter(OnItemClickMovie onItemClickMovie, List<MovieModel> movieModelList) {
        this.onItemClickMovie = onItemClickMovie;
        this.movieModelList = movieModelList;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_row_layout,parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        MovieModel movieModel = movieModelList.get(position);

        holder.textViewMovie.setText(movieModel.getNames());
        holder.textViewYear.setText(movieModel.getYear());

        holder.itemView.setOnClickListener(view -> {
            Context context = view.getContext();
            Intent intent = new Intent(context, Details.class);
            intent.putExtra(Data.NAME, movieModel.getNames());
            intent.putExtra(Data.IMAGE, movieModel.getImage());
            intent.putExtra(Data.GENRES,movieModel.getGenres());
            intent.putExtra(Data.LINK,movieModel.getLink());
            intent.putExtra(Data.IMDB,movieModel.getI_m_d_b());
            intent.putExtra(Data.YEAR,movieModel.getYear());

            context.startActivity(intent);

        });

    }

    @Override
    public int getItemCount() {
        return movieModelList.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        private AppCompatImageView imageViewMovie;
        private AppCompatTextView textViewMovie;
        private AppCompatTextView textViewYear;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewMovie=itemView.findViewById(R.id.movie_imageview);
            textViewMovie=itemView.findViewById(R.id.movie_name_textview);
            textViewYear=itemView.findViewById(R.id.movie_year_textview);

        }
    }
}


