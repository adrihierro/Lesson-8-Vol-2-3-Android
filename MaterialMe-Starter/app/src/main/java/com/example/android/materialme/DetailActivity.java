package com.example.android.materialme;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        TextView sportsTitle = findViewById(R.id.titleDetail);
        ImageView sportsImage = findViewById(R.id.sportsImageDetail);


        String title = getIntent().getStringExtra("title");
        sportsTitle.setText(title);
        int imageRes = getIntent().getIntExtra("image", 0);
        Glide.with(this).load(imageRes).into(sportsImage);
    }
}
