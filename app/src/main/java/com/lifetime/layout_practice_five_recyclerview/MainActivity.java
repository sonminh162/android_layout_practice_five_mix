package com.lifetime.layout_practice_five_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<VpObject> listObject;
    private ViewPager viewPager;
    TextView pagination,pagination_head;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //make translucent statusBar on kitkat devices
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            setWindowFlag(this,WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        //make fully Android Transparent Status bar
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.container);

        pagination = findViewById(R.id.pagination);
        pagination_head = findViewById(R.id.head_pagination);

//        initView();
        initViewByUsingViewPager();

        initRecyclerView2();

        initRecyclerView3();

    }

    @SuppressLint("SetTextI18n")
    private void initViewByUsingViewPager() {
        listObject = new ArrayList<>();
        listObject.add(new VpObject(R.drawable.item_row_1,"Wendsaday","25% off for a table of two","Dinner 25% off, and only 68 USD/each in Solois Coffee, And Free All Girls There"));
        listObject.add(new VpObject(R.drawable.item_row_1,"Wendsaday","25% off for a table of two","Dinner 25% off, and only 68 USD/each in Solois Coffee, And Free All Girls There"));
        listObject.add(new VpObject(R.drawable.item_row_1,"Wendsaday","25% off for a table of two","Dinner 25% off, and only 68 USD/each in Solois Coffee, And Free All Girls There"));

        viewPager = findViewById(R.id.view_pager_position);
        ViewPageAdapter adapter = new ViewPageAdapter(listObject,this);
        viewPager.setAdapter(adapter);

        // init pagination
        pagination_head.setText("1");
        pagination.setText("/"+listObject.size());
        //

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//                Toast.makeText(getApplicationContext(),"Successfully",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onPageSelected(int position) {
                int currentPosition = position +1;
                String headPagination = ""+currentPosition;
                pagination_head.setText(headPagination);
//                Toast.makeText(getApplicationContext(),"Slide:"+currentPosition+"/"+listObject.size(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {
//                Toast.makeText(getApplicationContext(),"Successfully",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initRecyclerView3() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view_three);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<SpecialOffer> arrayList = new ArrayList<>();
        arrayList.add(new SpecialOffer(R.drawable.order_1,"Soloist Coffee","An elegant place","68USD/Each","$120"));
        arrayList.add(new SpecialOffer(R.drawable.order_2,"Croissant Fun","The best in town","10USD/Each","$20"));
        arrayList.add(new SpecialOffer(R.drawable.order_1,"Soloist Coffee","An elegant place","68USD/Each","$120"));
        arrayList.add(new SpecialOffer(R.drawable.order_1,"Soloist Coffee","An elegant place","68USD/Each","$120"));
        arrayList.add(new SpecialOffer(R.drawable.order_1,"Soloist Coffee","An elegant place","68USD/Each","$120"));
        SpecialOfferAdapter adapter = new SpecialOfferAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }

    public static void setWindowFlag(Activity activity, final int bits, boolean on){
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if(on){
            winParams.flags |=bits;
        }else{
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.recycle_view_one);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<TodayMenu> arrayList = new ArrayList<>();
        arrayList.add(new TodayMenu(R.drawable.item_row_1,"Wendsaday","25% off for a table of two","Dinner 25% off, and only 68 USD/each in Solois Coffee, And Free All Girls There"));
        arrayList.add(new TodayMenu(R.drawable.item_row_1,"Wendsaday","25% off for a table of two","Dinner 25% off, and only 68 USD/each in Solois Coffee, And Free All Girls There"));
        arrayList.add(new TodayMenu(R.drawable.item_row_1,"Wendsaday","25% off for a table of two","Dinner 25% off, and only 68 USD/each in Solois Coffee, And Free All Girls There"));

        TodayMenuAdapter adapter = new TodayMenuAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }

    public void initRecyclerView2(){
        RecyclerView recyclerView = findViewById(R.id.recycle_view_two);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Category> arrayList = new ArrayList<>();
        arrayList.add(new Category(R.drawable.item_row_2,"Awesome Drinks"));
        arrayList.add(new Category(R.drawable.item_row_2_2,"Healthy & Green"));
        arrayList.add(new Category(R.drawable.item_row_2,"Checked One"));
        arrayList.add(new Category(R.drawable.item_row_2,"Checked One"));
//        arrayList.add(new Category(R.drawable.item_row_2,"Checked One"));

        CategoryAdapter adapter = new CategoryAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
