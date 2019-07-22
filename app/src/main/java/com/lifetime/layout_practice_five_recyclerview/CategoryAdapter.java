package com.lifetime.layout_practice_five_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter {
    ArrayList<Category> categories;
    Context context;

    public CategoryAdapter(ArrayList<Category> categories, Context context) {
        this.categories = categories;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType){
            case 0:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_new,parent,false);
                return new ZeroViewHolder(view);
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_2,parent,false);
                return new OneViewHolder(view);
            default:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_3,parent,false);
                return new TwoViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch(position){
            case 0:
                ((ZeroViewHolder)holder).bindView(categories.get(position));
                break;
            case 1:
                ((OneViewHolder)holder).bindView(categories.get(position));
                break;
            case 2:
                ((TwoViewHolder)holder).bindView(categories.get(position));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class ZeroViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView text;
        public ZeroViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_1);
            text = itemView.findViewById(R.id.text_1);
        }
        public void bindView(final Category category){
            img.setImageResource(category.getImg());
            text.setText(category.getText());
        }
    }

    public class OneViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView text;
        public OneViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_2);
            text = itemView.findViewById(R.id.text_2);
        }
        public void bindView(final Category category){
            img.setImageResource(category.getImg());
            text.setText(category.getText());
        }
    }

    public class TwoViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView text;
        public TwoViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_3);
            text = itemView.findViewById(R.id.text_3);
        }
        public void bindView(final Category category){
            img.setImageResource(category.getImg());
            text.setText(category.getText());
        }
    }
}
