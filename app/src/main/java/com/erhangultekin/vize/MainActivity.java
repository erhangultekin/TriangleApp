package com.erhangultekin.vize;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button kontrolButton;
    EditText kenarOne;
    EditText kenarTwo;
    EditText kenarThree;
    String KENAR1_KEY="KENAR1";
    String KENAR2_KEY="KENAR2";
    String KENAR3_KEY="KENAR3";
    int kenarTutan1=0;
    int kenarTutan2=0;
    int kenarTutan3=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(savedInstanceState!=null) {
            kenarTutan1=savedInstanceState.getInt(KENAR1_KEY);
            kenarTutan2=savedInstanceState.getInt(KENAR2_KEY);
            kenarTutan3=savedInstanceState.getInt(KENAR3_KEY);
        }


        kenarOne=findViewById(R.id.kenarOne);
        kenarTwo=findViewById(R.id.kenarTwo);
        kenarThree=findViewById(R.id.kenarThree);
        kontrolButton=findViewById(R.id.kontrolButton);

        kontrolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("kenarOne",Integer.parseInt(kenarOne.getText().toString()));
                intent.putExtra("kenarTwo",Integer.parseInt(kenarTwo.getText().toString()));
                intent.putExtra("kenarThree",Integer.parseInt(kenarThree.getText().toString()));
                startActivity(intent);
            }
        });





    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        kenarTutan1=Integer.parseInt(kenarOne.getText().toString());
        kenarTutan2=Integer.parseInt(kenarTwo.getText().toString());
        kenarTutan3=Integer.parseInt(kenarThree.getText().toString());
        outState.putInt(KENAR1_KEY,kenarTutan1);
        outState.putInt(KENAR2_KEY,kenarTutan2);
        outState.putInt(KENAR3_KEY,kenarTutan3);
    }

}