package com.example.a60135847_tuan5_bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nutintro = (Button) findViewById(R.id.btnconfirm);
        nutintro.setOnClickListener(xulychuyensangtip);
    }


    View.OnClickListener xulychuyensangtip = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText edtdn = (EditText) findViewById(R.id.edtusername);
            EditText edtmk = (EditText) findViewById(R.id.edtpass);

            String StringTen = "khoa";
            String StringMk = "123";

            String x = edtdn.getText().toString();
            String y = edtmk.getText().toString();

            if((x.equals(StringTen)) && (y.equals(StringMk))){
                Toast.makeText(MainActivity.this, "Login thành công", Toast.LENGTH_SHORT).show();
                Intent iTips = new Intent (MainActivity.this, Tip.class);
                startActivity(iTips);
            }
            else{
                Toast.makeText(MainActivity.this, "Login thất bại", Toast.LENGTH_SHORT).show();
            }
        }
    };
}