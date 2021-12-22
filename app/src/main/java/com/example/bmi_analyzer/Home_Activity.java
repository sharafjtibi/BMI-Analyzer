package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.bmi_analyzer.OOP.MovieModel;
import com.example.bmi_analyzer.data.Add_Food;
import com.example.bmi_analyzer.data.Add_Record;
import com.example.bmi_analyzer.data.TestAdapter;

import java.util.ArrayList;
import java.util.List;

public class Home_Activity extends AppCompatActivity {

    private TextView logOut;
    private Button toAddRecord;
    private Button toAddFood;
    private RecyclerView recyclerView;

    public static void checkBMIChange() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recycler);

        logOut=(TextView)findViewById(R.id.tv_logout);
        logOut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Activity.this,Log_in_activity.class);
                startActivity(intent);
                finish();
            }


        });



        toAddFood=findViewById(R.id.btn_add_food);
        toAddFood.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Activity.this, Add_Food.class);
                startActivity(intent);
            }


        });

        toAddRecord=findViewById(R.id.btn_add_record);
        toAddRecord.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Activity.this, Add_Record.class);
                startActivity(intent);
            }


        });

        TestAdapter adapter = new TestAdapter();
        recyclerView.setAdapter(adapter);

         List<MovieModel> list = new ArrayList<>();
         list.add(new MovieModel("dkxcdcd"));
         list.add(new MovieModel("sdcdxs"));
         list.add(new MovieModel("dkxsdcdcdwccd"));
         list.add(new MovieModel("1wqs"));
        adapter.setList(list);


    }
}