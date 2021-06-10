package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Declare all the views here
    Button toast,countInc,countDec;
    TextView TV;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialize the views here
        toast = findViewById(R.id.toast);
        countInc = findViewById(R.id.countInc);
        countDec = findViewById(R.id.countDec);

        TV = findViewById(R.id.TV);
        countInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                TV.setText("" +i);
                //TV.setText((String.valueOf(i)));
            }
        });
        countInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                TV.setText("" +i);

            }
        });
        countDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i > 0){
                    i--;
                }
                else{
                    Toast.makeText(MainActivity.this, "Sorry the value cannot be less than 0", Toast.LENGTH_SHORT).show();
                }

                TV.setText("" +i);
                //TV.setText((String.valueOf(i)));

            }
        });
        toast.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome to Android. Your count is "+i, Toast.LENGTH_SHORT).show();

            }
        }));
    }
}