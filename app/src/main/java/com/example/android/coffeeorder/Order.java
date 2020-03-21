package com.example.android.coffeeorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Order extends AppCompatActivity {

    int Quantity=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);
    }
    public void increment(View view) {
        if (Quantity == 100) {
            Toast.makeText(this, "You cannot have more than 100 coffees", Toast.LENGTH_SHORT).show();
            return;
        }
        Quantity = Quantity + 1;
        displayQuantity(Quantity);
    }
    public void decrement(View view) {
        if (Quantity == 1) {
            Toast.makeText(this, "You cannot have less than 1 coffee", Toast.LENGTH_SHORT).show();
            return;
        }
        Quantity = Quantity - 1;
        displayQuantity(Quantity);
    }
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        String display = Integer.toString(numberOfCoffees);
        quantityTextView.setText(display);
    }
    public void submitOrder(View view) {
        CheckBox whippedCreamCheckbox = findViewById(R.id.whipped_cream_checkbox);
        boolean hasWhippedCream = whippedCreamCheckbox.isChecked();
        CheckBox chocolateCheckbox = findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate = chocolateCheckbox.isChecked();

        int price = calculatePrice(hasWhippedCream,hasChocolate);
        String summary = createOrderSummary(price,hasWhippedCream,hasChocolate);
        displayMessage(summary);
    }
    private int calculatePrice(boolean hasWhippedCream,boolean hasChocolate) {
        int basePrice = 5;
        if(hasWhippedCream){
            basePrice += 1;
        }
        if(hasChocolate){
            basePrice += 1;
        }
        return Quantity * basePrice;
    }
    public String createOrderSummary(int price,boolean hasWhippedCream,boolean hasChocolate){
        String priceMessage = "add whipped Cream= "+hasWhippedCream;
        priceMessage += "\nadd chocolate= "+hasChocolate;
        priceMessage += "\nQuantity= "+Quantity;
        priceMessage += "\nTotal= $"+price;
        priceMessage += "\nthank you!";
        return priceMessage;
    }
    private void displayMessage(String message) {
        TextView orderSummaryTextView = findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}
