package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sign_up_activity extends AppCompatActivity {
    private TextView btn_create;
    private TextView btn_log_in;
    private EditText name, email, passeword, rePasseword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btn_create = (TextView) findViewById(R.id.tv_create);
        name = findViewById(R.id.et_name);
        email = findViewById(R.id.et_email);
        passeword = findViewById(R.id.et_password);
        rePasseword = findViewById(R.id.et_ensure_password);
        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vName = name.getText().toString();
                String vEmail = email.getText().toString();
                String vPasseword = passeword.getText().toString();
                String vRePasseword = rePasseword.getText().toString();

                boolean check = validateinfo(vName, vEmail, vPasseword, vRePasseword);

                if (check == true) {
                    Toast.makeText(getApplicationContext(), "Data is valid", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Sign_up_activity.this, Complete_info_activity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Sorry check information again!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        btn_log_in = (TextView) findViewById(R.id.tv_to_login);
        btn_log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_up_activity.this, Log_in_activity.class);
                startActivity(intent);
            }


        });
    }

    private boolean validateinfo(String vName, String vEmail, String vPasseword, String vRePasseword) {
        if (vName.length() == 0) {
            name.requestFocus();
            name.setError("Can't be Empty!");
            return false;
        } else if (!vName.matches("[a-zA-Z]+")) {
            name.requestFocus();
            name.setError("Enter only alphabetical characters!");
            return false;

        } else if (vEmail.length() == 0) {
            email.requestFocus();
            email.setError("Can't be Empty!");
            return false;
        } else if (!vEmail.matches("[a-zA-Z0-9._]+@[a-z]+\\.+[a-z]+")) {
            email.requestFocus();
            email.setError("Enter valid email!");
            return false;
        } else if (vPasseword.length() <= 5) {
            passeword.requestFocus();
            passeword.setError("Minimum 6 characters required");
            return false;
        } else if (vRePasseword.length() != vPasseword.length()) {
            rePasseword.requestFocus();
            rePasseword.setError("Doesn't match with the prevois password");
            return false;
        }
        return true;

    }
}