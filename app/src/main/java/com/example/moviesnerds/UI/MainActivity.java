package com.example.moviesnerds.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.moviesnerds.R;
import com.example.moviesnerds.pojo.MoviesModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView moviesNameTV;
    Button getMoviesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moviesNameTV = findViewById(R.id.textView);
        getMoviesButton = findViewById(R.id.button);
        getMoviesButton.setOnClickListener(this);
    }

    public MoviesModel getMoviesFromDatebase() {
        return new MoviesModel("fast", "1/4/2019", "7lw", 1);
    }

    public void getMovies() {
        moviesNameTV.setText(getMoviesFromDatebase().getName());
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            getMovies();
        }
    }
}
