package com.example.loot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListeJoueurActivity extends AppCompatActivity {

    private int cpt = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ImageButton btn = (ImageButton) findViewById(R.id.result_return);
        ImageView home = findViewById(R.id.result_home);
        ImageView profil = findViewById(R.id.result_profil);
        TextView nbJoueur = findViewById(R.id.result_nb_dispo);

        /*if (Game.getUser) {
            cpt++;
            nbJoueur.setText(cpt + GetStrings(joueurs_dispo));
        }*/

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListeJoueurActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListeJoueurActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListeJoueurActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
    }
}
