package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Log_in_activity extends AppCompatActivity {
    private TextView btn_login;
    private TextView btn_signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        btn_login=(TextView)findViewById(R.id.tv_login);
        btn_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Log_in_activity.this, Complete_info_activity.class);
                startActivity(intent);

            }
        });
        btn_signup=(TextView)findViewById(R.id.tv_signup);
        btn_signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Log_in_activity.this,Sign_up_activity.class);
                startActivity(intent);
            }
        });


    }
}