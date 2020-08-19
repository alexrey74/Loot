package com.example.loot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button connexion = (Button) findViewById(R.id.Connexion_main);
        Button inscription = (Button) findViewById(R.id.Inscription_main);

        connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_connexion = new Intent(MainActivity.this, ConnexionActivity.class);
                startActivity(intent_connexion);
            }
        });

        inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_inscription = new Intent(MainActivity.this, InscriptionActivity.class);
                startActivity(intent_inscription);

            }
        });
    }
}
