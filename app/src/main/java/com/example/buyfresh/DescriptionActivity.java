package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;


public class DescriptionActivity extends AppCompatActivity  {


    private Button checkout;
    private EditText order1;
    private EditText order2;
    private EditText order3;
    private String value1;
    private String value2;
    private String value3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);


        //Buttons are assigned to the declared variables.
        checkout=(Button) findViewById(R.id.checkout_btn);
        order1= (EditText) findViewById(R.id.order1);
        order2= (EditText) findViewById(R.id.order2);
        order3= (EditText) findViewById(R.id.order3);



        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // For Bananas- cost is calculated according to quantity asked.
                value1 = order1.getText().toString();
                double price_bananas = Double.parseDouble(value1);
                price_bananas=(price_bananas * 0.2);

                // For Mushrooms- cost is calculated according to quantity asked.
                value2 = order2.getText().toString();
                double price_mushroom = Double.parseDouble(value2);
                price_mushroom=(price_mushroom * 0.99);

                //For Berries- cost is calculated according to quantity asked.
                value3 = order3.getText().toString();
                double price_berry = Double.parseDouble(value3);
                price_berry=(price_berry * 3.5);

                //Adding all 3 calculated prices.
                Double Total = (price_bananas + price_mushroom + price_berry);


                //converting to string
                String s=Double.toString(Total);

                //sending data to checkout activity and opening thqt activity too.
                Intent intent=new Intent(DescriptionActivity.this, CheckoutActivity.class);
                intent.putExtra("total", s);
                startActivity(intent);
            }
        });
    }
}