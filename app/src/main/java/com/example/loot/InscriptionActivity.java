package com.example.loot;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class InscriptionActivity extends AppCompatActivity {

    public String sName;
    public String sPseudo;
    public String sTel;
    public String sMail;
    public String sLangue;
    public String sPwd;

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        Button validate = (Button) findViewById(R.id.validation_inscription);

        EditText name = (EditText) findViewById(R.id.name_inscription);
        sName = name.getText().toString();
        EditText tel = (EditText) findViewById(R.id.tel_inscription);
        sTel = tel.getText().toString();
        EditText mail = (EditText) findViewById(R.id.mail_inscription);
        sMail = mail.getText().toString();
        EditText langue = (EditText) findViewById(R.id.langue_inscription);
        sLangue = langue.getText().toString();
        EditText pwd = (EditText) findViewById(R.id.pwd_inscription);
        sPwd = pwd.getText().toString();

        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sName != "" && sTel != "" && sMail != "" && sLangue != "" && sPwd != "") {
                    Toast.makeText(getApplicationContext(), "You did not enter all of information", Toast.LENGTH_SHORT).show();
                } else {
                    sName.setName();
                    sTel.setPhone();
                    sMail.setEmail();
                    sLangue.setLanguage();
                    sPwd.setPassword();

                    Intent intent = new Intent(InscriptionActivity.this, ProfilActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
