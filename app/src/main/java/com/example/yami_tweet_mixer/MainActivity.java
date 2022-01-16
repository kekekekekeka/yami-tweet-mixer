package com.example.yami_tweet_mixer;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
private Switch mSwitch = null;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button =(Button) findViewById(R.id.seanbutton);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,sub.class);
                startActivity(intent);
            }
        });

        Button button2 =(Button) findViewById(R.id.seanbutton2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,image_layout.class);
                startActivity(intent);
            }
        });

        /*
        //switchを試そうとした副産物（なお動かなかった模様）
        mSwitch = (Switch)findViewById(R.id.seanSwirch);
        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean isChecked) {
                if(mSwitch.isChecked()){
                    Intent intent = new Intent(MainActivity.this,sub.class);
                    startActivity(intent);
                }else{

                }
            }
        });
         */

    }
}