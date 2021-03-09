package com.example.changetextonbuttonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText EditText;
    private TextView TextView;
    private Button Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button = findViewById(R.id.Button);
        TextView = findViewById(R.id.TextView);
        EditText = findViewById(R.id.EditText);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String EditTextValue = EditText.getText().toString();
                TextView.setText(EditTextValue);
            }
        });
    }
}