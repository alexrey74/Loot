package com.example.loot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GameInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_games);

        TextView title = findViewById(R.id.);
        title.setText(Games.getTitle);
        TextView level = findViewById(R.id.level_games_info);
        TextView pseudo = findViewById(R.id.pseudo_games_info);

        ImageView home = findViewById(R.id.games_info_home);
        ImageView profil = findViewById(R.id.games_info_profil);
        ImageView settings = findViewById(R.id.games_info_settings);

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameInfoActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameInfoActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
    }
}
