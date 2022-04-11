package com.example.a60135817_tuan5_bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nutintro = (Button) findViewById(R.id.btnlogin);
        nutintro.setOnClickListener(xulychuyensanglogin);

    }

    View.OnClickListener xulychuyensanglogin = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent iLogin = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(iLogin);
        }
    };
}