package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CheckoutActivity extends AppCompatActivity {

    private Button payment;
    private TextView price;
    private TextView gst;
    private TextView qst;
    private TextView amount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        //Buttons and textviews are assigned to the declared variables.
        payment=(Button) findViewById(R.id.pay_btn) ;
        price=(TextView) findViewById(R.id.price);
        gst=(TextView) findViewById(R.id.gst);
        qst=(TextView) findViewById(R.id.qst);
        amount=(TextView) findViewById(R.id.amount);

        // We imported the cost from description activity into String "total".
        String Total=getIntent().getStringExtra("total");

        //Here We are calculating taxes.
        double cost = Double.parseDouble(Total);
        double gstTax= (cost*0.05);
        double qstTax=(cost*0.09975);
        double totalMoney=(cost+gstTax+qstTax);

        // Assigning value to textViews whiile rounding it to 2 decimals.
        price.setText("Cost: "+String.format("%.2f",cost) );
        gst.setText("GST: "+String.format("%.2f",gstTax) );
        qst.setText("QST: "+String.format("%.2f",qstTax) );
        amount.setText("Total Amount: "+String.format("%.2f",totalMoney) );


        // This will give a pop up message after button is pressed.
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getBaseContext(), "Payment Successful! Thanks for shopping with BuyFresh.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
