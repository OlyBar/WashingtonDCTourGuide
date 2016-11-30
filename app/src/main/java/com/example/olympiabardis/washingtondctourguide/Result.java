package com.example.olympiabardis.washingtondctourguide;

/**
 * Created by olympiabardis on 11/27/16.
 */

public class Result {

    private int mNameOfEstablishment;

    private int mEstablishmentLocation;

    private int mEstablishmentContact;

    private int mImageResourceId;

    public Result(int nameOfEstablishment, int establishmentLocation, int establishmentContact, int imageResourceId){
        mNameOfEstablishment = nameOfEstablishment;
        mEstablishmentLocation = establishmentLocation;
        mEstablishmentContact = establishmentContact;
        mImageResourceId = imageResourceId;
    }

    public int getNameOfEstablishment(){
        return mNameOfEstablishment;
    }

    public int getEstablishmentLocation(){
        return mEstablishmentLocation;
    }

    public int getEstablishmentContact(){
        return mEstablishmentContact;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }
}
