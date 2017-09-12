package com.college.smartrash.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Faizal on 4/21/2017.
 */
public class WhatWeBuyActivity extends AppCompatActivity{

    TextView header_back_text;

    private ImageView plastic_plus;
    private ImageView plastic_minus;
    private ViewGroup plastic_drop;

    private ImageView paper_plus;
    private ImageView paper_minus;
    private ViewGroup paper_drop;

    private ImageView metal_plus;
    private ImageView metal_minus;
    private ViewGroup metal_drop;

    private ImageView glass_plus;
    private ImageView glass_minus;
    private ViewGroup glass_drop;

    private ImageView ewaste_plus;
    private ImageView ewaste_minus;
    private ViewGroup ewaste_drop;

    private ImageView others_plus;
    private ImageView others_minus;
    private ViewGroup others_drop;
    ImageView header_back;
    private ImageView headerback_noti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatwebuy);

        header_back_text = (TextView) findViewById(R.id.header_back_text);

        plastic_plus = (ImageView) findViewById(R.id.plastic_plus);
        plastic_minus = (ImageView) findViewById(R.id.plastic_minus);
        plastic_drop = (ViewGroup) findViewById(R.id.plastic_drop);

        paper_plus = (ImageView) findViewById(R.id.paper_plus);
        paper_minus = (ImageView) findViewById(R.id.paper_minus);
        paper_drop = (ViewGroup) findViewById(R.id.paper_drop);

        metal_plus = (ImageView) findViewById(R.id.metal_plus);
        metal_minus = (ImageView) findViewById(R.id.metal_minus);
        metal_drop = (ViewGroup) findViewById(R.id.metal_drop);

        glass_plus = (ImageView) findViewById(R.id.glass_plus);
        glass_minus = (ImageView) findViewById(R.id.glass_minus);
        glass_drop = (ViewGroup) findViewById(R.id.glass_drop);

        ewaste_plus = (ImageView) findViewById(R.id.ewaste_plus);
        ewaste_minus = (ImageView) findViewById(R.id.ewaste_minus);
        ewaste_drop = (ViewGroup) findViewById(R.id.ewaste_drop);

        others_plus = (ImageView) findViewById(R.id.others_plus);
        others_minus = (ImageView) findViewById(R.id.others_minus);
        others_drop = (ViewGroup) findViewById(R.id.others_drop);

        headerback_noti=(ImageView) findViewById(R.id.header_back_noti) ;
        header_back=(ImageView)findViewById(R.id.header_back) ;
        plastic_drop.setVisibility(View.GONE);
        plastic_minus.setVisibility(View.GONE);
        paper_drop.setVisibility(View.GONE);
        metal_drop.setVisibility(View.GONE);
        glass_drop.setVisibility(View.GONE);
        metal_drop.setVisibility(View.GONE);
        ewaste_drop.setVisibility(View.GONE);
        others_drop.setVisibility(View.GONE);
        headerback_noti.setVisibility(View.GONE);

        header_back_text.setText("What can be sold");
        header_back.setOnClickListener(btnClick);
        plastic_plus.setOnClickListener(btnClick);
        plastic_minus.setOnClickListener(btnClick);

        paper_plus.setOnClickListener(btnClick);
        paper_minus.setOnClickListener(btnClick);

        metal_plus.setOnClickListener(btnClick);
        metal_minus.setOnClickListener(btnClick);

        glass_plus.setOnClickListener(btnClick);
        glass_minus.setOnClickListener(btnClick);

        ewaste_plus.setOnClickListener(btnClick);
        ewaste_minus.setOnClickListener(btnClick);

        others_plus.setOnClickListener(btnClick);
        others_minus.setOnClickListener(btnClick);
    }

        public View.OnClickListener btnClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()) {

                    case R.id.plastic_plus:
                        plastic_plus.setVisibility(View.GONE);
                        plastic_minus.setVisibility(View.VISIBLE);
                        plastic_drop.setVisibility(View.VISIBLE);
                        break;
                    case R.id.plastic_minus:
                        plastic_plus.setVisibility(View.VISIBLE);
                        plastic_minus.setVisibility(View.GONE);
                        plastic_drop.setVisibility(View.GONE);
                        break;
                    case R.id.paper_plus:
                        paper_plus.setVisibility(View.GONE);
                        paper_minus.setVisibility(View.VISIBLE);
                        paper_drop.setVisibility(View.VISIBLE);
                        break;
                    case R.id.paper_minus:
                        paper_plus.setVisibility(View.VISIBLE);
                        paper_minus.setVisibility(View.GONE);
                        paper_drop.setVisibility(View.GONE);
                        break;
                    case R.id.metal_plus:
                        metal_plus.setVisibility(View.GONE);
                        metal_minus.setVisibility(View.VISIBLE);
                        metal_drop.setVisibility(View.VISIBLE);
                        break;
                    case R.id.metal_minus:
                        metal_plus.setVisibility(View.VISIBLE);
                        metal_minus.setVisibility(View.GONE);
                        metal_drop.setVisibility(View.GONE);
                        break;
                    case R.id.ewaste_plus:
                        ewaste_plus.setVisibility(View.GONE);
                        ewaste_minus.setVisibility(View.VISIBLE);
                        ewaste_drop.setVisibility(View.VISIBLE);
                        break;
                    case R.id.ewaste_minus:
                        ewaste_plus.setVisibility(View.VISIBLE);
                        ewaste_minus.setVisibility(View.GONE);
                        ewaste_drop.setVisibility(View.GONE);
                        break;
                    case R.id.others_plus:
                        others_plus.setVisibility(View.GONE);
                        others_minus.setVisibility(View.VISIBLE);
                        others_drop.setVisibility(View.VISIBLE);
                        break;
                    case R.id.others_minus:
                        others_plus.setVisibility(View.VISIBLE);
                        others_minus.setVisibility(View.GONE);
                        others_drop.setVisibility(View.GONE);
                        break;
                    case R.id.glass_plus:
                        glass_plus.setVisibility(View.GONE);
                        glass_minus.setVisibility(View.VISIBLE);
                        glass_drop.setVisibility(View.VISIBLE);
                        break;
                    case R.id.glass_minus:
                        glass_plus.setVisibility(View.VISIBLE);
                        glass_minus.setVisibility(View.GONE);
                        glass_drop.setVisibility(View.GONE);
                        break;
                    case R.id.header_back:
                        Intent i=new Intent(WhatWeBuyActivity.this,HomeActivity.class);
                        startActivity(i);
                        break;
                }
            }
        };


    }


