package com.example.cw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText V1 = findViewById(R.id.EditText);
        final EditText V2 = findViewById(R.id.EditText2);
        Button add = findViewById(R.id.Addition);
        Button sub =findViewById(R.id.Subtraction);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a =V1.getText().toString();
                String b =V2.getText().toString();

                double S1 =Double.parseDouble(a);
                double S2 =Double.parseDouble(b);

                double Z =S1+S2;
                Toast.makeText(MainActivity2.this,"here you can see"+Z,Toast.LENGTH_LONG).show();

            }
        });






        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a =V1.getText().toString();
                String b =V2.getText().toString();

                double S1 =Double.parseDouble(a);
                double S2 =Double.parseDouble(b);
                double Z =S1-S2;
                Toast.makeText(MainActivity2.this, "here you can see"+Z, Toast.LENGTH_LONG).show();
            }



        });
    }
}