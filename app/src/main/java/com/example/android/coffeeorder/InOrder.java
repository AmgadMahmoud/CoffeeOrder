package com.example.android.coffeeorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_order);
    }

    public void fStartInOrder(View v) {
        EditText table = findViewById(R.id.tableNumber_editText);
        String tableNumber = table.getText().toString();
        if (tableNumber.equals("")) {
            Toast.makeText(this, "Please enter Table Number", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(this, StartOrder.class);
            startActivity(i);
        }
    }
}
