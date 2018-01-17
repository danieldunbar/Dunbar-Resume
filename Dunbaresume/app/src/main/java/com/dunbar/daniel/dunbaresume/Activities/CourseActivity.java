package com.dunbar.daniel.dunbaresume.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.dunbar.daniel.dunbaresume.R;

import java.util.ArrayList;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        String name = "";
        String description = "";
        ArrayList<String> technology = null;
        Intent intent = getIntent();

        if(intent.hasExtra("Name")){
            name = intent.getStringExtra("Name");
        }
        if(intent.hasExtra("Description")){
            description = intent.getStringExtra("Description");
        }
        if(intent.hasExtra("Technology")){
            technology = intent.getStringArrayListExtra("Technology");
        }

        TextView technologytv = (TextView) findViewById(R.id.coursetechnology_tv);
        TextView descriptiontv = (TextView) findViewById(R.id.coursedescription_tv);

        String tech = null;

        for(int i = 0; i < technology.size(); i++){
            if(i == 0){
                tech = technology.get(i);
            }
            else{
                tech += ", " + technology.get(i);
            }
        }

        technologytv.setText(tech);
        descriptiontv.setText(description);
        setTitle(name);
    }
}
