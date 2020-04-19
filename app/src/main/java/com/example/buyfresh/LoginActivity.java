package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button signupButton;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Buttons are assigned to the declared variables.
        signupButton=(Button) findViewById(R.id.signup_btn);
        loginButton=(Button) findViewById(R.id.login_btn);

        //Clickig signup button will send us to signup activity.
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });


        // Clicking login button will send us to product activity.
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });


    }
}
