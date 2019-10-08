package com.example.luisrodriguezmuoz_tics_7t11_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vista2Activity extends AppCompatActivity {
    Button boton;
    Button boton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista2);
        boton=(Button)findViewById(R.id.button1);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vista2Activity.this, MainActivity.class));
            }
        });
        boton=(Button)findViewById(R.id.button2);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vista2Activity.this, receta1.class));
            }
        });
        boton=(Button)findViewById(R.id.button3);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vista2Activity.this, receta2.class));
            }
        });
        boton=(Button)findViewById(R.id.button4);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vista2Activity.this, receta3.class));
            }
        });
        boton=(Button)findViewById(R.id.button5);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vista2Activity.this, receta4.class));
            }
        });
        boton=(Button)findViewById(R.id.button6);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vista2Activity.this, receta5.class));
            }
        });
        boton=(Button)findViewById(R.id.button7);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vista2Activity.this, receta6.class));
            }
        });
        boton=(Button)findViewById(R.id.button8);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vista2Activity.this, receta7.class));
            }
        });
        boton=(Button)findViewById(R.id.button9);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vista2Activity.this, receta8.class));
            }
        });
        boton=(Button)findViewById(R.id.button10);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vista2Activity.this, receta9.class));
            }
        });
        boton=(Button)findViewById(R.id.button11);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vista2Activity.this, receta10.class));
            }
        });
    }
}
