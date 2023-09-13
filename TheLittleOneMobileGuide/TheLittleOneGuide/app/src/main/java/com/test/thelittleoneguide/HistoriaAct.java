package com.test.thelittleoneguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HistoriaAct extends AppCompatActivity {

    private Button voltar;

    public HistoriaAct() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.act_historia);
        this.voltar = (Button)this.findViewById(R.id.voltar);
        this.voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { HistoriaAct.this.openMainActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}