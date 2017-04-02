package com.example.tobi.netwalkgamei7420725;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by Tobi on 04/01/2017.
 */

public class Medium extends Activity{

    static Context mDialogContext=null;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medium);

        mDialogContext = this;

        NetView1 view = new NetView1(getApplicationContext());
        setContentView(view);


    }
}
