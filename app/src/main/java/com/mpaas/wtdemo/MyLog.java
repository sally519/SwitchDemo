package com.mpaas.wtdemo;

import android.util.Log;

/**
 * Created by zsq51
 * on 2018/11/28.
 */

public class MyLog {

    public static boolean isRelease = BuildConfig.isRelease.equals("true");

    public static void e(String TAG, String msg) {
        if (isRelease) {
            Log.e(TAG, msg);
        }
    }

    public static void w(String TAG, String msg) {
        if (isRelease) {
            Log.w(TAG, msg);
        }
    }

    public static void i(String TAG, String msg) {
        if (isRelease) {
            Log.i(TAG, msg);
        }
    }

    public static void d(String TAG, String msg) {
        if (isRelease) {
            Log.d(TAG, msg);
        }
    }

    public static void v(String TAG, String msg) {
        if (isRelease) {
            Log.v(TAG, msg);
        }
    }

}
