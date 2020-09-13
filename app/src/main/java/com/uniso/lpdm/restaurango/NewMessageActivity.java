package com.uniso.lpdm.restaurango;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NewMessageActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        //associa o layout em activity_message.xml com o que será exibido em tela
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }

    public void onSendMessage(View view){
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();

        //Instancia a nova intent com o Action send como parâmetro para o construtor, assim qualquer receptor que entenda ACTION_SEND,
        // pode receber essa activity
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");

        //Efetivamente adiciona o conteúdo à intent
        intent.putExtra(Intent.EXTRA_TEXT,message);

        //Inicia a intent criada
        startActivity(intent);

    }
}
