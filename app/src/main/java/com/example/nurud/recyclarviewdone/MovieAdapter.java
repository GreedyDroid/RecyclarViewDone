package com.example.nurud.recyclarviewdone;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder>{

    private Context context;
    private ArrayList<Movie>movies;

    public MovieAdapter(Context context, ArrayList<Movie> movies) {
        this.context = context;
        this.movies = movies;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.movie_row, viewGroup, false);

        MovieViewHolder movieViewHolder = new MovieViewHolder(v);

        return movieViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder movieViewHolder, int i) {
        movieViewHolder.movieNameTV.setText(movies.get(i).getMoveName());
        movieViewHolder.movieYearTV.setText(movies.get(i).getYear());
        movieViewHolder.movieIV.setImageResource(movies.get(i).getImage());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        TextView movieNameTV, movieYearTV;
        ImageView movieIV;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);

            movieIV = itemView.findViewById(R.id.movieIV);
            movieNameTV = itemView.findViewById(R.id.movieName);
            movieYearTV = itemView.findViewById(R.id.movieYearTv);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    Toast.makeText(context, movies.get(position).getMoveName(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}
