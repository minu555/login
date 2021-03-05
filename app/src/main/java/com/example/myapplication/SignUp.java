package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    EditText fullname,email,mobile,password,confirmpassword;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        fullname=findViewById(R.id.fullname);
        email=findViewById(R.id.email);
        mobile=findViewById(R.id.mobile);
        password=findViewById(R.id.password);
        confirmpassword=findViewById(R.id.confirmpassword);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(SignUp.this, success.class));


                    }

                });


            }

        });

    }
}