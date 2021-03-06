package com.example.a60135847_tuan5_bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.text.BreakIterator;
import java.util.ArrayList;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity {
    EditText txtten;
    TextView txtchon;
    Button btn;
    ListView lv;
    ArrayList<String> arrList = null;
    ArrayAdapter<String> adapter = null;
    private Object selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtten = (EditText) findViewById(R.id.txtTen);
        txtchon = (TextView) findViewById(R.id.txtselection);

        lv = (ListView) findViewById(R.id.lvperson);
        arrList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>
                (this,
                        android.R.layout.simple_list_item_1,
                        arrList);
        lv.setAdapter(adapter);

        btn = (Button) findViewById(R.id.btnNhap);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                arrList.add(txtten.getText() + "");
                adapter.notifyDataSetChanged();
            }
        });
        lv.setOnItemClickListener(new AdapterView
                .OnItemClickListener() {
            public void onItemClick(
                    AdapterView<?> arg0, View arg1,
                    int arg2, long arg3) {

                txtchon.setText("position : " + arg2 +
                        "; value =" + arrList.get(arg2));
            }
        });
        lv.setOnItemLongClickListener(new AdapterView
                .OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
                                           int arg2, long arg3) {
                arrList.remove(arg2);
                adapter.notifyDataSetChanged();
                return false;
            }
        });
        Spinner spin=(Spinner) findViewById(R.id.spinner1);
        //G??n Data source (arr) v??o Adapter
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arrList
                );
        //ph???i g???i l???nh n??y ????? hi???n th??? danh s??ch cho Spinner
        adapter.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        //Thi???t l???p adapter cho Spinner
        spin.setAdapter(adapter);
        //thi???t l???p s??? ki???n ch???n ph???n t??? cho Spinner
        spin.setOnItemSelectedListener(new MyProcessEvent());
    }
    //Class t???o s??? ki???n
    private class MyProcessEvent implements
            OnItemSelectedListener
    {
        //Khi c?? ch???n l???a th?? v??o h??m n??y
        public void onItemSelected(AdapterView<?> arg0,
                                   View arg1,
                                   int arg2,
                                   long arg3) {
            //arg2 l?? ph???n t??? ???????c ch???n trong data source
            BreakIterator selection = null;
            String[] arr = new String[0];
            selection.setText(arr[arg2]);
        }
        //N???u kh??ng ch???n g?? c???
        public void onNothingSelected(AdapterView<?> arg0) {
            BreakIterator selection = null;
            selection.setText("");
        }
    }
}