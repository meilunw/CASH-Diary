package com.example.wumeilun.cashdiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Income_activity extends AppCompatActivity {
    String Date, Comment;
    double Amount;

    Button AddIncome;
    EditText AmountInput;
    EditText DateInput;
    EditText CommentInput;
    Button Cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_activity);
        AddIncome = findViewById(R.id.Add_New_Income);
        AmountInput = (EditText) findViewById(R.id.Money);
        DateInput = (EditText) findViewById(R.id.Date);
        CommentInput = (EditText) findViewById(R.id.Comment);
        Cancel = findViewById(R.id.Cancel);
        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AmountInput.getText().clear();
                DateInput.getText().clear();
                CommentInput.getText().clear();
            }
        });
        AddIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Amount = Double.valueOf(AmountInput.getText().toString());
                Date = DateInput.getText().toString();
                Comment = CommentInput.getText().toString();

                Intent intent = new Intent(getApplicationContext(), Balance_activity.class);
                intent.putExtra("Amount", Amount);

                startActivity(intent);

                addincome();
            }
        });
    }
    public void addincome() {
        Intent intent = new Intent(this, AddedIncome.class);
        startActivity(intent);
    }
}
