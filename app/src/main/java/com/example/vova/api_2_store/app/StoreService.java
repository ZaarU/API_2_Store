package com.example.vova.api_2_store.app;

import com.example.vova.api_2_store.model.Store;
import com.example.vova.api_2_store.model.Tools;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Vova on 21.09.2016.
 */

public interface StoreService {
    @GET("/stores")
    Call<List<Store>> getStores(@Query("q") String q, @Query("limit") int limit);

    @GET("/stores/{id}/instruments")
    Call<List<Tools>> setStoresTools(@Path("id") int id);
}
