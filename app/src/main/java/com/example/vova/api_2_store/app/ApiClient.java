package com.example.vova.api_2_store.app;

import android.content.Context;

import com.example.vova.api_2_store.Config;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * Created by Vova on 21.09.2016.
 */

public class ApiClient {

    private static final String ENDPOINT = Config.LINK_STORE;
    private static StoreService storeService;

    public static void init(Context context)
    {
        if (context == null)
            throw new IllegalArgumentException("contex cannot be null");

        final Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(ENDPOINT)
                .build();

        storeService = retrofit.create(StoreService.class);     // ТОЧНЕЕ УЗНАТЬ!!!
    }

    public static StoreService getStoreService()
    {
        if (storeService == null)
            throw new IllegalStateException("You must init!");
        return  storeService;
    }

    public  static StoreService getToolService()
    {
        if (storeService == null)
            throw new IllegalStateException("You must init!");
        return  storeService;
    }
}
