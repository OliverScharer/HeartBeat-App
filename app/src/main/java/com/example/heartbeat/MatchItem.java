package com.example.heartbeat;

public class MatchItem
{
    private int simageresource;
    private String stext1;
    private String stext2;
    private int simageresource2;


    public MatchItem( int imageresource, String text1, String text2, int imageresource2)
    {
        simageresource = imageresource;
        stext2 = text1;
        stext2 = text2;
        simageresource2 = imageresource2;
    }


    public int getSimageresource()
    {
        return simageresource;
    }
    public String getStext1()
    {
        return stext1;
    }
    public String getStext2()
    {
        return stext2;
    }
    public int getSimageresource2()
    {
        return simageresource2;
    }

}
