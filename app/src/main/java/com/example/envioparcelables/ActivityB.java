package com.example.envioparcelables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        TextView t = findViewById(R.id.textView2);
        Contacto c = getIntent().getParcelableExtra("Pedro");
        t.setText(c.mNombre+ " " + c.mTelefono);
    }
}