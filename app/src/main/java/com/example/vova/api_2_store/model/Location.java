package com.example.vova.api_2_store.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vova on 21.09.2016.
 */

public class Location {
    @SerializedName("latitude")
    private int latitude;

    @SerializedName("longitude")
    private int longitude;

    public Location(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
}
