package com.example.uberv.secretdoorway;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.uberv.secretdoorway.receiver.DiagnoserReceiver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent starterIntent = getIntent();
        if (starterIntent != null) {
            boolean isDiagnosis = starterIntent.getBooleanExtra(DiagnoserReceiver.KEY_DIAGNOSE, false);
            if (isDiagnosis) {
                ((TextView) findViewById(R.id.info_tv)).setText("Diagnosis mode enabled!");
            }
        }
    }
}
