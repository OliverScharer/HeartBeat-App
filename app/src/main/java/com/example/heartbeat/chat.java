package com.example.heartbeat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class chat extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

    ImageView zurueck = (ImageView)findViewById(R.id.zurueck);
    zurueck.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(chat.this, matches.class));
        }
    });

        ImageView iw_matcheskonfig = (ImageView) findViewById(R.id.iw_matcheskonfig);
        iw_matcheskonfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chat.this,matcheskonfig.class));
            }
        });
        ImageView senden = (ImageView) findViewById(R.id.senden);
    senden.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });
    //bottom navigation
        ImageButton btnprofil = (ImageButton) findViewById(R.id.btn_profil);
        btnprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(chat.this, profil.class ));
            }
        });
        ImageButton btnmusic = (ImageButton) findViewById(R.id.btn_music);
        btnmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(chat.this, musicplayer.class ));
            }
        });
        ImageButton btnmatch = (ImageButton) findViewById(R.id.btn_matches);
        btnmatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(chat.this, matches.class ));
            }
        });



    }
}
