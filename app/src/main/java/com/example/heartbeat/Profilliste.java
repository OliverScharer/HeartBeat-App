package com.example.heartbeat;

import android.app.Application;
import android.util.Log;

import java.util.ArrayList;

public class Profilliste extends Application
{
    private ArrayList<Profilklasse> profilliste;
    private Profilklasse prret;
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
        for(Profilklasse pr : profilliste)
        {
            if (pr.getPasswort().contentEquals(passwort) && pr.getProfilname().contentEquals(profilname) || pr.getEmail().contentEquals(eMail)) {
                prret = pr;
                gefunden = true;
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

    public void setPrret(Profilklasse p)
    {
        this.prret = p;
    }




}
