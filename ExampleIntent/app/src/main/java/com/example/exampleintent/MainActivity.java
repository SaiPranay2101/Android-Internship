package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,num,email,search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        num = findViewById(R.id.num);
        email = findViewById(R.id.email);
        search = findViewById(R.id.search);

    }

    public void save(View view) {
        String s = name.getText().toString();
        Intent i = new Intent(this,SecondActivity.class);
        i.putExtra("key",s);
        startActivity(i);
    }

    public void dial(View view) {
        String s = num.getText().toString().trim();
        Uri u = Uri.parse("tel:" + s);
        Intent i = new Intent(Intent.ACTION_DIAL,u);
        startActivity(i);

    }

    public void send(View view) {
        String s = email.getText().toString().trim();
        Uri u = Uri.parse("mailto:" + s);
        Intent i = new Intent(Intent.ACTION_SENDTO,u);
        startActivity(i);

    }

    public void search(View view) {
        String s = search.getText().toString().trim();
        Uri u = Uri.parse("https:" + s);
        Intent i = new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);

    }
}