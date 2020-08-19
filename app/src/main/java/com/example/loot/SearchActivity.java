package com.example.loot;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {

    public String text;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_search_player);

        Spinner game = findViewById(R.id.spinner_liste_jeux);

        text = game.getSelectedItem().toString();

        if (Games.getTitle() == text) {
            Intent intent = new Intent(SearchActivity.this, SearchSecondActivity.class);
            startActivity(intent);
        }
    }
}
