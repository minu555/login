package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user, passwd;
    Button button, button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.text2);
        passwd = findViewById(R.id.edit1);
        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals("admin") && passwd.getText().toString().equals("admin")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(
                            MainActivity.this
                    );
                    builder.setIcon(R.drawable.ic_check);
                    builder.setTitle("Login Successfull");
                    builder.setMessage("Welcome to my application");
                    builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "invalid login credentials", Toast.LENGTH_SHORT).show();
                }
            }


        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, SignUp.class));


            }

        });
    }
}