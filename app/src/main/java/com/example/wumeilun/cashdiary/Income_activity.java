package com.example.wumeilun.cashdiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Income_activity extends AppCompatActivity {
    Button AddIncome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_activity);
        AddIncome = findViewById(R.id.Add_New_Income);
        AddIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addincome();
            }
        });
    }
    public void addincome() {
        Intent intent = new Intent(this, AddedIncome.class);
        startActivity(intent);
    }
}
