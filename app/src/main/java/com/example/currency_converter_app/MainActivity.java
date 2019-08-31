package com.example.currency_converter_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

public void convert(View view){
    EditText indiancurrencyeditText= (EditText) findViewById(R.id.indiancurrencyeditText);
    double indianamount = Double.parseDouble(indiancurrencyeditText.getText().toString());
    double dollaramount = indianamount * 0.014;
    Toast.makeText(this, String.format("$" + dollaramount,toString()), Toast.LENGTH_SHORT).show();
    Log.i("amount", indiancurrencyeditText.getText().toString());
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 }
}
