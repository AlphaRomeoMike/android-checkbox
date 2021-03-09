package com.example.clickonradio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup RadioGroup;
    private RadioButton RadioButton;
    private Button Check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListenerButton();
    }
    public void onClickListenerButton() {
        RadioGroup = findViewById(R.id.RadioGroup);
        Check = findViewById(R.id.Submit);

        Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = RadioGroup.getCheckedRadioButtonId();
                RadioButton = findViewById(selectedId);
                Toast.makeText(MainActivity.this, RadioButton.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}