package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    private Button createButton;
    private CheckBox remeberMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //Button is assigned to the declared variable.
        createButton=(Button) findViewById(R.id.create_btn);
        remeberMe=(CheckBox)findViewById(R.id.terms_conditions) ;


        //clicking create button will send us to product activity.
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (remeberMe.isChecked()) {
                    Intent intent = new Intent(SignupActivity.this, ProductActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getBaseContext(), "Please agree to terms and conditions.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
