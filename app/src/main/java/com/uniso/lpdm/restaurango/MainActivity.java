package com.uniso.lpdm.restaurango;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;


import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void onClickCheckHours(View view){
        TextView hours = findViewById(R.id.text_view_total_hours);
        hours.setText("Várias horas mesmo");
    }

    public void onClickRegisterOrder(View view){
        TextView order = findViewById(R.id.text_view_order);
        order.setText("Registrando pedido....");
    }



}