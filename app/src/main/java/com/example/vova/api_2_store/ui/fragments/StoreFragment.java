package com.example.vova.api_2_store.ui.fragments;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vova.api_2_store.Config;
import com.example.vova.api_2_store.R;
import com.example.vova.api_2_store.app.ApiClient;
import com.example.vova.api_2_store.model.Store;
import com.example.vova.api_2_store.ui.adapters.StoreAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Vova on 21.09.2016.
 */

public class StoreFragment extends Fragment {

    private Context context = getActivity();
    private RecyclerView recycler;
    private ArrayList<Store> stores;
    private StoreAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_store, container, false);
        stores = new ArrayList<>();
        recycler = (RecyclerView) v.findViewById(R.id.recycler_view_store);
        recycler.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recycler.setLayoutManager(linearLayoutManager);

        adapter = new StoreAdapter(context, stores);
        recycler.setAdapter(adapter);

       //Toast.makeText(context, "Fragment suka Stores", Toast.LENGTH_SHORT).show();

        //Log.d("Log", "Privet");
        return v;
    }

    private void getRequestStore(final ArrayList stores)
    {
        Call<List<Store>> call = ApiClient.getStoreService().getStores("", 100);
        call.enqueue(new Callback<List<Store>>() {
            @Override
            public void onResponse(Response<List<Store>> response) {
                if (response.isSuccess())
                {
                    List<Store> testList = response.body();
                    for (Object obj : testList)
                    {
                        Store storeObj = (Store) obj;
                        Config._idStore = storeObj.getId();
                        Config._nameStore = storeObj.getName();
                        Config._addressStore = storeObj.getAddress();
                        Config._phoneStore = storeObj.getPhone();
                        Config._locationStore = storeObj.getLocation();
                    }

                    recycler.setAdapter(adapter);
                    stores.clear();
                    stores.addAll(response.body());
                    adapter.notifyDataSetChanged();
                    System.out.println(response.body().toString());
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}
