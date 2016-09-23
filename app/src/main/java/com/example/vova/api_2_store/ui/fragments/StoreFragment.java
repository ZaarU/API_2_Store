package com.example.vova.api_2_store.ui.fragments;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.vova.api_2_store.R;

/**
 * Created by Vova on 21.09.2016.
 */

public class StoreFragment extends Fragment {

    Context context = getActivity();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_store, container, false);

       //Toast.makeText(context, "Fragment suka Stores", Toast.LENGTH_SHORT).show();

        Log.d("Log", "Privet");
        return v;
    }
}
