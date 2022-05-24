package com.example.truongnguyendinhkhoa_60135847_ktbai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText so_a,so_b,chieu_cao;
    TextView ketqua;
    Button Chuvi,Dientich;
    float a,b,c,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        so_a =(EditText) findViewById(R.id.editCD);
        so_b =(EditText) findViewById(R.id.editCR);
        chieu_cao =(EditText) findViewById(R.id.editCC);
        ketqua = (TextView) findViewById(R.id.tv_result);
        Chuvi = (Button) findViewById(R.id.buttonCV);
        Dientich = (Button) findViewById(R.id.buttonDT);
        Chuvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (so_a.getText().toString().equals(" ")) {
                    Toast.makeText(MainActivity.this, "Nhập số A", Toast.LENGTH_SHORT).show();
                } else if (so_b.getText().toString().equals(" ")) {
                    Toast.makeText(MainActivity.this, "Nhập số B", Toast.LENGTH_SHORT).show();
                }
                a = Float.parseFloat(so_a.getText().toString());
                b = Float.parseFloat(so_b.getText().toString());
                y=2*(a+b);
                ketqua.setText(String.valueOf(y));
            }
        });
        Dientich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (so_a.getText().toString().equals(" ")) {
                    Toast.makeText(MainActivity.this, "Nhập số A", Toast.LENGTH_SHORT).show();
                } else if (chieu_cao.getText().toString().equals(" ")) {
                    Toast.makeText(MainActivity.this, "Nhập chiều cao", Toast.LENGTH_SHORT).show();
                }
                a = Float.parseFloat(so_a.getText().toString());
                c = Float.parseFloat(chieu_cao.getText().toString());
                y=a*c;
                ketqua.setText(String.valueOf(y));
            }
        });
    }
}