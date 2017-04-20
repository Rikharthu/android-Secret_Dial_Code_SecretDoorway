package com.example.uberv.secretdoorway.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.uberv.secretdoorway.MainActivity;

/**
 * Receiver that respondes to secret code declared in the manifest (6661488)
 * Secret code has the following pattern: *#*#6661488#*#*
 */
public class DiagnoserReceiver extends BroadcastReceiver {
    public static final String KEY_DIAGNOSE = "key_diagnose";

    public void onReceive(Context context, Intent intent) {
        if ("android.provider.Telephony.SECRET_CODE".equals(intent.getAction())) {
            Intent i = new Intent(Intent.ACTION_MAIN);
            i.setClass(context, MainActivity.class);
            i.putExtra(KEY_DIAGNOSE, true);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
    }
}
