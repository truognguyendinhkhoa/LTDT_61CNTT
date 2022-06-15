package com.example.thibai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewMon;
    ArrayList<String> arrayName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayName = new ArrayList<>();
        arrayName.add("Ngay hom qua");
        arrayName.add("Ngay co em");

        listViewMon = (ListView) findViewById(R.id.listNhac);
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrayName);

        listViewMon.setAdapter(adapter);

        listViewMon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String val = (String) listViewMon.getItemAtPosition(position);

                Toast.makeText(MainActivity.this, val, Toast.LENGTH_LONG).show();

            }
        });
    }

}