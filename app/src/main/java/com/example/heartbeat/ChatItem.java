package com.example.heartbeat;

public class ChatItem
{
    private int mImageResource;
    private String mText1;

    private int mImageResource2;


    public ChatItem( int imageResource1, String text1, int imageResource2)
    {
        mImageResource = imageResource1;
        mText1 = text1;
        mImageResource2 = imageResource2;
    }

    public int getImageResource()
    {
        return mImageResource;
    }
    public String getText1()
    {
        return mText1;
    }

    public int getImageresource2()
    {
        return mImageResource2;
    }
}


