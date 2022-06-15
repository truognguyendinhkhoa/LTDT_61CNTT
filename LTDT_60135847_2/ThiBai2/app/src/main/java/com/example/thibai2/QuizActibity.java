package com.example.thibai2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class QuizActibity extends AppCompatActivity {
    CheckBox A, B, C, D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A=(CheckBox)findViewById(R.id.A);
        B=(CheckBox)findViewById(R.id.B);
        C=(CheckBox)findViewById(R.id.C);
        D=(CheckBox)findViewById(R.id.D);

    }
    public void Check(View v)
    {
        String msg="";

        // Concatenation of the checked options in if

        // isChecked() is used to check whether
        // the CheckBox is in true state or not.

        if(A.isChecked())
            msg = msg + " Painting ";
        if(B.isChecked())
            msg = msg + " Reading ";
        if(C.isChecked())
            msg = msg + " Singing ";
        if(D.isChecked())
            msg = msg + " Cooking ";

        // Toast is created to display the
        // message using show() method.
        Toast.makeText(this, msg + "are selected",
                Toast.LENGTH_LONG).show();
    }

}

