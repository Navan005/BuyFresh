package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button joinNowButton, loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons are assigned to the declared variables.
        joinNowButton=(Button) findViewById(R.id.main_join_btn);
        loginButton=(Button) findViewById(R.id.main_login_btn);


        //clicking login button will send us to login activity.
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


        //clicking joinnow button will send us to signup activity.
        joinNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

    }
}
