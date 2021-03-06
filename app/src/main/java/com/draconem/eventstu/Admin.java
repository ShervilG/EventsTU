package com.draconem.eventstu;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

public class Admin extends AppCompatActivity {
    Button ddown1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        LayoutInflater layoutInflater= (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        final View popupView = layoutInflater.inflate(R.layout.admin_list, null );
        final PopupWindow popupWindow = new PopupWindow(popupView,280, ActionBar.LayoutParams.WRAP_CONTENT);
        ddown1 = this.findViewById(R.id.dddown);
        ddown1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(popupWindow.isShowing())
                    popupWindow.dismiss();
                else
                    popupWindow.showAsDropDown(ddown1, 80, 0);
            }
        });
    }
    public void sot(View view) {
        Intent in2 = new Intent(Admin.this,MainActivity.class);
        this.finish();
        startActivity(in2);
    }

    public void ex(View view) {
        System.exit(0);
    }
    public void hel(View view) {
        Intent in3 = new Intent(Admin.this,Main3Activity.class);
        //this.finish();
        startActivity(in3);
    }
}
