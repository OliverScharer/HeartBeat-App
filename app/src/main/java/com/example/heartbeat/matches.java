package com.example.heartbeat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class matches extends AppCompatActivity
{
    private RecyclerView matchview;
    private listviewadapt adapter;
    private RecyclerView.LayoutManager layoutmanager;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matches);

        ArrayList<MatchItem> matchliste = new ArrayList<>();

        matchliste.add(new MatchItem(R.drawable.oli1,"Oliver Scharer", "62%", R.drawable.heart_red));
        matchliste.add(new MatchItem(R.drawable.lisa,"Lisa Langwaldt","46%", R.drawable.heart));
        matchliste.add(new MatchItem(R.drawable.solli,"Solveig Nakladal", "87%", R.drawable.heart_red));
        matchliste.add(new MatchItem(R.drawable.profilbild,"Sergej Fährlich", "20%", R.drawable.heart_blue));
        matchliste.add(new MatchItem(R.drawable.juice,"Jason Bourne", "15%", R.drawable.heart_blue));



        matchview = findViewById(R.id.matchview);
        matchview.setHasFixedSize(true); //won´t change in size for performance
        layoutmanager = new LinearLayoutManager(this);
        //passes List zu adapter who provides to holder
        adapter = new listviewadapt(matchliste);

        matchview.setLayoutManager(layoutmanager);
        matchview.setAdapter(adapter);


        //Bottomnavigation
        ImageView btnprofil = (ImageView) findViewById(R.id.btn_profil);
        btnprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(matches.this, profil.class ));
            }
        });
        ImageView btnchat = (ImageView) findViewById(R.id.btn_chat);
        btnchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(matches.this, chat_uebersicht.class ));
            }
        });
        ImageView btnmusic = (ImageView) findViewById(R.id.btn_music);
        btnmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(matches.this, musicplayer.class ));
            }
        });
        //Bottomnavigation ende
        Button matchBtn1 = (Button)findViewById(R.id.matchBtn1);

    }

}
