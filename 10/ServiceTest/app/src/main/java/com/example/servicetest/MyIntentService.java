package com.example.servicetest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * @author : Wei
 * @date : March 11, 2020
 */
public class MyIntentService extends IntentService {
    private static final String TAG = "MyIntentService";

    public MyIntentService() {
        // Call the method with the parameter of super class
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        // Print current thread's id
        Log.d(TAG, "Thread's id is " + Thread.currentThread().getId());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy executed");
    }
}
