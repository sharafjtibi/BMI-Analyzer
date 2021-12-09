package com.example.bmi_analyzer.data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bmi_analyzer.Complete_info_activity;
import com.example.bmi_analyzer.Home_Activity;
import com.example.bmi_analyzer.Log_in_activity;
import com.example.bmi_analyzer.R;
import com.example.bmi_analyzer.Sign_up_activity;

public class Add_Record extends AppCompatActivity {
    TextView toAddRecord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);


    }
}