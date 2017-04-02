package com.example.tobi.netwalkgamei7420725;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by Tobz on 31/12/2016.
 */

public class level extends Activity{

    /** Called when the Activity is first created */

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level);

        Button buttonEasy = (Button) findViewById(R.id.buttonEasy);
        buttonEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Easy.class);
                startActivityForResult(intent, 0);
            }
        });

        Button buttonMedium = (Button) findViewById(R.id.buttonMedium);
        buttonMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Medium.class);
                startActivityForResult(intent, 0);
            }
        });

        Button buttonHard = (Button) findViewById(R.id.buttonHard);
        buttonHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Hard.class);
                startActivityForResult(intent, 0);
            }
        });


    }

}
