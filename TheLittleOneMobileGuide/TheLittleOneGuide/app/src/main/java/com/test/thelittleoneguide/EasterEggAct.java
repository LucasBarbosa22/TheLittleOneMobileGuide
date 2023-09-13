package com.test.thelittleoneguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EasterEggAct extends AppCompatActivity {

    private Button voltar4;

    public EasterEggAct() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.act_easteregg);
        this.voltar4 = (Button)this.findViewById(R.id.voltar4);
        this.voltar4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { EasterEggAct.this.openMainActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}