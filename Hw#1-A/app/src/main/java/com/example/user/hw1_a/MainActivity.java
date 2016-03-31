/**
 Program to show time table.
 Author: Kim Young Song.
 E-mail Address: infall346@gmail.com.
 Programming homework #1-A
 Last Changed: March 28, 2016
 */

package com.example.user.hw1_a;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout m,t,th,w,f; //day of week (monday,tuesday...)

        Calendar cal = Calendar.getInstance(); //get Current day of week
        int day_of_week = cal.get(Calendar.DAY_OF_WEEK);

        m = (LinearLayout) findViewById(R.id.m);  //get id from each column
        t = (LinearLayout) findViewById(R.id.t);
        w = (LinearLayout) findViewById(R.id.w);
        th = (LinearLayout) findViewById(R.id.th);
        f = (LinearLayout) findViewById(R.id.F);

        switch(day_of_week)
        {
            case 2:                  //Monday
                m.setBackgroundColor(Color.YELLOW);
                break;
            case 3:
                t.setBackgroundColor(Color.YELLOW);
                break;
            case 4:
                w.setBackgroundColor(Color.YELLOW);
                break;
            case 5:
                th.setBackgroundColor(Color.YELLOW);
                break;
            case 6:
                f.setBackgroundColor(Color.YELLOW);
                break;
            default:
                break;
        }
    }
}


