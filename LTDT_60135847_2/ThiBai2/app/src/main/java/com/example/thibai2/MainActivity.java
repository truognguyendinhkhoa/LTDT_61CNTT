package com.example.thibai2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ten;
    Button IN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ten =(EditText) findViewById(R.id.editCD);
        IN = (Button) findViewById(R.id.buttonCV);
        IN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName=ten.getText().toString();
                Intent iLogin = new Intent(MainActivity.this,QuizActibity.class);
                startActivity(iLogin);
            }
        });
    }
}