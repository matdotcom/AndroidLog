package com.jfdimarzio.activity101;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.util.Log;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;


public class MainActivity extends Activity {

    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.addLogAdapter(new AndroidLogAdapter());
        Logger.d("WoaaaaaaavW");
    }


    public void onStart()
    {
        super.onStart();
        progressDialog = ProgressDialog.show(this,"Please Wait. ", "Processing...",true);
        CountDownTimer timer = new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                progressDialog.dismiss();
            }
        }.start();
    }



}


