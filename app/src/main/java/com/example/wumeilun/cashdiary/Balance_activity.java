package com.example.wumeilun.cashdiary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class Balance_activity extends AppCompatActivity {
    TextView Amount1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_activity);

        Amount1 = (TextView) findViewById(R.id.textView6);

        Intent intent = getIntent();
        String str = intent.getStringExtra("Amount");
        Amount1.setText(str);
    }
}
