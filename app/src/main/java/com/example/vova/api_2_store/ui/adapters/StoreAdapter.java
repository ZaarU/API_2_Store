package com.example.vova.api_2_store.ui.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vova.api_2_store.R;
import com.example.vova.api_2_store.model.Store;
import com.example.vova.api_2_store.ui.fragments.ToolsFragment;

import java.util.ArrayList;

/**
 * Created by Roman on 23.09.2016.
 */

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.StoreHolder>{


    @Override
    public StoreHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_store, parent, false);
        return new StoreHolder(v);
    }

    @Override
    public void onBindViewHolder(StoreHolder holder, int position) {
        final Store store = (Store)arrayList.get(position) ;
        holder._txt_name_store.setText(store.getName());
        holder._txt_address_store.setText(store.getAddress());
        holder._txt_phone_store.setText(store.getPhone());
        holder._txt_location.setText(store.getLocation().toString());
        holder.cardViewStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToolsFragment toolsFragment = new ToolsFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("key", store.getId());
                toolsFragment.setArguments(bundle);
                getActivityFromContext(v.getContext()).getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, toolsFragment)
                        .commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    static class StoreHolder extends RecyclerView.ViewHolder{
        public CardView cardViewStore;
        public TextView _txt_name_store;
        public TextView _txt_address_store;
        public TextView _txt_phone_store;
        public TextView _txt_location;

        public StoreHolder(View itemView) {
            super(itemView);

            this._txt_name_store = (TextView) itemView.findViewById(R.id.txt_name_store);
            this._txt_address_store = (TextView) itemView.findViewById(R.id.txt_address_store);
            this._txt_phone_store = (TextView) itemView.findViewById(R.id.txt_address_store);
            this._txt_location = (TextView) itemView.findViewById(R.id.txt_location);
            this.cardViewStore = (CardView) itemView.findViewById(R.id.card_view_store);
        }
    }


    private Context context;
    private ArrayList arrayList;

    public StoreAdapter(Context context, ArrayList arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    public static AppCompatActivity getActivityFromContext(Context context) {
        if(context instanceof Activity) {
            return (AppCompatActivity) context;
        }
        if(context instanceof ContextWrapper &&
                ((ContextWrapper)context).getBaseContext() instanceof Activity) {
            return  (AppCompatActivity) ((ContextWrapper)context).getBaseContext();
        }
        return null;
    }
}
