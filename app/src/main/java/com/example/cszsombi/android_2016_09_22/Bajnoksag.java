package com.example.cszsombi.android_2016_09_22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bajnoksag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bajnoksag);

        this.setResult(MainActivity.ACTIVITY_CLUBID_RESPONSE_NOTHING);

        Bundle dataPassed=getIntent().getExtras();
        Integer symbolId=dataPassed.getInt(MainActivity.BUNDLE_SYMBOL_ID_KEY);
    }

    public void deleteClicked(View view){
        this.setResult(MainActivity.ACTIVITY_CLUBID_RESPONSE_DELETEME);
        this.finish();
    }
}
