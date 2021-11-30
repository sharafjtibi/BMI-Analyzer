package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sign_up_activity extends AppCompatActivity {
    private TextView btn_create;
    private TextView btn_log_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btn_create= (TextView) findViewById(R.id.tv_create);
        btn_create.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_up_activity.this, Log_in_activity.class);
                startActivity(intent);
            }
        });


        btn_log_in=(TextView)findViewById(R.id.tv_to_login);
        btn_log_in.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_up_activity.this,Log_in_activity.class);
                startActivity(intent);
            }


        });
    }
}