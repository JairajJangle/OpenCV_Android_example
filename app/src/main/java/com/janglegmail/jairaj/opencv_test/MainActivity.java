package com.janglegmail.jairaj.opencv_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity
{

    TextView stats;
    private  static String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stats = (TextView)findViewById(R.id.textView);
        check();
    }

    public void check()
    {
            if(OpenCVLoader.initDebug())
            {
                Log.i(TAG, "OpenCV Loaded successfully");
                stats.setText("OpenCV Loaded successfully");

            }

            else
            {
                Log.i(TAG, "OpenCV NOT Loaded");
                stats.setText("OpenCV NOT Loaded");
            }
    }
}