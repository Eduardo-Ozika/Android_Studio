package com.ozika.ifto.animalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void proximaPagina(View view){
        Intent it = new Intent(MainActivity.this,SegundaActivity.class);
        startActivity(it);
        finish();
    }
}