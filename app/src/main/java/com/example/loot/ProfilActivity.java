package com.example.loot;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProfilActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        ImageButton retour_profil = findViewById(R.id.retour_profil);

        retour_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfilActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        TextView name = findViewById(R.id.profil_name);
        TextView game_name = findViewById(R.id.profil_game_name);
        TextView pseudo = findViewById(R.id.profil_pseudo);
        //TextView game_level = findViewById(R.id.profil_level);

        name.setText(User.getName());
        game_name.setText(Game.getTitle());
        pseudo.setText(User.getGames());
        //game_level.setText(); //manque le niveau

        /*ImageView settings = findViewById(R.id.profil_settings);*/
        ImageView profil = findViewById(R.id.profil_profil);
        ImageView home = findViewById(R.id.profil_home);

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfilActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfilActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        /*settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCreateContextMenu();
            }
        });*/


    }
}
