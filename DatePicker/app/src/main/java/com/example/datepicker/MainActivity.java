package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private DatePicker datePicker;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textviewId);
        button = findViewById(R.id.buttonId);
        datePicker = findViewById(R.id.datepickerId);

        textView.setText(currentDate());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(currentDate());
            }
        });
    }

    String currentDate() {//currentdate pick korar jonno a method create kora hoyeche

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Current Date : ");
        stringBuilder.append(datePicker.getDayOfMonth() + "/");
        stringBuilder.append((datePicker.getMonth()+1) + "/");
        stringBuilder.append(datePicker.getYear());

        return stringBuilder.toString();
    }
}