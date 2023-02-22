package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class regional_v1 extends AppCompatActivity {
    Button btn;
    EditText weight,height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regional);

    btn = findViewById(R.id.btn);
    weight = findViewById(R.id.poids);
    height = findViewById(R.id.taille);

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double bmi = Double.parseDouble(weight.getText().toString()) / (703 * Double.parseDouble(height.getText().toString()) * Double.parseDouble(height.getText().toString()));
            if(bmi<18.5)
                Toast.makeText(regional_v1.this, "Underweight", Toast.LENGTH_SHORT).show();
            else if(bmi>=18.5 && bmi<25)
                Toast.makeText(regional_v1.this, "Normal", Toast.LENGTH_SHORT).show();
            else if(bmi>=25 && bmi<40)
                Toast.makeText(regional_v1.this, "Overweight", Toast.LENGTH_SHORT).show();
            else if(bmi>=40)
                Toast.makeText(regional_v1.this, "Obese", Toast.LENGTH_SHORT).show();
        }
    });

    }

}