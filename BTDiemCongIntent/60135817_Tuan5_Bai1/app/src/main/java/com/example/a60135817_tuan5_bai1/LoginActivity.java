package com.example.a60135817_tuan5_bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button nutintro = (Button) findViewById(R.id.btnconfirm);
        nutintro.setOnClickListener(xulychuyensanghome);
    }

    View.OnClickListener xulychuyensanghome = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText edtdn = (EditText) findViewById(R.id.edtusername);
            EditText edtmk = (EditText) findViewById(R.id.edtpass);
            String StringTen = "maicuongtho";
            String StringMk = "Cntt60ntu!";
            if ((edtdn.getText().toString().equals("StringTen")) && (edtmk.getText().toString().equals("StringMk"))) {
                Toast.makeText(LoginActivity.this, "User and Password is correct", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(LoginActivity.this, "User and Password is wrong", Toast.LENGTH_SHORT).show();
            }
        }
    };
}
