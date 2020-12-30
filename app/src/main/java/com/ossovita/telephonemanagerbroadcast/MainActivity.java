package com.ossovita.telephonemanagerbroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView callerText;
    //Bu sefer haberleşmek için local broadcast manager kullanacağız

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callerText = findViewById(R.id.callerText);
    }
}