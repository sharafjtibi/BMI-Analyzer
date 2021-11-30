package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Complete_info_activity extends AppCompatActivity {

    private EditText inputWeightNum;
    private int inputInInt_weight;

    private EditText inputLengthNum;
    private int inputInInt_length;

    private TextView btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_info);

         inputWeightNum = (EditText) findViewById(R.id.et_value_weight);
         inputLengthNum = (EditText) findViewById(R.id.et_value_length);

         btn=(TextView)findViewById(R.id.btn_saveData);
         btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Complete_info_activity.this,Home_Activity.class);
                startActivity(intent);
                finish();
            }


        });


 }

    public void incrementWeight(View v){
        inputInInt_weight = Integer.parseInt(inputWeightNum.getText().toString());
        inputInInt_weight++;
        inputWeightNum.setText(""+inputInInt_weight);

        }
    public void decrementWeight(View v){
        inputInInt_weight = Integer.parseInt(inputWeightNum.getText().toString());
        inputInInt_weight--;
        inputWeightNum.setText(""+inputInInt_weight);
 }



    public void incrementLength(View v){

        inputInInt_length = Integer.parseInt(inputLengthNum.getText().toString());
        inputInInt_length++;
        inputLengthNum.setText(""+inputInInt_length);

    }
    public void decrementLength(View v){
        inputInInt_length = Integer.parseInt(inputLengthNum.getText().toString());
        inputInInt_length--;
        inputLengthNum.setText(""+inputInInt_length);
    }







}