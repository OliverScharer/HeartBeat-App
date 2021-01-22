package com.example.heartbeat;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Profilliste extends AppCompatActivity
{

    private ArrayList<Profilklasse> profilliste;
    private ArrayList<String[]> matchliste;
    private Profilklasse prret;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matches);

        ArrayList<String> rocksongs = new ArrayList<String>();
        ArrayList<String> popsongs = new ArrayList<String>();
        ArrayList<String> rapsongs = new ArrayList<String>();
        ArrayList<String> schlagersongs = new ArrayList<String>();
        ArrayList<String> bluessongs = new ArrayList<String>();
        ArrayList<String> elektrosongs = new ArrayList<String>();
        ArrayList<String> technosongs = new ArrayList<String>();

        rocksongs.add("Bloody Valentine - MachineGunKelly");
        rocksongs.add("Waidmanns Heil - Rammstein");
        rocksongs.add("Crystals - Eskimo Callboy");

        popsongs.add("Bad Blood- Taylor Swift");
        popsongs.add("All the good girls go to Hell - Billie Eilish");
        popsongs.add("Somebody that I used to know - Goyte");
        popsongs.add("Style - Taylor Swift");

        rapsongs.add("Lose Yourself - Eminem");
        rapsongs.add("Bombay Calling - OK KID");

        schlagersongs.add("Atemlos - Helene Fischer");
        schlagersongs.add("So bist du - Peter Maffai");

        bluessongs.add("Slow Blues - Buddy Guy");
        bluessongs.add("Got My Mojo Working - Muddy Waters");
        bluessongs.add("Dust My Broom - Elmore James");

        elektrosongs.add("Ill fly with you - Gigi di Agostino");
        elektrosongs.add("Lean On - DJ Snake");

        technosongs.add("Sandstorm - Darude");
        technosongs.add("Sandstorm - Darude");
        technosongs.add("Sandstorm - Darude");
        technosongs.add("Sandstorm - Darude");

        //Konstruktor mit den Angaben:
        // profilname, email, passwort, liebGenre, liebKuenstler, lieblingsliedName, lieblingsliedKuenstler, profilbild, genre1S,  genre1, genre2S,genre2

        int profilbild = R.drawable.profilbild;
        int profilbildLisa = R.drawable.lisa;
        int profilbildOli = R.drawable.oli1;


        profilliste.add(new Profilklasse("Lars Lindgruen", "LarsLind@gmx.de", "123", "techno", "Darude", "Sandstorm", "Darude", profilbild, "techno", technosongs, "elektro", elektrosongs ));

        profilliste.add(new Profilklasse("Robin Joe Fränzel", "RobJoe@gmx.de", "123", "schlager", "Helene Fischer", "Atemlos", "Helene Fischer", profilbild, "schlager", schlagersongs, "blues", bluessongs ));

        profilliste.add(new Profilklasse("Daniel Duemmel", "DADÜ@gmx.de", "123", "pop", "Ariana Grande", "Bad Guy", "Billie Eilish", profilbild, "pop", popsongs, "rap", rapsongs ));

        profilliste.add(new Profilklasse("Oliver Scharer", "Oliver.Scharer@web.de", "1", "rock", "Eskimo Callboy", "Crystals", "Eskimo Callboy",profilbildOli, "rock", rocksongs, "pop", popsongs ));

        matchliste = new ArrayList<>();

        matchliste.add(new String[]{"Oliver Scharer","700124", "62%"});
        matchliste.add(new String[]{"Lisa Langwaldt","700131", "46%"});
        matchliste.add(new String[]{"Solveig Nakladal","700094", "62%"});
        matchliste.add(new String[]{"Jens Jenssen","700089", "62%"});
        matchliste.add(new String[]{"Jason Momoa","700124", "62%"});
        matchliste.add(new String[]{"Jenniffer Lawrence","700124", "62%"});
    }

    public ArrayList<String[]> getProfile()
    {
        return matchliste;
    }




}
