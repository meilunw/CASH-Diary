package com.example.wumeilun.cashdiary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.ScrollView;
import android.view.LayoutInflater;
import android.widget.TextView;


public class Expense_activity extends AppCompatActivity {
    Button addedExpense;
    Button canceledExpense;
    ScrollView ExpenseDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense_activity);


        addedExpense = findViewById(R.id.Add_New_Expense);
        addedExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addedExpense();
            }
        });
    }
    public void addedExpense() {
        Intent intent = new Intent(this, Added_Expense.class);
        startActivity(intent);
    }
}