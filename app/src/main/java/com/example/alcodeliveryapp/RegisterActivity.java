package com.example.alcodeliveryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

   Button btnRegister;
   EditText etName, etAge, etUserName, etPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

                etName = (EditText) findViewById(R.id.etName);
                etAge = (EditText) findViewById(R.id.etAge);
                etUserName = (EditText) findViewById(R.id.etUserName);
                etPassword = (EditText) findViewById(R.id.etPassword);
                btnRegister = (Button) findViewById(R.id.btnRegister);

                btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btnRegister:


            break;
        }
    }
}
