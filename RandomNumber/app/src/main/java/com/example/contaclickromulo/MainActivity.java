package com.example.contaclickromulo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int i = 0;
    EditText edMin, edMax;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edMin = findViewById(R.id.editTextMin);
        edMax = findViewById(R.id.editTextMax);
        textViewResult = findViewById(R.id.textView);
    }

    public void randNumber(View v){
        int max,min;
        min=Integer.parseInt(edMin.getText().toString());
        max=Integer.parseInt(edMax.getText().toString());
        Random r = new Random();
        int result = r.nextInt(max - min + 1)+min;
        textViewResult.setText(Integer.toString(result));

    }
}