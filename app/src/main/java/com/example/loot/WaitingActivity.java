package com.example.loot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WaitingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting);

        ImageView imgRotation = (ImageView) findViewById(R.id.waiting_image_rotation);

        imgRotation.setAnimation(AnimationUtils.loadAnimation(this, R.anim.animation));


        if () { //!getUser()
            Intent intent = new Intent(this, NoPlayerActivity.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, ListeJoueurActivity.class);
            startActivity(intent);
        }

        ImageButton retour = (ImageButton) findViewById(R.id.retour_waiting);

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WaitingActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
    }
}
