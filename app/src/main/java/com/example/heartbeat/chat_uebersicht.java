package com.example.heartbeat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class chat_uebersicht extends AppCompatActivity

{   // ListView
    private RecyclerView cRecyclerView;
    private ChatAdapter cAdapter;
    private RecyclerView.LayoutManager cLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_uebersicht);

        ArrayList<ChatItem> chatlist = new ArrayList<>();
        chatlist.add(new ChatItem( R.drawable.oli1, "Oliver Scharer", R.drawable.senden_weis));
        chatlist.add(new ChatItem( R.drawable.lisa, "Lisa Langeweile", R.drawable.senden_weis));
        chatlist.add(new ChatItem( R.drawable.solli, "Solveig Nakladal", R.drawable.senden_weis));
        chatlist.add(new ChatItem( R.drawable.profil, "Ulrike Meinhof", R.drawable.senden_weis));
        chatlist.add(new ChatItem( R.drawable.sick, "Simon Hees", R.drawable.senden_weis));
        chatlist.add(new ChatItem( R.drawable.profil, "Horst Ludwig Meyer", R.drawable.senden_weis));
        chatlist.add(new ChatItem( R.drawable.profil, "Brigitte Mohnhaupt", R.drawable.senden_weis));
        chatlist.add(new ChatItem( R.drawable.profil, "Andreas Baader", R.drawable.senden_weis));
        chatlist.add(new ChatItem( R.drawable.profil, "Ingeborg Barz", R.drawable.senden_weis));
        chatlist.add(new ChatItem( R.drawable.profil, "Monika Berberich", R.drawable.senden_weis));
        chatlist.add(new ChatItem( R.drawable.profil, "Henning Beer", R.drawable.senden_weis));
        chatlist.add(new ChatItem( R.drawable.profil, "Gudrun Ensslin", R.drawable.senden_weis));
        chatlist.add(new ChatItem( R.drawable.profil, "Paul wichtig", R.drawable.senden_weis));



        //Part 2

        cRecyclerView = findViewById(R.id.recycler);
        cRecyclerView.setHasFixedSize(true); //won´t change in size for performance
        cLayoutManager = new LinearLayoutManager(this);
        //passes List zu adapter who provides to holder
        cAdapter = new ChatAdapter(chatlist);

        cRecyclerView.setLayoutManager(cLayoutManager);
        cRecyclerView.setAdapter(cAdapter);
        cAdapter.setOnItemClickListener(new ChatAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                startActivity(new Intent(chat_uebersicht.this, chat.class));
            }
        });
        //ListView Ende

        //Bottomnavigation
        ImageView btnprofil = (ImageView) findViewById(R.id.btn_profil);
        btnprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(chat_uebersicht.this, profil.class ));
            }
        });

        ImageView btnmusic = (ImageView) findViewById(R.id.btn_music);
        btnmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(chat_uebersicht.this, musicplayer.class ));
            }
        });
        ImageView btnmatch = (ImageView) findViewById(R.id.btn_matches);
        btnmatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(chat_uebersicht.this, matches.class ));
            }
        });
    }




}
