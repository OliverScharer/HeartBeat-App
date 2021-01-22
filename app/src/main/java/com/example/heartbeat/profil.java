package com.example.heartbeat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class profil extends AppCompatActivity
{


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);

        ImageView profilbearbeiten = (ImageView) findViewById(R.id.profilbearbeiten);
        profilbearbeiten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil.this, profilbearbeiten.class));
            }
        });

        ImageView menue = (ImageView) findViewById(R.id.menue);
        menue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil.this, suchekonfig.class ));
            }
        });
        //Bottomnavigation
        ImageButton btnprofil = (ImageButton) findViewById(R.id.btn_profil);
        btnprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(profil.this, profil.class ));
            }
        });
        ImageButton btnchat = (ImageButton) findViewById(R.id.btn_chat);
        btnchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(profil.this, chat_uebersicht.class ));
            }
        });
        ImageButton btnmusic = (ImageButton) findViewById(R.id.btn_music);
        btnmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(profil.this, musicplayer.class ));
            }
        });
        ImageButton btnmatch = (ImageButton) findViewById(R.id.btn_matches);
        btnmatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(profil.this, matches.class ));
            }
        });


    }
}
