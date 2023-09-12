package com.example.supermarioworldguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.supermarioworldguide.R.id;

public class MainActivity extends AppCompatActivity {
    private Button controles,historia,pecas,eastereggs, saibamais;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.act_main);

        this.historia = (Button)this.findViewById(id.historia);
        this.historia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openHistoriaAct();
            }
        });

        this.controles = (Button)this.findViewById(id.controles);
        this.controles.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openControlesAct();
            }
        });

        this.pecas = (Button)this.findViewById(id.pecas);
        this.pecas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openPecasAct();
            }
        });

        this.eastereggs = (Button)this.findViewById(id.eastereggs);
        this.eastereggs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openEasterEggAct();
            }
        });

        this.saibamais = (Button)this.findViewById(id.saibamais);
        this.saibamais.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openSaibaMaisAct();
            }
        });

    }


    public void openSaibaMaisAct() {
        Intent intent = new Intent(this, SaibaMaisAct.class);
        this.startActivity(intent);
    }

    public void openControlesAct() {
        Intent intent = new Intent(this, ControlesAct.class);
        this.startActivity(intent);
    }

    public void openHistoriaAct() {
        Intent intent = new Intent(this, HistoriaAct.class);
        this.startActivity(intent);
    }

    public void openPecasAct() {
        Intent intent = new Intent(this, PecasAct.class);
        this.startActivity(intent);
    }

    public void openEasterEggAct() {
        Intent intent = new Intent(this, EasterEggAct.class);
        this.startActivity(intent);
    }

}