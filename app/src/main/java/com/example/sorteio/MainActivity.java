package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewHolder.bt_jogar = findViewById(R.id.bt_jogar);
        mViewHolder.tv_resultado = findViewById(R.id.tv_resultado);


        mViewHolder.bt_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int numero = new Random().nextInt(11);
                mViewHolder.tv_resultado.setText("Número: "  + numero);


            }
        });
    }

    private static class ViewHolder{
        Button bt_jogar;
        TextView tv_resultado;
    }
}