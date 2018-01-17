package com.dunbar.daniel.dunbaresume.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.dunbar.daniel.dunbaresume.R;

public class EducationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        TextView degreetv = (TextView) findViewById(R.id.degree_tv);
        TextView majortv = (TextView) findViewById(R.id.major_tv);
        TextView minortv = (TextView) findViewById(R.id.minor_tv);
        TextView gpatv = (TextView) findViewById(R.id.gpa_tv);
        TextView gradtv = (TextView) findViewById(R.id.graduation_tv);

        Intent intent = getIntent();

        if(intent.hasExtra("University")){
            setTitle(intent.getStringExtra("University"));
        }
        if(intent.hasExtra("Degree")){
            String degree = intent.getStringExtra("Degree");
            degreetv.setText(degree);
        }
        if(intent.hasExtra("Major")){
            String major = intent.getStringExtra("Major");
            majortv.setText(major);
        }
        if(intent.hasExtra("Minor")){
            String minor = intent.getStringExtra("Minor");
            minortv.setText(minor);
        }
        if(intent.hasExtra("GPA")){
            String gpa = intent.getStringExtra("GPA");
            gpatv.setText(gpa);
        }
        if(intent.hasExtra("Graduation")){
            String graduation = intent.getStringExtra("Graduation");
            gradtv.setText(graduation);
        }
    }
}
