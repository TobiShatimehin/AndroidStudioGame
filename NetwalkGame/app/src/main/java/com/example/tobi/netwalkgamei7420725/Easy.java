package com.example.tobi.netwalkgamei7420725;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by Tobi on 04/01/2017.
 */

public class Easy extends AppCompatActivity {

    static Context mDialogContext=null;

@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy);

        mDialogContext = this;

        NetView view = new NetView(getApplicationContext());
        setContentView(view);


    }



}
