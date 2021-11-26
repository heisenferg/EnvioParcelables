package com.example.envioparcelables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Contacto a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/M/yyyy");
        try {
            a = new Contacto("Pedro Perez",  "666333444",2,simpleDateFormat.parse("25/10/1997"), false);
            a.addFamiliar(new Contacto("Elena perez", "615789566", 4, simpleDateFormat.parse("20/1/1997"), true));
            
        } catch (ParseException e) {
            System.out.println("Error en formato de fecha");
        }
        TextView t = findViewById(R.id.textView);
        t.setText("Vamos a enviar los datos de " + a.mNombre);
        Button button = findViewById(R.id.button);
        button.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v){
        Intent i = new Intent(this, ActivityB.class);
        i.putExtra("Pedro",a);
        startActivity(i);
    }




}