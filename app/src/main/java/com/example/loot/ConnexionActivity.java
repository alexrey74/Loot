package com.example.loot;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ConnexionActivity extends AppCompatActivity {

    private String sUsername;
    private String sPwd;

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        Button validate = (Button) findViewById(R.id.validation_connexion);
        EditText username = (EditText) findViewById(R.id.connexion_username);
        sUsername = username.getText().toString();
        EditText pwd = (EditText) findViewById(R.id.connexion_password);
        sPwd = pwd.getText().toString();

        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sUsername == getUsername() && sPwd == getPassword()) {
                    Toast.makeText(getApplicationContext(), "You did not enter the good username or password", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(ConnexionActivity.this, ProfilActivity.class);
                    startActivity(intent);
                }
            }
        });

        TextView pwdForget = (TextView) findViewById(R.id.connexion_pwd_forgot);

            pwdForget.setMovementMethod(LinkMovementMethod.getInstance());


    }
}
