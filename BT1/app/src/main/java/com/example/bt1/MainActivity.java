package com.example.bt1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText so_a,so_b;
    TextView ketqua;
    Button cong,tru,nhan,chia;
    float a,b,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        so_a =(EditText) findViewById(R.id.editimput1);
        so_b =(EditText) findViewById(R.id.editimput2);
        ketqua = (TextView) findViewById(R.id.tv_result);
        cong = (Button) findViewById(R.id.btncong);
        tru = (Button) findViewById(R.id.btntru);
        nhan = (Button) findViewById(R.id.btnnhan);
        chia = (Button) findViewById(R.id.btnchia);
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (so_a.getText().toString().equals(" ")) {
                    Toast.makeText(MainActivity.this, "Nhập số A", Toast.LENGTH_SHORT).show();
                } else if (so_b.getText().toString().equals(" ")) {
                    Toast.makeText(MainActivity.this, "Nhập số B", Toast.LENGTH_SHORT).show();
                }
                a = Float.parseFloat(so_a.getText().toString());
                b = Float.parseFloat(so_b.getText().toString());
                y=a+b;
                ketqua.setText(String.valueOf(y));
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.parseFloat(so_a.getText().toString());
                b = Float.parseFloat(so_b.getText().toString());
                y=a-b;
                ketqua.setText(String.valueOf(y));
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.parseFloat(so_a.getText().toString());
                b = Float.parseFloat(so_b.getText().toString());
                y=a*b;
                ketqua.setText(String.valueOf(y));
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.parseFloat(so_a.getText().toString());
                b = Float.parseFloat(so_b.getText().toString());
                y=a/b;
                ketqua.setText(String.valueOf(y));
            }
        });
    }
}