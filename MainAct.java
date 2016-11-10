package com.example.nick.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainAct extends AppCompatActivity implements View.OnClickListener{

    Button bSignUp;
    EditText etFullNames,etUsername,etPassword,etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFullNames=(EditText) findViewById(R.id.etFullNames);
        etUsername=(EditText)findViewById(R.id.id.etUsername);
        etPassword=(EditText)findViewById(R.id.etPassword);
        etEmail=(EditText)findViewById(R.id.etEmail);
        bSignUp=(Button) findViewById(R.id.bSignUp);

    }

    @Override
    public void onClick(View v) {
        Intent boy=new Intent(MainAct.this,Home.class);
        startActivity(boy);

        }
    }

