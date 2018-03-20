package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createMovies();
        addMovieToDB();


    }

    private void addMovieToDB() {
        Movie temp = new Movie();
        temp.setAge(13);
        temp.setDesc("gasdgfasf");
        temp.setId("asdgf");
        temp.setPubish(13);
        temp.setName("asf");
        MovieDataSource addtemp = new MovieDataSource(this);
        addtemp.open();
        addtemp.insertMovie(temp);
        addtemp.close();


    }

    public void createMovies() {
        ArrayList<Movie> movielist = new ArrayList<Movie>();
        Movie pele = new Movie();

        movielist.add(pele);


    }
}
