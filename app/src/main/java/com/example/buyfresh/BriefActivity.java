package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BriefActivity extends AppCompatActivity {

    private TextView productTitle,productDescription, productPrice;
    private ImageView productImg;
    private FloatingActionButton checkout,cancelBtn;
    private TextView order1;
    private String value1;
    private Button incrementBtn,decrementBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brief);

        //assigning values to the declared variables.
        productTitle = (TextView) findViewById(R.id.product_title);
        productPrice = (TextView) findViewById(R.id.price_pro);
        productDescription = (TextView) findViewById(R.id.product_description);
        productImg = (ImageView) findViewById(R.id.pro_thumbnail);
        checkout=(FloatingActionButton) findViewById(R.id.purchase_product) ;
        order1= (TextView) findViewById(R.id.order1);
        cancelBtn=(FloatingActionButton) findViewById(R.id.cancel_btn) ;
        incrementBtn=(Button) findViewById(R.id.add_btn) ;
        decrementBtn =(Button) findViewById(R.id.minus_btn) ;


        // Recieving data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        final String Price = intent.getExtras().getString("Price");
        int image = intent.getExtras().getInt("Thumbnail") ;

        // Setting values
        productTitle.setText(Title);
        productDescription.setText(Description);
        productImg.setImageResource(image);
        productPrice.setText(Price +" ea.");

        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // checkout will open only when atleast 1 product is selected otherwise toast message will instruct the user.
                value1 = order1.getText().toString();

                    //String to double value transfer.
                    double number_product = Double.parseDouble(value1);
                    String substr=Price.substring(1);
                    double price_product = Double.parseDouble(substr);

                    if(number_product>0) {
                        Double Total = (number_product * price_product);

                        String s = Double.toString(Total);
                        Intent intent = new Intent(BriefActivity.this, CheckoutActivity.class);
                        intent.putExtra("total", s);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(getBaseContext(), "You need select at least one product for proceeding to payment." , Toast.LENGTH_SHORT ).show();
                    }

            }
        });

// cancel buttons leads to product page cancelling current order.
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BriefActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });

        incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value2 = order1.getText().toString();
                int i = Integer.parseInt(value2);
                i=i+1;
                String s = Integer.toString(i);
                order1.setText(s);
            }
        });

        decrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value2 = order1.getText().toString();
                int i = Integer.parseInt(value2);
                if(i>0){
                i=i-1;
                String s = Integer.toString(i);
                order1.setText(s);}
                else{
                    Toast.makeText(getBaseContext(), "You cannot decrease than that!" , Toast.LENGTH_SHORT ).show();
                }
            }
        });

    }
}