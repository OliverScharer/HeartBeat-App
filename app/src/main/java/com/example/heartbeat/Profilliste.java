package com.example.heartbeat;

import android.app.Application;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class Profilliste extends Application
{
    private ArrayList<Profilklasse> profilliste;
    private Profilklasse prret;
    private int angemeldetID;
    public Profilliste ()
    {
        profilliste = new ArrayList<Profilklasse>();
    }

    public ArrayList<Profilklasse> getProfilliste()
    {
        return profilliste;
    }


    public boolean getProfil(String passwort, String profilname, String eMail)
    {

        boolean gefunden = false;
        for(int i = 0; i< profilliste.size(); i++)
        {
            if (profilliste.get(i).getPasswort().contentEquals(passwort) && (profilliste.get(i).getProfilname().contentEquals(profilname) || profilliste.get(i).getEmail().contentEquals(eMail))) {
                prret = profilliste.get(i);
                gefunden = true;
                angemeldetID = i;
                break;
            }

        }
        return gefunden;
    }

    public void addProfil(Profilklasse profil)
    {
        profilliste.add(profil);
    }

    public Profilklasse getPrret() { return prret; }

    public int getAngemeldetID() {return angemeldetID;}

    public void setPrret(Profilklasse p)
    {
        this.prret = p;
    }


    public void ladeStandardProfile()
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

        int profilbild = R.drawable.profil;
        profilliste.add(new Profilklasse("Lars Lindgruen", "LarsLind@gmx.de", "123", "techno", "Darude", "Sandstorm", "Darude", profilbild, "techno", technosongs, "elektro", elektrosongs ));

        profilliste.add(new Profilklasse("Robin Joe Fränzel", "RobJoe@gmx.de", "123", "schlager", "Helene Fischer", "Atemlos", "Helene Fischer", profilbild, "schlager", schlagersongs, "blues", bluessongs ));

        profilliste.add(new Profilklasse("Daniel Dümmel", "DADÜ@gmx.de", "123", "pop", "Ariana Grande", "Bad Guy", "Billie Eilish", profilbild, "pop", popsongs, "rap", rapsongs ));

        profilliste.add(new Profilklasse("Oliver Scharer", "Oliver.Scharer@web.de", "134", "rock", "Eskimo Callboy", "Crystals", "Eskimo Callboy",profilbild, "rock", rocksongs, "pop", popsongs ));
    }



}
