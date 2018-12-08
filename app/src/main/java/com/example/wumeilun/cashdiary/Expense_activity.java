package com.example.wumeilun.cashdiary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class Expense_activity extends AppCompatActivity {
    Button addedExpense;
    Button cancelExpense;
    EditText Amount;
    EditText Date;
    EditText Comment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense_activity);
        Amount = (EditText) findViewById(R.id.Money);
        Date = (EditText) findViewById(R.id.Date);
        Comment = (EditText) findViewById(R.id.Comment);
        addedExpense = findViewById(R.id.Add_New_Expense);
        cancelExpense = findViewById(R.id.Cancel_New_Expense);
        cancelExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Amount.getText().clear();
                Date.getText().clear();
                Comment.getText().clear();
            }
        });
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