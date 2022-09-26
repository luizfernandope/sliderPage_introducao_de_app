package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SlideActivity extends AppCompatActivity {

    ViewPager viewPager;
    SlideViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        viewPager = findViewById(R.id.viewpager_introducao);
        adapter = new SlideViewAdapter(this);
        viewPager.setAdapter(adapter);
    }

    public void pularIntroducao(View view){
        Intent intent = new Intent(this, iniciar_no_app.class);
        startActivity(intent);
        finish();
    }

    public void proximoSlide_introducao(View view){

        int position = viewPager.getCurrentItem();

        if(position < 2)
        {
            viewPager.setCurrentItem(position +1,true);
        }
        else
        {
            Intent intent = new Intent(this, iniciar_no_app.class);
            startActivity(intent);
            finish();
        }

    }
}