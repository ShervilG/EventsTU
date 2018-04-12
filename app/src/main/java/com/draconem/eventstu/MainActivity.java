package com.draconem.eventstu;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    CardView bu1,bu2,bu3;
    EditText t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        bu1 = (CardView)findViewById(R.id.but1);
        bu2 = (CardView)findViewById(R.id.but2);
        bu3 = (CardView)findViewById(R.id.but3);
        t1 = (EditText) findViewById(R.id.name2);
        t2 = (EditText) findViewById(R.id.pass);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bu1.setVisibility(View.INVISIBLE);
                bu1.setClickable(false);
                bu2.setVisibility(View.INVISIBLE);
                bu2.setClickable(false);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                bu3.setVisibility(View.VISIBLE);
                bu3.setClickable(true);
                t1.setClickable(true);
                t2.setClickable(true);
            }
        });
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bu1.setVisibility(View.INVISIBLE);
                bu1.setClickable(false);
                bu2.setVisibility(View.INVISIBLE);
                bu2.setClickable(false);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                bu3.setVisibility(View.VISIBLE);
                bu3.setClickable(true);
                t1.setClickable(true);
                t2.setClickable(true);
            }
        });
    }

}
