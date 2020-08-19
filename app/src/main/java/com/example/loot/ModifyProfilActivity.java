package com.example.loot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ModifyProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_profil);

        EditText name = findViewById(R.id.profil_modify_name);
        name.setHint(User.getName());
        EditText tel = findViewById(R.id.profil_modify_tel);
        name.setHint(User.getPhone());
        EditText mail = findViewById(R.id.profil_modify_mail);
        name.setHint(User.getEmail());
        EditText country = findViewById(R.id.profil_modify_country);
        name.setHint(User.getCountry());
        ImageButton btn = (ImageButton) findViewById(R.id.No_player_return);
        ImageView home = findViewById(R.id.modify_home);
        ImageView profil = findViewById(R.id.modify_profil);
        Button valider = findViewById(R.id.modify_enregistrement);

        String sName = name.getText().toString();
        final String sPhone = tel.getText().toString();
        final String sEmail = mail.getText().toString();
        final String sCountry = country.getText().toString();

        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User.setName(sName);
                User.setPhone(sPhone);
                User.setEmail(sEmail);
                User.setCountry(sCountry);

            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModifyProfilActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModifyProfilActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
    }
}
