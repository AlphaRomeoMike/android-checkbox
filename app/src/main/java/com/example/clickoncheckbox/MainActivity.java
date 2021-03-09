package com.example.clickoncheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox Dog, Cat;
    private Button CheckValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog = findViewById(R.id.Dog);
        Cat = findViewById(R.id.Cat);
        CheckValue = findViewById(R.id.CheckValue);

        addListenerOnButton();
        addListenerOnCheckBox();

        }

    public void addListenerOnCheckBox(){
        Dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((Dog)).isChecked()) {
                    Toast.makeText(MainActivity.this, "Dog selected", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void addListenerOnButton() {
        CheckValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result  = new StringBuffer();
                result.append("Selected animal is Dog: ").append(Dog.isChecked());
                result.append("\nSelected animal is Cat: ").append(Cat.isChecked());

                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}