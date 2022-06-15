package com.example.thibai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                if(userName.equals(userName))
                {
                    Toast.makeText(MainActivity.this, "Welcome," + userName, Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "No Such Username", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}