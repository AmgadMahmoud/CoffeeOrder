package com.example.android.coffeeorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class OutOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.out_order);
    }

    public void fStartOutOrder(View v) {
        EditText customerName = findViewById(R.id.name_editText);
        String name = customerName.getText().toString();
        EditText customerPhone = findViewById(R.id.phone_editText);
        String phone = customerPhone.getText().toString();
        EditText customerAddress = findViewById(R.id.address_editText);
        String address = customerAddress.getText().toString();
        if (name.equals("") || phone.equals("") || address.equals("")) {
            Toast.makeText(this, "Please fill in all Fields", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(this, StartOrder.class);
            startActivity(i);
        }
    }
}
