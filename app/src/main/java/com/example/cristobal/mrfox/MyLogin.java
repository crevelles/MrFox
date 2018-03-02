package com.example.cristobal.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MyLogin extends AppCompatActivity {

    TextView textCredentials;
    TextView username;
    TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_login);

        textCredentials = findViewById(R.id.idCredentials);
        username = findViewById(R.id.idUserName);
        password = findViewById(R.id.idPasswd);

        Typeface fuenteMrFox = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        textCredentials.setTypeface(fuenteMrFox);
        textCredentials.setTextSize(36);
    }

    public void MainActivity(View view){
        if(username.getText().toString().equals("")){
            Toast.makeText(this, "Please enter your username", Toast.LENGTH_LONG).show();
        } else if(password.getText().toString().equals("")){
            Toast.makeText(this, "Please enter your password", Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
}
