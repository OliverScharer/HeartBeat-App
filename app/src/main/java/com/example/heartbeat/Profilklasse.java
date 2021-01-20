package com.example.heartbeat;

import java.util.ArrayList;

public class Profilklasse
{
    private String profilname;
    private String email;
    private String passwort;
    private String liebKuenstler;
    private int gebJahr;
    private String liebGenre;
    private String Geschlecht;

   // private String profilbild;
    private ArrayList<String> rock, rap, schlager, blues, elektro, techno, pop;

    public Profilklasse (String profilname, String email, String passwort)
    {
        this.profilname = profilname;
        this.passwort = passwort;
        this.email = email;
    }
//Getter und Setter
    public String getPasswort()
    {
        return passwort;
    }

    public String getProfilname()
    {
        return profilname;
    }

    public String getEmail()
    {
        return email;
    }

    public void setPasswort(String passwort)
    {
        this.passwort = passwort;
    }

    public void setProfilname(String profilname)
    {
        this.profilname = profilname;
    }

    public void setEmail(String eMail)
    {
        this.email = email;
    }

    public void addBlues(String song)
    {
        blues.add(song);
    }

    public void addElektro(String song)
    {
        elektro.add(song);
    }

    public void addPop(String song){ pop.add(song); }

    public void addRock(String song)
    {
        rock.add(song);
    }

    public void addRap(String song)
    {
        rap.add(song);
    }

    public void addSchlager(String song)
    {
        schlager.add(song);
    }

    public void addTechno(String song)
    {
        techno.add(song);
    }
}
