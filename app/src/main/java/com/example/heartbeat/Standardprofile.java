package com.example.heartbeat;

import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Standardprofile extends AppCompatActivity {



    public void ladeProfile()
    {
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

        schlagersongs.add("Athemlos - Helene Fischer");
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

        ImageView profMaen = new ImageView(this);
        profMaen.setImageResource(R.drawable.profil);
        ((Profilliste) getApplication()).addProfil(new Profilklasse("Lars Lindgruen", "LarsLind@gmx.de", "123", "techno", "Darude", "Sandstorm", "Darude", profMaen, "techno", technosongs, "elektro", elektrosongs ));

        ((Profilliste) getApplication()).addProfil(new Profilklasse("Robin Joe Fränzel", "RobJoe@gmx.de", "123", "schlager", "Helene Fischer", "Atemlos", "Helene Fischer", profMaen, "schlager", schlagersongs, "blues", bluessongs ));

        ((Profilliste) getApplication()).addProfil(new Profilklasse("Daniel Dümmel", "DADÜ@gmx.de", "123", "pop", "Ariana Grande", "Bad Guy", "Billie Eilish", profMaen, "pop", popsongs, "rap", rapsongs ));

        ((Profilliste) getApplication()).addProfil(new Profilklasse("Oliver Scharer", "Oliver.Scharer@web.de", "134", "rock", "Eskimo Callboy", "Crystals", "Eskimo Callboy", profMaen, "rock", rocksongs, "pop", popsongs ));
    }
}
