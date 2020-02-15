package com.yasmen.firstapp;

         import androidx.appcompat.app.AppCompatActivity;

         import android.os.Bundle;
         import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);

        btn1 = findViewById(R.id.btn1);
        btn1.setText("Hellow");
    }
}
