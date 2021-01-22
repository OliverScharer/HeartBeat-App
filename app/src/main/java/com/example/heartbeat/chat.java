package com.example.heartbeat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class chat extends AppCompatActivity
{

    EditText et;
    TextView tw;
    ImageView senden;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

        tw = (TextView) findViewById(R.id.textView);
        et = (EditText) findViewById(R.id.et_chat);
        senden = (ImageView) findViewById(R.id.senden);
        senden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = et.getText().toString();
                tw.setText(t);
            }
        });

        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText("");
            }
        });






    ImageView zurueck = (ImageView)findViewById(R.id.zurueck);
    zurueck.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(chat.this, chat_uebersicht.class));
        }
    });

        ImageView iw_matcheskonfig = (ImageView) findViewById(R.id.iw_matcheskonfig);
        iw_matcheskonfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chat.this,matcheskonfig.class));
            }
        });

    //bottom navigation
        ImageView btnprofil = (ImageView) findViewById(R.id.btn_profil);
        btnprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(chat.this, profil.class ));
            }
        });
        ImageView btnmusic = (ImageView) findViewById(R.id.btn_music);
        btnmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(chat.this, musicplayer.class ));
            }
        });
        ImageView btnmatch = (ImageView) findViewById(R.id.btn_matches);
        btnmatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(chat.this, matches.class ));
            }
        });



    }
}
