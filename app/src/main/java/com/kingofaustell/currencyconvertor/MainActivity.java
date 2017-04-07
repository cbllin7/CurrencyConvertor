package com.kingofaustell.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view){
        EditText amount = (EditText) findViewById(R.id.amount);
        double value = Double.parseDouble(amount.getText().toString());
        double convert = value * .7;
        Toast.makeText(getApplicationContext(),Double.toString(convert),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
