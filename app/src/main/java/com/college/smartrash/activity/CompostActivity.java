package com.college.smartrash.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.college.smartrash.Model.CartModel;
import com.college.smartrash.constant.Appconst;
import com.college.smartrash.databasehandler.Cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Faizal on 3/24/2017.
 */
public class CompostActivity extends AppCompatActivity implements  Appconst{
    private CheckBox checkbacteria;
    private CheckBox checkcompost;
    private Button compost_addtocart;
    private ImageView header_menu;
    private String str_bacteria = "Bacteria";
    private String str_compost = "Compost";
    private List<CartModel> string_array;
    private DrawerLayout  compost_drawer_layout;
    private ViewGroup home_leftnavigation;
    private TextView header_menu_text;
    private ImageView header_menu_noti;
    private ImageView headermenu_cart;
    private TextView view_mode_home;
    private TextView view_mode_orderstatus;
    private TextView view_mode_help;
    private TextView view_mode_logout;

    private CartModel cartModel ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compost);

        compost_addtocart = (Button) findViewById(R.id.compost_addtocart);
        checkbacteria = (CheckBox) findViewById(R.id.checkbacteria);
        checkcompost = (CheckBox) findViewById(R.id.checkcompost);
        header_menu=(ImageView) findViewById(R.id.header_menu);
        compost_drawer_layout=(DrawerLayout)findViewById(R.id.compost_drawer_layout);
        home_leftnavigation=(ViewGroup)findViewById(R.id.home_leftnavigation);
        headermenu_cart=(ImageView)findViewById(R.id.headermenu_cart);
        view_mode_help=(TextView)findViewById(R.id.view_mode_help);
        view_mode_home=(TextView)findViewById(R.id.view_mode_home);
        view_mode_orderstatus=(TextView)findViewById(R.id.view_mode_orderstatus);
        view_mode_logout=(TextView)findViewById(R.id.view_mode_logout);
        header_menu_text=(TextView)findViewById(R.id.header_menu_text);
        header_menu_text.setText("Compost");
        header_menu_noti=(ImageView)findViewById(R.id.header_menu_noti);
        compost_addtocart.setOnClickListener(btnClick);
        header_menu.setOnClickListener(btnClick);
        headermenu_cart.setOnClickListener(btnClick);
        view_mode_help.setOnClickListener(btnClick);
        view_mode_home.setOnClickListener(btnClick);
        view_mode_orderstatus.setOnClickListener(btnClick);
        view_mode_logout.setOnClickListener(btnClick);
        header_menu_noti.setOnClickListener(btnClick);
    }


    public View.OnClickListener btnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()) {

                case R.id.header_menu:
                    compost_drawer_layout.openDrawer(home_leftnavigation);
                    break;
                case R.id.compost_addtocart:
                    compost_drawer_layout.closeDrawer(home_leftnavigation);
                    string_array = new ArrayList<CartModel>();
                    if (checkbacteria.isChecked()) {

                        cartModel = new CartModel() ;
                        cartModel.setItem_image(str_bacteria);
                        cartModel.setItem_cost("20");
                        cartModel.setItem_name(str_bacteria);
                        string_array.add(cartModel);

                    }
                    if (checkcompost.isChecked()) {

                        cartModel = new CartModel() ;
                        cartModel.setItem_image(str_compost);
                        cartModel.setItem_cost("100");
                        cartModel.setItem_name(str_compost);
                        string_array.add(cartModel);
                    }
                    if (string_array.size() > 0) {

                            new Cart(CompostActivity.this).insertList(string_array);

                    }
                    Toast.makeText(CompostActivity.this, "Added to cart!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.view_mode_home:
                    Intent i=new Intent(CompostActivity.this,HomeActivity.class);
                    startActivity(i);
                    break;
                case R.id.view_mode_orderstatus:
                    Intent j=new Intent(CompostActivity.this,OrderListActivity.class);
                    startActivity(j);
                    break;
                case R.id.view_mode_logout:
                    Toast.makeText(CompostActivity.this, "Logged out", Toast.LENGTH_SHORT).show();
                    Intent k=new Intent(CompostActivity.this,LoginActivity.class);
                    startActivity(k);
                    break;
                case R.id.headermenu_cart:

                    Intent l=new Intent(CompostActivity.this,CartListActivity.class);
                    l.putExtra("ACTIVITY",ACTIVITY_COMPOST);
                    startActivity(l);
                    break;
                case R.id.header_menu_noti:
                    Intent p=new Intent(CompostActivity.this,NotificationActivity.class);
                    startActivity(p);
                    break;
                case R.id.view_mode_help:
                    Intent f=new Intent(CompostActivity.this,HelpActivity.class);
                    startActivity(f);
                    break;



                }

            }
        };

}