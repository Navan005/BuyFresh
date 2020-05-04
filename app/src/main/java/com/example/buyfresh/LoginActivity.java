package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button signupButton;
    private Button loginButton;
    private EditText username,upassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Buttons are assigned to the declared variables.
        signupButton=(Button) findViewById(R.id.signup_btn);
        loginButton=(Button) findViewById(R.id.login_btn);
        username=(EditText) findViewById(R.id.login_uname);
        upassword=(EditText) findViewById(R.id.login_password);

        //Clickig signup button will send us to signup activity.
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                    startActivity(intent);
            }
        });


        // Clicking login button will send us to product activity.
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            if(username.length()!=0) {
                if(upassword.length()!=0) {

                    String uname = username.getText().toString();

                    Intent intent = new Intent(LoginActivity.this, ProductActivity.class);
                    intent.putExtra("uname",uname );
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Password Empty!", Toast.LENGTH_SHORT).show();
                }
            }

            else{
                Toast.makeText(getApplicationContext(),"Username Empty!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
