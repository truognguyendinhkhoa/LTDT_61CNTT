package com.example.a60135847_tuan5_bai2;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Tip extends AppCompatActivity {

    RadioGroup rdg;
    RadioButton rd10,rd15,rd20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tip);

        rdg = (RadioGroup)findViewById(R.id.rg);
        rd10 = (RadioButton)findViewById(R.id.rd10);
        rd15 = (RadioButton)findViewById(R.id.rd15);
        rd20 = (RadioButton)findViewById(R.id.rd20);

        Button tinh = (Button)findViewById(R.id.btntinh);
        tinh.setOnClickListener(tinhtip);
    }

    final View.OnClickListener tinhtip = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            EditText tips = (EditText) findViewById(R.id.editTips);
            String so = tips.getText().toString();
            float gt = 10;
            if (rd10.isChecked()) {
                gt = 10;
            }
            if (rd15.isChecked()) {
                gt = 15;
            }
            if (rd20.isChecked()) {
                gt = 20;
            }
            int tip = Integer.parseInt(so);
            float tile = (float) gt / 100;
            float tientip;
            tientip = tip * tile;

            Toast.makeText(Tip.this,"Money:" + tientip, Toast.LENGTH_SHORT).show();
        }
    };
}
