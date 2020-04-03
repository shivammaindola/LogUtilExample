package com.example.logutil;

import android.util.Log;

public class LogDebug {

    public static final String Tag="sample_app";

    public static void func(String message)
    {
        Log.d(Tag,message);
    }
}
