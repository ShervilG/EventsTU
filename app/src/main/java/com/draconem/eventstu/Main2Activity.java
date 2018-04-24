package com.draconem.eventstu;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
Button ddown1;
TextView t1;
GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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

        mainGrid=(GridLayout)findViewById(R.id.mainGrid);
                //set Event
        setSingleEvent(mainGrid);

    }
    public void sot(View view) {
        Intent in2 = new Intent(Main2Activity.this,MainActivity.class);
        this.finish();
        startActivity(in2);
    }

    public void ex(View view) {
        System.exit(0);
    }
    public void hel(View view) {
        Intent in3 = new Intent(Main2Activity.this,Main3Activity.class);
        //this.finish();
        startActivity(in3);
    }

    private void setSingleEvent(GridLayout mainGrid)
    {   //loop all child item of main  grid
        for (int i=0; i<mainGrid.getChildCount();i++)
        {
            CardView cardView= (CardView)mainGrid.getChildAt(i);
            final int finalI=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI==0) // open activity one
                    {
                       Intent intent= new Intent(Main2Activity.this, ActivityOne.class);
                       startActivity(intent);
                    }
                    else if (finalI==1) // open activity one
                    {
                        Intent intent= new Intent(Main2Activity.this, ActivityTwo.class);
                        startActivity(intent);
                    }
                    else if (finalI==2) // open activity one
                    {
                        Intent intent= new Intent(Main2Activity.this, ActivityThree.class);
                        startActivity(intent);
                    }
                    else if (finalI==3) // open activity one
                    {
                        Intent intent= new Intent(Main2Activity.this, ActivityFour.class);
                        startActivity(intent);
                    }
                    else if (finalI==4) // open activity one
                    {
                        Intent intent= new Intent(Main2Activity.this, ActivityFive.class);
                        startActivity(intent);
                    }
                    else if (finalI==5) // open activity one
                    {
                        Intent intent= new Intent(Main2Activity.this, ActivitySix.class);
                        startActivity(intent);
                    }
                    else if (finalI==6) // open activity one
                    {
                        Intent intent= new Intent(Main2Activity.this, ActivitySeven.class);
                        startActivity(intent);
                    }
                    else if (finalI==7) // open activity one
                    {
                        Intent intent= new Intent(Main2Activity.this, ActivityEight.class);
                        startActivity(intent);
                    }
                }
            });

        }
    }
}
