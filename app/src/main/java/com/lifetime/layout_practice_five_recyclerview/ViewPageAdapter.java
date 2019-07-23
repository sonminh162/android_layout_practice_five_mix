package com.lifetime.layout_practice_five_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class ViewPageAdapter extends PagerAdapter {

    private ArrayList<VpObject> listObject;
    private LayoutInflater layoutInflater;
    private Context context;

    public ViewPageAdapter(ArrayList<VpObject> listObject, Context context) {
        this.listObject = listObject;
        this.context = context;
    }


    @Override
    public int getCount() {
        return listObject.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.view_pager_item,container,false);

        ImageView icon = view.findViewById(R.id.iv_icon);
        TextView name = view.findViewById(R.id.tv_event_name);
        TextView description = view.findViewById(R.id.tv_event_description);
        TextView content = view.findViewById(R.id.tv_content);

        VpObject object = listObject.get(position);

        icon.setImageResource(object.getIcon());
        name.setText(object.getName());
        description.setText(object.getDescription());
        content.setText(object.getContent());

        container.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position,Object object){
        container.removeView((View)object);
    }
}
