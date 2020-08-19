package com.example.loot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SearchSecondActivity extends AppCompatActivity {

    private int cpt = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search2);

        Button plus = findViewById(R.id.compteur_plus);
        Button moins = findViewById(R.id.compteur_moins);
        final TextView compteur = findViewById(R.id.compteur_recherches);
        final Button loisir = findViewById(R.id.loisir);
        final Button competition = findViewById(R.id.competition);
        Button valider = findViewById(R.id.rechercher_joueur);
        LinearLayout nbJoueur = findViewById(R.id.layout_nb_joueurs);
        ImageView home = findViewById(R.id.search2_home);
        ImageView shop = findViewById(R.id.search2_shop);
        ImageView settings = findViewById(R.id.search2_settings);
        ImageView chat = findViewById(R.id.search2_chat);
        ImageView profil = findViewById(R.id.search2_profil);

        if () {
            nbJoueur.setVisibility(View.INVISIBLE);
        }

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cpt++;
                compteur.setText(cpt);

            }
        });

        moins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cpt--;
                compteur.setText(cpt);
            }
        });

        loisir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loisir.setBackground(getDrawable(R.drawable.loisir_or_competition));
                loisir.setTextColor(getColor(R.color.white));
                competition.setBackground(getDrawable(R.drawable.specific_button));
                competition.setTextColor(getColor(R.color.medium_blue));

            }
        });

        competition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                competition.setBackground(getDrawable(R.drawable.loisir_or_competition));
                competition.setTextColor(getColor(R.color.white));
                loisir.setBackground(getDrawable(R.drawable.specific_button));
                loisir.setTextColor(getColor(R.color.medium_blue));
            }
        });

        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchSecondActivity.this, WaitingActivity.class);
                startActivity(intent);
            }
        });

        /*settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchSecondActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchSecondActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });





    }
}
