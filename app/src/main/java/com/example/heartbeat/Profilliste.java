package com.example.heartbeat;

import android.app.Application;
import android.util.Log;

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




}
