package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    private Button createButton;
    private CheckBox remeberMe;
    private EditText username,uemail,uphone,upassword,uconfirmpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //Button is assigned to the declared variable.
        createButton=(Button) findViewById(R.id.create_btn);
        remeberMe=(CheckBox)findViewById(R.id.terms_conditions) ;
        username=(EditText) findViewById(R.id.signup_name);
        uemail=(EditText) findViewById(R.id.signup_email);
        uphone=(EditText) findViewById(R.id.signup_phone);
        upassword=(EditText) findViewById(R.id.signup_password);
        uconfirmpass=(EditText) findViewById(R.id.signup_confirm);



        //clicking create button will send us to product activity.
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(username.length()!=0) {
                    if(uemail.length()!=0) {
                        if(uphone.length()!=0) {
                            if(upassword.length()!=0) {
                                if(uconfirmpass.length()!=0) {

                                    String passwrd = upassword.getText().toString();
                                    String conpasswrd = uconfirmpass.getText().toString();

                                    if(conpasswrd.equals(passwrd)) {
                                        if(remeberMe.isChecked()) {

                                            String uname = username.getText().toString();

                                            Intent intent = new Intent(SignupActivity.this, ProductActivity.class);
                                            intent.putExtra("uname",uname );
                                            startActivity(intent);
                                        }
                                        else{
                                            Toast.makeText(getApplicationContext(),"Please agree to terms and conditions.", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    else{
                                        Toast.makeText(getApplicationContext(),"Both password don't match. Try Again.", Toast.LENGTH_SHORT).show();
                                    }
                                }
                                else{
                                    Toast.makeText(getApplicationContext(),"Enter confirm password ", Toast.LENGTH_SHORT).show();
                                }
                            }
                            else{
                                Toast.makeText(getApplicationContext(),"Enter Your Password", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"Enter Your Phone Number", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Enter Your Email", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"Enter Your Name", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
