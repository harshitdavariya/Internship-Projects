package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private EditText num1, num2;
    private Button sum, sub, mult, div;
    private float no1, no2, ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        sum = findViewById(R.id.sum_btn);
        sub = findViewById(R.id.sub_btn);
        mult = findViewById(R.id.mul_btn);
        div = findViewById(R.id.div_btn);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Integer.parseInt(num1.getText().toString());
                no2 = Integer.parseInt(num2.getText().toString());
                ans = no1+no2;
                result.setText("Sum: " + String.valueOf(ans));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Integer.parseInt(num1.getText().toString());
                no2 = Integer.parseInt(num2.getText().toString());
                ans = no1-no2;
                result.setText("Sub: " + String.valueOf(ans));
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Integer.parseInt(num1.getText().toString());
                no2 = Integer.parseInt(num2.getText().toString());
                ans = no1*no2;
                result.setText("Mul: " + String.valueOf(ans));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Integer.parseInt(num1.getText().toString());
                no2 = Integer.parseInt(num2.getText().toString());
                try {
                    ans = no1/no2;
                } catch (ArithmeticException e ) {
                    e.printStackTrace();
                    result.setText("ERROR !!!");
                }
                result.setText("Div: " + String.valueOf(ans));
            }
        });
    }
}