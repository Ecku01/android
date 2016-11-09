package com.example.cszsombi.android_2016_09_22;

import android.content.Intent;
import android.os.StrictMode;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity implements SymbolAdapter.SymbolAdapterListener{

    //Donat 16.11.19.
    private ListView mListSymbols;
    private ImageView mImageProviderLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static final String BUNDLE_SYMBOL_ID_KEY ="SYMBOLID";
    public static final Integer ACTIVITY_CLUBID_REQUEST_CODE = 3623;
    public static final Integer ACTIVITY_CLUBID_RESPONSE_NOTHING = 0;
    public static final Integer ACTIVITY_CLUBID_RESPONSE_DELETEME = 37;


@Override
    public void showClubId(int symbolId) {//club azonosítót tervezem átadni
        //átadandó adatok
        Bundle dataToPass = new Bundle();
        dataToPass.putInt(BUNDLE_SYMBOL_ID_KEY, symbolId);

        //célactivity
        Intent intent = new Intent(MainActivity.this, Bajnoksag.class);
        intent.putExtras(dataToPass);

        startActivityForResult(intent, ACTIVITY_CLUBID_REQUEST_CODE);
    }
        //alt instert


        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if(requestCode==ACTIVITY_CLUBID_REQUEST_CODE){
                if(requestCode==ACTIVITY_CLUBID_RESPONSE_DELETEME){
                    //itt lesz a törlés
                }
            }
        }
}
