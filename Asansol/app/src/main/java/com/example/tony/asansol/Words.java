package com.example.tony.asansol;

public class Words {
    int mDescrption,mHeading;
    int mImage;

    Words(int mHeading,int mDescrption,int mImage)
    {
        this.mHeading = mHeading;
        this.mDescrption = mDescrption;
        this.mImage = mImage;
    }

    public int getmHeading() {
        return mHeading;
    }

    public int getmDescrption() {
        return mDescrption;
    }

    public int getmImage() {
        return mImage;
    }
}
