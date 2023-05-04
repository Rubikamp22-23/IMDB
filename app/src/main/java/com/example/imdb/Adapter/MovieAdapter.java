package com.example.imdb.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.imdb.Model.MovieModel;
import com.example.imdb.R;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private List<MovieModel>movieModelList;

    public MovieAdapter(List<MovieModel> movieModelList) {
        this.movieModelList = movieModelList;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_row_layout, parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        MovieModel movieModel = movieModelList.get(position);
        holder.movieNameTextView.setText(movieModel.getMovieName());
        holder.movieYearTextView.setText(movieModel.getYear());

    }

    @Override
    public int getItemCount() {
        return movieModelList.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        private AppCompatImageView movieImageView;
        private AppCompatTextView movieNameTextView;
        private AppCompatTextView movieYearTextView;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            movieImageView=itemView.findViewById(R.id.movie_imageview);
            movieNameTextView=itemView.findViewById(R.id.movie_year_textview);
            movieYearTextView=itemView.findViewById(R.id.movie_name_textview);


        }
    }

}

