package com.example.vova.api_2_store.Realm;


import io.realm.RealmObject;

/**
 * Created by Vova on 21.09.2016.
 */

public class LocationRealm extends RealmObject {
    private int mLatitude;
    private int mLongitude;

    public LocationRealm()
    {}

    public LocationRealm(int mLatitude, int mLongitude)
    {
        this.mLatitude = mLatitude;
        this.mLongitude = mLongitude;
    }

    public int getmLatitude() {
        return mLatitude;
    }

    public void setmLatitude(int mLatitude) {
        this.mLatitude = mLatitude;
    }

    public int getmLongitude() {
        return mLongitude;
    }

    public void setmLongitude(int mLongitude) {
        this.mLongitude = mLongitude;
    }
}
