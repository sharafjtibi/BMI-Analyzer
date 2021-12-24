package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Log_in_activity extends AppCompatActivity {
    private TextView btn_login;
    private TextView btn_signup;
    private EditText username;
    private EditText passeword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        btn_login=(TextView)findViewById(R.id.tv_login);
        username=findViewById(R.id.et_name);
        passeword=findViewById(R.id.et_password);
        btn_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String uName = username.getText().toString();
                String passWord = passeword.getText().toString();

                boolean check = validateinfo(uName, passWord);
                if(check==true){
                    Toast.makeText(getApplicationContext(), "Data is valid", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Log_in_activity.this, Home_Activity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), "Sorry check information again!", Toast.LENGTH_SHORT).show();
                }


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
    private boolean validateinfo(String uName, String passWord){
        if (uName.length()==0 ){
            username.requestFocus();
            username.setError("Can't be Empty!");
            return false;


        }

        else if (!uName.matches("[a-zA-Z]+")) {
            username.requestFocus();
            username.setError("Enter only alphabetical characters!");
            return false;

        }
        else if (passWord.length()<=5){
            passeword.requestFocus();
            passeword.setError("Minimum 6 characters required");
            return false;
        }
            return true;
    }
}