package dev.fep.noads;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import dev.fep.noadslib.NoAds;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NoAds.tdate = "2018-06-27";

        if(NoAds.get()){

            Log.e("scar","ha arrivat");

        }else{

            Log.e("scar","no ha arrivat");

        }
    }
}
