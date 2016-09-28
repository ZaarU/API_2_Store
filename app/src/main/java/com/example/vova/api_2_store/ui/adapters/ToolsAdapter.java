package com.example.vova.api_2_store.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vova.api_2_store.R;
import com.example.vova.api_2_store.model.Tools;

import java.util.ArrayList;

/**
 * Created by Roman on 23.09.2016.
 */

public class ToolsAdapter extends RecyclerView.Adapter<ToolsAdapter.ToolsHolder> {
    Context context;
    ArrayList arrayList;

    public ToolsAdapter(ArrayList arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public ToolsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_instruments, parent, false);

        return new ToolsHolder(v);
    }

    @Override
    public void onBindViewHolder(ToolsHolder holder, int position) {
        Tools tools = (Tools) arrayList.get(position);
        holder.txt_id.setText(tools.getId());
        holder.txt_brand.setText(tools.getBrand());
        holder.txt_model.setText(tools.getModel());
        holder.txt_type.setText(tools.getType());
        holder.txt_price.setText( String.valueOf(tools.getPrice()));
        holder.txt_quantity.setText(tools.getQuantity());
 //       ImageView imageview = holder._image_view_image_url;
//        Picasso.with(context)
//                .load(tools.getImageUrl())
//                .into(imageview);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    static class ToolsHolder extends RecyclerView.ViewHolder{

        ImageView _image_view_image_url;
        TextView txt_id;
        TextView txt_brand;
        TextView txt_model;
        TextView txt_type;
        TextView txt_price;
        TextView txt_quantity;

        public ToolsHolder(View itemView) {
            super(itemView);
            this._image_view_image_url = (ImageView) itemView.findViewById(R.id.image_view_image_url);
            this.txt_brand = (TextView) itemView.findViewById(R.id.txt_brand);
            this.txt_model = (TextView) itemView.findViewById(R.id.txt_model);
            this.txt_id = (TextView) itemView.findViewById(R.id.txt_id);
            this.txt_type = (TextView) itemView.findViewById(R.id.txt_type);
            this.txt_price = (TextView) itemView.findViewById(R.id.txt_price);
            this.txt_quantity = (TextView) itemView.findViewById(R.id.txt_quantity);
        }
    }
}
