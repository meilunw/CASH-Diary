package com.example.wumeilun.cashdiary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {
    Button balance;
    Button income;
    Button expense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        balance = findViewById(R.id.balance_button);
        income = findViewById(R.id.income_button);
        expense = findViewById(R.id.expense_button);
        balance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                income();
            }
        });
        expense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void income() {
        Intent intent = new Intent(this, Income_activity.class);
        startActivity(intent);
    }
}