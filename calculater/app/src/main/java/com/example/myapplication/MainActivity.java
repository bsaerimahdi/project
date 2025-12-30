package com.example.delayfill;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etName, etFamily;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etFamily = findViewById(R.id.etFamily);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {


            String name = "Arad";
            String family = "Mohammad";

            Handler handler = new Handler(Looper.getMainLooper());


            handler.postDelayed(() -> etName.setText(name), 3000);


            handler.postDelayed(() -> etFamily.setText(family), 5000);

        });
    }
}