package com.test.thelittleoneguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PecasAct extends AppCompatActivity {

    private Button voltar2;

    public PecasAct() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.act_pecas);
        this.voltar2 = (Button)this.findViewById(R.id.voltar4);
        this.voltar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { PecasAct.this.openMainActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}