package com.example.vova.api_2_store.Realm;

import io.realm.Realm;
import io.realm.RealmObject;

/**
 * Created by Vova on 21.09.2016.
 */

public class StoreRealm extends RealmObject {
    private int mId;
    private String mName;
    private String mAddress;
    private String mPhone;
    private LocationRealm mLocation;

    public StoreRealm(){}

    public StoreRealm(int mId, String mName, String mAddress,
                      String mPhone, LocationRealm mLocation)
    {
        this.mId = mId;
        this.mName = mName;
        this.mAddress = mAddress;
        this.mPhone = mPhone;
        this.mLocation = mLocation;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public LocationRealm getmLocation() {
        return mLocation;
    }

    public void setmLocation(LocationRealm mLocation) {
        this.mLocation = mLocation;
    }
}
