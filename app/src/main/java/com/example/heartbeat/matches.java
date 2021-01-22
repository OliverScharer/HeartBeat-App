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

        ArrayList<String[]> matchliste = new ArrayList<>();

        matchliste.add(new String[]{"Oliver Scharer","700124", "62%"});
        matchliste.add(new String[]{"Lisa Langwaldt","700131", "46%"});
        matchliste.add(new String[]{"Solveig Nakladal","700094", "62%"});
        matchliste.add(new String[]{"Jens Jenssen","700089", "62%"});
        matchliste.add(new String[]{"Jason Momoa","700124", "62%"});
        matchliste.add(new String[]{"Jenniffer Lawrence","700124", "62%"});

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

        Button matchBtn1 = (Button)findViewById(R.id.matchBtn1);
        matchBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getMatchlist(matchliste);
            }
        });



        //Bottomnavigation ende
        //matchliste übergeben
        //getMatchlist();
    }

    //füllt ListView mit einträgen, indem in Adapter übergeben wird
    public void getMatchlist(ArrayList<String[]> matchlist){
        matchview = findViewById(R.id.matchview);
        layoutmanager = new LinearLayoutManager(this);
        matchview.setLayoutManager(layoutmanager);
        adapter = new listviewadapt(matchlist);
        adapter.setOnItemClickListener(new listviewadapt.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                //CLick auf gesamte cardview
            }
        });
    }
}
