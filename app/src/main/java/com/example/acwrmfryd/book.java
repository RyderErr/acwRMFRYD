package com.example.acwrmfryd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class book extends AppCompatActivity {
private Button buttonbook1;
    private Button buttonbook2;
    private Button buttonbook3;
    private ViewPager viewPager;
    private ArrayList<View> pageview;
    private int[] imgs = new int[]{R.drawable.vp1,R.drawable.vp2,R.drawable.vp3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        viewPager = findViewById(R.id.viewpager);
        pageview =new ArrayList<View>();
        LayoutInflater inflater =getLayoutInflater();
        for(int i = 0;i<imgs.length;i++){
            View view = inflater.inflate(R.layout.vp,null);
            ImageView imageView = view.findViewById(R.id.img);
            imageView.setBackgroundResource(imgs[i]);
            pageview.add(imageView);
        }
        PagerAdapter mPagerAdapter = new PagerAdapter() {
            @Override
            public int getCount() {
                // TODO Auto-generated method stub
                return pageview.size();
            }

            @Override
            public boolean isViewFromObject(View arg0, Object arg1) {
                // TODO Auto-generated method stub
                return arg0==arg1;
            }

            public void destroyItem(View arg0, int arg1, Object arg2) {
                ((ViewPager) arg0).removeView(pageview.get(arg1));
            }


            public Object instantiateItem(View arg0, int arg1){
                ((ViewPager)arg0).addView(pageview.get(arg1));
                return pageview.get(arg1);
            }


        };
        viewPager.setAdapter(mPagerAdapter);
        buttonbook1 =(Button)findViewById(R.id.btnbook1);
        buttonbook1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(book.this,book1.class);
                startActivity(intent);
            }
        });
        buttonbook2 =(Button)findViewById(R.id.btnbook2);
        buttonbook2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(book.this,book2.class);
                startActivity(intent);
            }
        });
        buttonbook3 =(Button)findViewById(R.id.btnbook3);
        buttonbook3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(book.this,book3.class);
                startActivity(intent);
            }
        });
    }
}
