package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.bmi_analyzer.adapter.ProgramAdapter;

public class MainActivity extends AppCompatActivity {
    Context context;
     ListView lvProgram;
    int[] length = {80,50,100,70,54,54,65};
    int[] weight = {100,70,110,70,44,56,66};
    String[] historyDate = {"6/12/2019","31/9/2019","5/5/2019","3/10/2019","2/12/2019","30/12/2019","23/7/2019"};
    String[] theStatus = {"Little Changes","Still Good","Go Ahead","Be Careful"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvProgram=findViewById(R.id.lvProgram);
        ProgramAdapter programAdapter = new ProgramAdapter(this.context,historyDate,length,weight,theStatus);
        lvProgram.setAdapter(programAdapter);



    }
}