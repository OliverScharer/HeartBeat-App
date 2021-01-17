package com.example.heartbeat;

public class Profilklasse
{
    private String profilname;
    private String email;
    private String passwort;
    private String profilbild;
    private int rock, rap, schlager, blues, elektro, techno, pop;

    public Profilklasse (String profilname, String email, String passwort)
    {
        this.profilname = profilname;
        this.passwort = passwort;
        this.email = email;
    }

    public void BluesUp()
    {
        blues = blues + 1;
    }

    public void elektroUp()
    {
        elektro = elektro +1;
    }

    public void popUp()
    {
        pop = pop +1;
    }

    public void rockUp()
    {
        rock = rock +1;
    }

    public void rapUp()
    {
        rap = rap +1;
    }

    public void schlagerUp()
    {
        schlager = schlager +1;
    }

    public void technoUp()
    {
        techno = techno +1;
    }
}
