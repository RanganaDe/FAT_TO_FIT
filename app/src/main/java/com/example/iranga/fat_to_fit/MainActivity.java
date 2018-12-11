package com.example.iranga.fat_to_fit;


import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TabHost;
import android.widget.TextView;

import static android.content.ContentValues.TAG;
import static java.lang.Math.E;

public class MainActivity extends TabActivity {
    TabHost tabHost;
    TabHost.TabSpec spec1;
    TabHost.TabSpec spec2;
    /*
    BluetoothArduinoHelper mBlue;
    TextView Text_Blue;
    private Handler mHandler = new Handler();

    private void LogMessage(String msg) {
        Log.d(TAG, msg);
    }

    private Runnable rrr = new Runnable() {
        public void run() {
            while(true){
                Text_Blue.setText("ygydsgaydgsay" + mBlue.getLastMessage());
                LogMessage("MAIN:" + mBlue.getLastMessage());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    };
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = (TabHost)findViewById(android.R.id.tabhost);
        tabHost.setup();
        // Creating tab1.
        spec1=tabHost.newTabSpec("tab 1");
        // Using the tab1.xml file for tab1 content .
        spec1.setContent(R.id.tab1);
        // Setting a label and an icon for tab1.
        spec1.setIndicator("blah", getResources().getDrawable (R.drawable.ic_launcher));
        // Calling ActivityOne through intent .
        Intent in1=new Intent(this, ActivityOne.class);
        spec1.setContent(in1);
        // Creating tab2.
        spec2=tabHost.newTabSpec("Tab 2");
        spec2.setContent(R.id.tab2);
        // Using the tab2.xml file for tab2 content.
        spec2.setContent(R.id.tab2);
        // Setting a label and an icon for tab2.
        spec2.setIndicator ("MESSAGES",getResources().getDrawable (R.drawable.ic_launcher));
        // Calling ActivityTwo through intent.
        Intent in2=new Intent(this, ActivityTwo.class);
        spec2.setContent(in2);
        // Adding tab1 and tab2 to the TabHost.
        tabHost.addTab(spec1);
        tabHost.addTab(spec2);



/*
        Text_Blue = (TextView)findViewById(R.id.text_blue);
        mBlue = BluetoothArduinoHelper.getInstance("ExampleRobot");

        try {
            mBlue.Connect();

            Handler handler =new Handler();
            final Runnable r = new Runnable() {
                public void run() {
                    mHandler.postDelayed(this, 500);

                    Text_Blue.setText("count:"+ mBlue.getLastMessage());
                    LogMessage("MAIN:" + mBlue.getLastMessage());
                }
            };
            handler.postDelayed(r, 400);


        } catch (Exception e) {
            e.printStackTrace();
        }
*/



    }



}
