package com.example.android.coffeeorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class StartOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_order);
    }

    public void addMore(View v){
        Intent i = new Intent(this,Order.class);
        startActivity(i);
    }
}
