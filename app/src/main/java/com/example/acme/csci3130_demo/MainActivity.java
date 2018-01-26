package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private TextView textWindow;
    private EditText editWindow;


    public void CopyText(View a) {
        Button button1 = (Button) a;
        textWindow =  findViewById(R.id.demoTextBox);
        editWindow =  findViewById(R.id.demoEditBox);
        textWindow.setText(editWindow.getText());
    }

}
