package com.example.cristobal.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MySplash extends AppCompatActivity {

    TextView welcome;
    TextView mrFox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_splash);

        welcome = findViewById(R.id.idTittleWelcome);
        mrFox = findViewById(R.id.idTittleMrFox);

        //Cargamos fuentes
        Typeface fuenteWelcome = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        welcome.setTypeface(fuenteWelcome);
        welcome.setTextSize(50);
        Typeface fuenteMrFox = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        mrFox.setTypeface(fuenteMrFox);
        mrFox.setTextSize(66);


        //Cargamos animación
        //Cargamos la animación de welcome
        Animation wel = AnimationUtils.loadAnimation(this, R.anim.animationtitulo);
        welcome.startAnimation(wel);

        //Cargamos la animación de MrFox
        Animation mFox = AnimationUtils.loadAnimation(this, R.anim.animacion_e);
        mrFox.startAnimation(mFox);

        openApp(true);


    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MySplash.this, MyLogin.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }

}
