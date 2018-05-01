package com.draconem.eventstu;


import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v7.widget.GridLayout;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class Main3Activity extends AppCompatActivity {
    Button ddown1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        LayoutInflater layoutInflater= (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        final View popupView = layoutInflater.inflate(R.layout.list_popup, null );
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

        GridLayout mainGrid2 =findViewById(R.id.gridd);

        setSingleEvent(mainGrid2);

    }



    public void sot(View view) {
        Intent in2 = new Intent(Main3Activity.this,MainActivity.class);
        this.finish();
        startActivity(in2);
    }
    public void ex(View view) {
        System.exit(0);
    }





    private void setSingleEvent(GridLayout mainGrid)
    {   //loop all child item of main  grid
        for (int i=0; i<mainGrid.getChildCount();i++)
        {
            LinearLayout cardView= (LinearLayout) mainGrid.getChildAt(i);
            final int finalI=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI == 0) // open activity one
                    {
                        Intent intent = new Intent(Main3Activity.this, Society_one.class);
                        startActivity(intent);
                    }
                    else if (finalI == 1) // open activity two
                    {
                        Intent intent = new Intent(Main3Activity.this, Society_two.class);
                        startActivity(intent);
                    }
                    else if (finalI == 2) // open activity three
                    {
                        Intent intent = new Intent(Main3Activity.this, Society_three.class);
                        startActivity(intent);
                    }
                    else if (finalI == 3) // open activity four
                    {
                        Intent intent = new Intent(Main3Activity.this, Society_four.class);
                        startActivity(intent);
                    }
                    else if (finalI == 4) // open activity five
                    {
                        Intent intent = new Intent(Main3Activity.this, Society_five.class);
                        startActivity(intent);
                    }
                    else if (finalI == 5) // open activity six
                    {
                        Intent intent = new Intent(Main3Activity.this, Society_Six.class);
                        startActivity(intent);
                    }
                    else if (finalI == 6) // open activity seven
                    {
                        Intent intent = new Intent(Main3Activity.this, Society_seven.class);
                        startActivity(intent);
                    }
                    else if (finalI == 7) // open activity eight
                    {
                        Intent intent = new Intent(Main3Activity.this, Society_Eight.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }

}
