package com.test.thelittleoneguide;

import static androidx.constraintlayout.motion.widget.Debug.getLocation;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.test.thelittleoneguide.R.id;

public class MainActivity extends AppCompatActivity {

    FusedLocationProviderClient fusedLocationClient;

    private Button controles,historia,pecas,eastereggs, github, permissao;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.act_main);
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

        getLocation();fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

        getLocation();

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

        github = (Button) this.findViewById(id.github);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://github.com/LucasBarbosa22/TheLittleOne");
                Intent it = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(it);
            }
        });

        permissao = (Button) this.findViewById(id.maps);
        permissao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://github.com/LucasBarbosa22/TheLittleOne");
                Intent it = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(it);
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == 10){
            if(grantResults.length == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                getLocation();
            }
            else{
                {
                    Toast.makeText(MainActivity.this, "Permissão de localização negada.", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    public void getLocation(){
        if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED){
        }
        else{
            requestPermission();
        }
    }
    private void requestPermission(){
        ActivityCompat.requestPermissions(MainActivity.this,
                new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 10);
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