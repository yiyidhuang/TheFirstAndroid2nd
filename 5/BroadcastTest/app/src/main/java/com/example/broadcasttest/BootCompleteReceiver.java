package com.example.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BootCompleteReceiver extends BroadcastReceiver {

    private final static String TAG = "[ BOOT RECEIVER ]";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "BootCompleteReceiver DONE!");
        Toast.makeText(context, "Boot Complete", Toast.LENGTH_SHORT).show();
    }
}
