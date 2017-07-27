package com.example.android.bottomapp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //private TextView mTextMessage;

    View view = null;
    Context context = this;
    LayoutInflater layoutInflater = null;
    FrameLayout content;
    MyAdapter myAdapter;
    ViewGroup container;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                   // mTextMessage.setText(R.string.title_home);
                    view = null;
                    layoutInflater = null;
                    content = null;

                    layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view = layoutInflater.inflate(R.layout.firstscreen,null);

                    content.addView(view);
                    return true;

                case R.id.navigation_dashboard:
                    view = null;
                    layoutInflater = null;
                    content = null;


                    layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view = layoutInflater.inflate(R.layout.secondscreen,null);

                    content.addView(view);
                    return true;
                case R.id.navigation_notifications:
                    view = null;
                    layoutInflater = null;
                    content = null;


                    layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view = layoutInflater.inflate(R.layout.thirdscreen,null);

                    content.addView(view);
                    return true;
            }
            return false;
        }

    };
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        MyAdapter myAdapter;
        content =(FrameLayout) findViewById(R.id.content);
        view = null;
        layoutInflater = null;
        content.removeAllViews();

        layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.thirdscreen,null);
        RecyclerView recList = (RecyclerView) findViewById(R.id.myRecycler);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        List<Contact> contactList = new ArrayList<>();
        Contact contact1 = new Contact();
        contact1.setTembisa("My Kasi Town");
        contact1.setGauteng("My PROVINCE");
        contact1.setLebogang("MS");


        Contact contact2 = new Contact ();
        contact2.setTembisa("My Kasi Town");
        contact2.setGauteng("My PROVINCE");
        contact2.setLebogang("MS");



        contactList.add(contact1);
        contactList.add(contact2);


        adapter = new MyAdapter(MainActivity.this, contactList);
        recList.setAdapter(adapter);



        content.addView(view);


    }


}
