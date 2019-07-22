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

public class TodayMenuAdapter extends RecyclerView.Adapter<TodayMenuAdapter.ViewHolder>{

    ArrayList<TodayMenu> menus;
    Context context;

    public TodayMenuAdapter(ArrayList<TodayMenu> menus, Context context) {
        this.menus = menus;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.recycler_one,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindView(menus.get(position));
    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView event_name;
        TextView event_description;
        TextView content;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.fore_ground);
            event_name = itemView.findViewById(R.id.event_name);
            event_description = itemView.findViewById(R.id.event_description);
            content = itemView.findViewById(R.id.content);
        }
        public void bindView(final TodayMenu menu){
            img.setImageResource(menu.getImg());
            event_name.setText(menu.getEvent_name());
            event_description.setText(menu.getEvent_description());
            content.setText(menu.getContent());
        }
    }
}
