// Back arrow is missing in Second Activity screen in this version.

package com.asherabrams.secondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displaySecondActivity(View view){
        Intent myIntent = new Intent(this, SecondActivity.class);
        startActivity(myIntent);
    }

}
