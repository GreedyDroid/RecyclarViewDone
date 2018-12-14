package com.example.nurud.recyclarviewdone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclearView;
    private ArrayList<Movie>movies;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclearView = findViewById(R.id.myRecyclerView);
        movies = new ArrayList<>();
        movies.add(new Movie("Interstaller", "2001", R.mipmap.ic_launcher));
        movies.add(new Movie("InterStaller", "2011", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Minions", "2016", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Tomb Rider", "2001", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Spider Man", "2017", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Iron Man", "2007", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Super Man", "2013", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Bat Man", "2014", R.mipmap.ic_launcher_round));
        movies.add(new Movie("InterStaller", "2011", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Minions", "2016", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Tomb Rider", "2001", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Spider Man", "2017", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Iron Man", "2007", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Super Man", "2013", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Bat Man", "2014", R.mipmap.ic_launcher_round));

        movieAdapter = new MovieAdapter(this, movies);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);

        GridLayoutManager glm = new GridLayoutManager(this, 2);

        StaggeredGridLayoutManager sglm = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        mRecyclearView.setLayoutManager(glm);
        mRecyclearView.setAdapter(movieAdapter);

    }
}
