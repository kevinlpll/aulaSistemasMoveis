package com.uniso.lpdm.restaurango;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class TimerActivity  extends AppCompatActivity {

    private int segundos;
    private boolean isExecutando;
    private boolean estavaExecutando;

    protected void onCreate(Bundle savedInstanceState) {
        //associa o layout em activity_message.xml com o que será exibido em tela
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        TextView textView = (TextView) findViewById(R.id.textViewTimer);
        isExecutando = true;
        estavaExecutando = true;
        segundos = 0;


        if(savedInstanceState != null){
            segundos = savedInstanceState.getInt("segundos");
            isExecutando = savedInstanceState.getBoolean("isExecutando");
            estavaExecutando = savedInstanceState.getBoolean("estavaExecutando");

        }


        this.executarTemporizador();
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt("segundos",segundos);
        savedInstanceState.putBoolean("isExecutando",isExecutando);

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onPause(){
        super.onPause();
        estavaExecutando = isExecutando;
        isExecutando = false;
    }
    @Override
    protected void onResume(){
        super.onResume();
        isExecutando = estavaExecutando;
    }

    private void executarTemporizador(){
        final TextView textView = (TextView) findViewById(R.id.textViewTimer);

        final Handler handler = new Handler();

        handler.post(new Runnable() {
            @Override
            public void run() {
                int horas = segundos/3600;
                int minutos = (segundos % 3600)/60;
                int segundos_interno = segundos % 60;

                String tempo = String.format(Locale.getDefault(),"%d:%02d:%02d",
                        horas,minutos,segundos_interno);
                textView.setText(tempo);

                if(isExecutando){
                    segundos++;
                }

                handler.postDelayed(this,1000);

            }
        });
    }


    public void onClickIniciarPausar(View view){
        isExecutando = !isExecutando;
    }

    public void onClickParar(View view){
        isExecutando = false;
        segundos = 0;

    }

}
