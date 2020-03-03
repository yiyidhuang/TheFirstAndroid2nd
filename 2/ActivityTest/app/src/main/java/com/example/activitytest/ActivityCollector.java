package com.example.activitytest;

import android.app.Activity;
import android.util.Log;

import androidx.annotation.ArrayRes;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
        Log.d("ActivityCollector", "addActivity: ");
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
        Log.d("ActivityCollector", "removeActivity: ");
    }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
                Log.d("ActivityCollector", "finishAll: ");
            }
        }
    }
}
