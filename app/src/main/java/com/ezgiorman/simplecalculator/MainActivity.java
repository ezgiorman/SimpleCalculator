package com.ezgiorman.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstText;
    EditText secondText;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         firstText = findViewById(R.id.number1text);
         secondText = findViewById(R.id.number2text);
         resultText = findViewById(R.id.result);
    }

    public void sum(View view)
    {
        if(firstText.getText().toString().matches("") || secondText.getText().toString().matches(""))
        {
            resultText.setText("Please enter a number.");
        }
        else
        {
            int number1 = Integer.parseInt(firstText.getText().toString());
            int number2 = Integer.parseInt(secondText.getText().toString());

            int result = number1 + number2;

            resultText.setText("Result: " + result);
        }



    }

    public void subtract(View view)
    {
        if(firstText.getText().toString().matches("") || secondText.getText().toString().matches(""))
        {
            resultText.setText("Please enter a number.");
        }
        else
        {
            int number1 = Integer.parseInt(firstText.getText().toString());
            int number2 = Integer.parseInt(secondText.getText().toString());

            int result = number1 - number2;

            resultText.setText("Result: " + result);
        }
    }

    public void multiply(View view)
    {
        if(firstText.getText().toString().matches("") || secondText.getText().toString().matches(""))
        {
            resultText.setText("Please enter a number.");
        }
        else
        {
            int number1 = Integer.parseInt(firstText.getText().toString());
            int number2 = Integer.parseInt(secondText.getText().toString());

            int result = number1 * number2;

            resultText.setText("Result: " + result);
        }
    }

    public void divide(View view)
    {
        if(firstText.getText().toString().matches("") || secondText.getText().toString().matches(""))
        {
            resultText.setText("Please enter a number..");
        }
        else if (secondText.getText().toString().matches("0"))
        {
           resultText.setText("A number cannot divide by 0!");
        }
        else
        {
            int number1 = Integer.parseInt(firstText.getText().toString());
            int number2 = Integer.parseInt(secondText.getText().toString());

            int result = number1 / number2;

            resultText.setText("Result: " + result);
        }
    }

}