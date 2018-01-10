package com.dunbar.daniel.dunbaresume.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.dunbar.daniel.dunbaresume.R;

import java.util.ArrayList;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        TextView postiontv = (TextView) findViewById(R.id.workposition_tv);
        TextView starttv = (TextView) findViewById(R.id.workstart_tv);
        TextView endtv = (TextView) findViewById(R.id.workend_tv);
        TextView locationtv = (TextView) findViewById(R.id.worklocation_tv);
        TextView descriptiontv = (TextView) findViewById(R.id.workdescription_tv);
        Intent intent = getIntent();

        if(intent.hasExtra("Company")){
            setTitle(intent.getStringExtra("Company"));
        }
        if(intent.hasExtra("Position")){
            postiontv.setText(intent.getStringExtra("Position"));
        }
        if(intent.hasExtra("StartDate")){
            starttv.setText(intent.getStringExtra("StartDate"));
        }
        if(intent.hasExtra("EndDate")){
            endtv.setText(intent.getStringExtra("EndDate"));
        }
        if(intent.hasExtra("Location")){
            locationtv.setText(intent.getStringExtra("Location"));
        }
        if(intent.hasExtra("Description")){
            ArrayList<String> descList = intent.getStringArrayListExtra("Description");
            String desc = null;

            for(int i = 0; i < descList.size(); i++){
                if(i == 0){
                    desc = descList.get(i);
                }
                else{
                    desc += "\n\n" + descList.get(i);
                }
            }

            descriptiontv.setText(desc);
        }

    }
}
