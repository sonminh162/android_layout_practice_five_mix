package com.lifetime.layout_practice_five_recyclerview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class SpecialOfferAdapter extends RecyclerView.Adapter<SpecialOfferAdapter.ViewHolder> {

    ArrayList<SpecialOffer> offers;
    Context context;

    public SpecialOfferAdapter(ArrayList<SpecialOffer> offers, Context context) {
        this.offers = offers;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_row_platform,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindView(offers.get(position));
    }

    @Override
    public int getItemCount() {
        return offers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView food_name;
        TextView food_description;
        TextView food_price;
        TextView old_price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.food_img);
            food_name = itemView.findViewById(R.id.food_name);
            food_description = itemView.findViewById(R.id.food_description);
            food_price = itemView.findViewById(R.id.food_price);
            old_price = itemView.findViewById(R.id.old_price);
        }
        public void bindView(final SpecialOffer offer){
            img.setImageResource(offer.getImg());
            food_name.setText(offer.getFood_name());
            food_description.setText(offer.getFood_description());
            food_price.setText(offer.getPrice());
            old_price.setText(offer.getOld_price());
        }
    }
}
