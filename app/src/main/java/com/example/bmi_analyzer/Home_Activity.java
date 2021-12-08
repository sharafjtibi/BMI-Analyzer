package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bmi_analyzer.adapter.MovieModel;
import com.example.bmi_analyzer.data.TestAdapter;

import java.util.ArrayList;
import java.util.List;

public class Home_Activity extends AppCompatActivity {

    private TextView logOut;
    private RecyclerView recyclerView;

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