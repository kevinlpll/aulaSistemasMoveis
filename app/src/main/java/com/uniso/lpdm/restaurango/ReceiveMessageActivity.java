package com.uniso.lpdm.restaurango;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiveMessageActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        //associa o layout em activity_message.xml com o que será exibido em tela
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        //Recupera a intent da página chamadora
        Intent intentReceived = getIntent();

        //Joga tudo em uma stringona
        String message = intentReceived.getStringExtra(Intent.EXTRA_TEXT);

        //Encontra a textview e escreve o conteudo recebido nela
        TextView textView = findViewById(R.id.text_view_message_received);
        textView.setText(message);
    }



}