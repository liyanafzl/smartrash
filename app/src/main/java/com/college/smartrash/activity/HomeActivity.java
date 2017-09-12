package com.college.smartrash.activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.college.smartrash.activity.R;
import com.college.smartrash.constant.Appconst;


/**
 * Created by Faizal on 3/22/2017.
 */
public class HomeActivity extends AppCompatActivity implements Appconst {

    private ViewGroup home_book;
    private ViewGroup home_getrate;
    private ViewGroup home_whatwebuy;
    private ViewGroup home_process;
    private ViewGroup home_compost;
    private ViewGroup home_leftnavigation;
    private DrawerLayout drawer_layout;
    private TextView view_mode_home;
    private TextView view_mode_orderstatus;
    private TextView view_mode_help;
    private TextView view_mode_logout;
    private ImageView header_menu;
    private TextView header_menu_text;
    private ImageView headermenu_cart;
    private ImageView header_menu_noti;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        home_book=(ViewGroup) findViewById(R.id.home_book);
        home_getrate=(ViewGroup) findViewById(R.id.home_getrate);
        home_whatwebuy=(ViewGroup) findViewById(R.id.home_whatwebuy);
        home_process=(ViewGroup) findViewById(R.id.home_process);
        home_compost=(ViewGroup) findViewById(R.id.home_compost);
        home_leftnavigation=(ViewGroup) findViewById(R.id.home_leftnavigation);
        header_menu=(ImageView) findViewById(R.id.header_menu);
        header_menu_text=(TextView)findViewById(R.id.header_menu_text);
        headermenu_cart=(ImageView)findViewById(R.id.headermenu_cart);
       drawer_layout=(DrawerLayout) findViewById(R.id.home_drawer_layout);
        view_mode_help=(TextView)findViewById(R.id.view_mode_help);
        header_menu_noti=(ImageView) findViewById(R.id.header_menu_noti);
      //  activity_help=(TextView)findViewById(R.id.activity_help);
        view_mode_home=(TextView)findViewById(R.id.view_mode_home);
        view_mode_orderstatus=(TextView)findViewById(R.id.view_mode_orderstatus);
        view_mode_logout=(TextView)findViewById(R.id.view_mode_logout);
        header_menu_text.setText("Home");

       // activity_help.setOnClickListener(btnClick);
        view_mode_home.setOnClickListener(btnClick);
        view_mode_help.setOnClickListener(btnClick);
        view_mode_orderstatus.setOnClickListener(btnClick);
        view_mode_logout.setOnClickListener(btnClick);
        headermenu_cart.setOnClickListener(btnClick);
        home_book.setOnClickListener(btnClick);
        home_getrate.setOnClickListener(btnClick);
        header_menu.setOnClickListener(btnClick);
        home_process.setOnClickListener(btnClick);
        home_compost.setOnClickListener(btnClick);
        home_whatwebuy.setOnClickListener(btnClick);
        header_menu_noti.setOnClickListener(btnClick);

    }

    public View.OnClickListener btnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch(v.getId()){

                case R.id.home_book :
                    Intent i= new Intent(HomeActivity.this,BookActivity.class);
                    startActivity(i);
                break;

                case R.id.home_getrate :
                    Intent j=new Intent(HomeActivity.this,GetRateActivity.class);
                    startActivity(j);

                break;

                case R.id.home_process :

                    Intent k=new Intent(HomeActivity.this,ProcessActivity.class);
                    startActivity(k);
                break;

                case R.id.home_compost :
                  // drawer_layout.closeDrawer(home_leftnavigation);
                    Intent l=new Intent(HomeActivity.this,CompostActivity.class);
                    startActivity(l);
                break;
                case R.id.view_mode_help :
                    // drawer_layout.closeDrawer(home_leftnavigation);
                    Intent p=new Intent(HomeActivity.this,HelpActivity.class);
                    startActivity(p);
                    break;

                case R.id.view_mode_home:
                    drawer_layout.closeDrawer(home_leftnavigation);
                break;


                case R.id.view_mode_orderstatus:

                    drawer_layout.closeDrawer(home_leftnavigation);
                    Intent m=new Intent(HomeActivity.this,NotificationActivity.class);
                    startActivity(m);


                break;



                case R.id.view_mode_logout:
                    Toast.makeText( HomeActivity.this, "Logged out", Toast.LENGTH_SHORT).show();
                    Intent n=new Intent(HomeActivity.this,LoginActivity.class);
                    startActivity(n);

                break;

                case R.id.header_menu :
                    drawer_layout.openDrawer(home_leftnavigation);
                    break;

                case R.id.headermenu_cart:
                    Intent o=new Intent(HomeActivity.this,CartListActivity.class);
                    o.putExtra("ACTIVITY",ACTIVITY_HOME);
                    startActivity(o);
                    break;

                case R.id.home_whatwebuy:
                    Intent z=new Intent(HomeActivity.this,WhatWeBuyActivity.class);
                    startActivity(z);
                    break;
                case R.id.header_menu_noti:
                    Intent b=new Intent(HomeActivity.this,NotificationActivity.class);
                    startActivity(b);
                    break;

            }

        }
    };

  /*  @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
            return true;

        }

        return super.onKeyDown(keyCode, event);
    }*/

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();


    }

}
