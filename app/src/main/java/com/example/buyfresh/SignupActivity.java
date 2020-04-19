package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupActivity extends AppCompatActivity {

    private Button createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //Button is assigned to the declared variable.
        createButton=(Button) findViewById(R.id.create_btn);


        //clicking create button will send us to product activity.
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignupActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });

    }
}
