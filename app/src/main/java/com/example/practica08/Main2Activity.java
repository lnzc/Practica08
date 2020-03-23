package com.example.practica08;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TextView tv= new TextView(this);
        tv.setText("Actividad dos");
        setContentView(R.layout.activity_main2);
        Bundle extras =getIntent().getExtras();
        String valor1= extras.getString("Valor 1");
        String valor2= extras.getString("Valor 2");
        Toast.makeText(getApplicationContext(), "Valores:\n Valor uno: "+ valor1+"\nValor dos: "+valor2, Toast.LENGTH_SHORT).show();
        Button button1=(Button) findViewById(R.id.Button01);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(i);
            }
        });
    }

}
