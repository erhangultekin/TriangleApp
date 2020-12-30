package com.erhangultekin.vize;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView kenarOne;
    TextView kenarTwo;
    TextView kenarThree;
    TextView informationTextView;
    String KENAR1_KEY="KENAR1";
    String KENAR2_KEY="KENAR2";
    String KENAR3_KEY="KENAR3";
    int kenarTutan1=0;
    int kenarTutan2=0;
    int kenarTutan3=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(savedInstanceState!=null) {
            kenarTutan1=savedInstanceState.getInt(KENAR1_KEY);
            kenarTutan2=savedInstanceState.getInt(KENAR2_KEY);
            kenarTutan3=savedInstanceState.getInt(KENAR3_KEY);
        }


        kenarOne=findViewById(R.id.kenarOne);
        kenarTwo=findViewById(R.id.kenarTwo);
        kenarThree=findViewById(R.id.kenarThree);
        informationTextView=findViewById(R.id.informationTextView);

        Intent intent=getIntent();
        int kenarBir=intent.getIntExtra("kenarOne",0);
        int kenarIki=intent.getIntExtra("kenarTwo",0);
        int kenarUc=intent.getIntExtra("kenarThree",0);

        Ucgen ucgen=new Ucgen(kenarBir,kenarIki,kenarUc);

        kenarOne.setText("KENAR 1 :"+kenarBir);
        kenarTwo.setText("KENAR 2 :"+kenarIki);
        kenarThree.setText("KENAR 3 :"+kenarUc);

       if(ucgen.isValid()==true){
            informationTextView.setText("Yukarıda kenarları verilen ucgen gecerli bir ucgendir");
        }else{
            informationTextView.setText("Yukarıda kenarları verilen ucgen gecersiz bir ucgendir");
        }


    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Intent intent=getIntent();
        kenarTutan1=intent.getIntExtra("kenarOne",0);
        kenarTutan2=intent.getIntExtra("kenarTwo",0);
        kenarTutan3=intent.getIntExtra("kenarThree",0);
        outState.putInt(KENAR1_KEY,kenarTutan1);
        outState.putInt(KENAR2_KEY,kenarTutan2);
        outState.putInt(KENAR3_KEY,kenarTutan3);
    }
    
}