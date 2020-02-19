package com.example.sdkandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MeterToInch extends AppCompatActivity {

    Button btnCal;
    TextView textView_OutPut;
    EditText editText_Input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter_to_inch);

        btnCal = findViewById(R.id.btnCal);
        textView_OutPut = findViewById(R.id.textView_output);
        editText_Input = findViewById(R.id.editText_input);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double multiplexer = 39.37;
                double result = 0.0;

                try {
                    if(textView_OutPut.getText().toString().equals("")){
                        textView_OutPut.setText(R.string.ErrorMsj);
                    }
                    else {
                        double meterValue = Double.parseDouble(editText_Input.getText().toString());

                        result = meterValue * multiplexer ;

                        textView_OutPut.setText(String.format("%f Inc",result));
                    }

                }catch (Exception ex) {
                    Log.e("Msj","Error");
                    ex.getStackTrace();
                }




            }
        });
    }
}
