//Nome: Kevin Lopes Paschoal RA: 97685
//Sexto semestre

package com.uniso.lpdm.restaurango;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;


import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    //Código necessario para exibir a view inicial e o "header em cima"
    protected void onCreate(Bundle savedInstanceState) {
        //associa o layout em activity_main.xml com o que será exibido em tela
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cria a toolbar com o nome da aplicação em cima
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
    }

    //Função que será chamada ao clicar no botão "check_hours"
    public void onClickCheckHours(View view){
        //Encontra a view pelo seu ID
        TextView hours = findViewById(R.id.text_view_total_hours);
        //Chama a função que troca o texto
        hours.setText("Várias horas mesmo");
    }

    public void onClickRegisterOrder(View view){
        TextView order = findViewById(R.id.text_view_order);
        order.setText("Registrando pedido....");
    }

    public void onClickNewMessage(View view){
        Intent intent = new Intent(this,NewMessageActivity.class);
        startActivity(intent);
    }



}