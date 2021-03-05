package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class SignUp1 extends AppCompatActivity {
    EditText password,confirmpassword;
    Button button;
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up1);
        password=findViewById(R.id.password);
        confirmpassword=findViewById(R.id.confirmpassword);
        button=findViewById(R.id.button);
        datePicker=findViewById(R.id.datepicker);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(SignUp1.this, MainActivity.class));


            }

        });



    }
}