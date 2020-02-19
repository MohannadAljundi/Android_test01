package com.example.sdkandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lisinter extends AppCompatActivity {

    Button btnListen;
    EditText editText_Listen;
    TextView textView_Listen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisinter);

        btnListen = findViewById(R.id.btnListen);
        editText_Listen = findViewById(R.id.editText_Listen);
        textView_Listen = findViewById(R.id.textView_Listen);

         // textView_Listen.getText() =  editText_Listen.getText();

        btnListen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText_Listen.getText().toString();
                textView_Listen.setText(text);
            }
        });


    }
}

