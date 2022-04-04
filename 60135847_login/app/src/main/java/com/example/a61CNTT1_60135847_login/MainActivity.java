package com.example.a61CNTT1_60135847_login;

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
        // Khai báo nút
        Button nutintro = (Button) findViewById(R.id.btnlogin);
        //Cài đặt nút xử lý
        nutintro.setOnClickListener(xulychuyensanglogin);

    }

    View.OnClickListener xulychuyensanglogin = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            //chuyển trang
            Intent iLogin = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(iLogin);
        }
    };
}