package com.example.heartbeat;

import android.app.Application;
import android.widget.ImageView;

import java.util.ArrayList;

public class Profilklasse
{
    private String profilname;
    private String email;
    private String passwort;
    private String liebKuenstler;
    private int gebJahr;
    private String liebGenre;
    private String geschlecht;
    private String lieblingsliedName;
    private String lieblingsliedKuenstler;
    private String ausrichtung;
    private int profilbild;

    private ArrayList<String> rock, rap, schlager, blues, elektro, techno, pop, sonstige;

    public Profilklasse (String profilname, String email, String passwort)
    {
        this.profilname = profilname;
        this.passwort = passwort;
        this.email = email;
    }

    public Profilklasse (String profilname, String email, String passwort, String liebGenre, String liebKuenstler, String lieblingsliedName, String lieblingsliedKuenstler, int profilbild, String genre1S, ArrayList<String> genre1, String genre2S, ArrayList <String> genre2)
    {
        this.profilname = profilname;
        this.passwort = passwort;
        this.email = email;
        this.liebGenre = liebGenre;
        this.liebKuenstler = liebKuenstler;
        this.lieblingsliedName = lieblingsliedName;
        this.lieblingsliedKuenstler = lieblingsliedKuenstler;
        this.profilbild = profilbild;
        if(genre1S.contentEquals("rock"))
            this.rock = genre1;
        if(genre2S.contentEquals("rock"))
            this.rock = genre2;
        if(genre1S.contentEquals("rap"))
            this.rap = genre1;
        if(genre2S.contentEquals("rap"))
            this.rap = genre2;
        if(genre1S.contentEquals("elektro"))
            this.elektro = genre1;
        if(genre2S.contentEquals("elektro"))
            this.elektro = genre2;
        if(genre1S.contentEquals("blues"))
            this.blues = genre1;
        if(genre2S.contentEquals("blues"))
            this.blues = genre2;
        if(genre1S.contentEquals("techno"))
            this.techno = genre1;
        if(genre2S.contentEquals("techno"))
            this.techno = genre2;
        if(genre1S.contentEquals("pop"))
            this.pop = genre1;
        if(genre2S.contentEquals("pop"))
            this.pop = genre2;

    }
//Getter
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
    public String getLiebKuenstler() { return liebKuenstler;}
    public String getLiebGenre() {return liebGenre;}
    public String getGeschlecht() {return geschlecht;}
    public String getLieblingsliedName () {return lieblingsliedName;}
    public String getLieblingsliedKuenstler () {return lieblingsliedKuenstler;}
    public int getProfilbild() {return profilbild;}
    public int getGebJahr() {return gebJahr;}


//Setter
    public void setPasswort(String passwort)
    {
        this.passwort = passwort;
    }
    public void setLiebKuenstler(String liebKuenstler)
    {
        this.liebKuenstler = liebKuenstler;
    }
    public void setLieblingsliedKuenstler(String lieblingsliedKuenstler) {
        this.lieblingsliedKuenstler = lieblingsliedKuenstler;
    }
    public void setLieblingsliedName(String lieblingsliedName) {
        this.lieblingsliedName = lieblingsliedName;
    }
    public void setLiebGenre(String liebGenre)
    {
        this.liebGenre = liebGenre;
    }
    public void setGebJahr(int gebJahr)
    {
        this.gebJahr = gebJahr;
    }
    public void setGeschlecht(String geschlecht)
    {
        this.geschlecht = geschlecht;
    }
    public void setProfilbild(int profilbild){ this.profilbild = profilbild;}
    public void setProfilname(String profilname)
    {
        this.profilname = profilname;
    }
    public void setEmail(String eMail)
    {
        this.email = email;
    }


//addermethoden
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
    public void addSonstige(String song) {sonstige.add(song);}
}
