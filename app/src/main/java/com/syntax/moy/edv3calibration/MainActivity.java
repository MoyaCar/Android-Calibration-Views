package com.syntax.moy.edv3calibration;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView cargar;
    TextView descargar;
    TextView desconector;

    TextView cargaTv;
    TextView cargaExitosaTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargar = findViewById(R.id.cargar_tv);
        descargar = findViewById(R.id.descargar_tv);
        desconector = findViewById(R.id.desconectar);

        cargaTv = findViewById(R.id.carga_flag_view);
        cargaExitosaTv = findViewById(R.id.carga_exitosa_view);

        onTouchColors tc = new onTouchColors();
        onTouchColors2 tc2 = new onTouchColors2();
        onTouchColors3 tc3 = new onTouchColors3();


        cargar.setOnTouchListener(tc);
        descargar.setOnTouchListener(tc2);
        desconector.setOnTouchListener(tc3);

    }


    class onTouchColors implements View.OnTouchListener {
        @Override

        public boolean onTouch(View v, MotionEvent event) {


            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                v.setBackgroundResource(R.color.onTouchBackground);
                cargaTv.setTextColor(getResources().getColor(R.color.ActiveFlag));
            }
            if (event.getAction() == MotionEvent.ACTION_UP) {
                v.setBackgroundResource(R.color.buttonBackground2);
                cargaTv.setTextColor(getResources().getColor(R.color.inactiveFlag));
                cargaExitosaTv.setTextColor(getResources().getColor(R.color.ActiveFlag));
            }

            return true;
        }
    }

    class onTouchColors2 implements View.OnTouchListener {
        @Override

        public boolean onTouch(View v, MotionEvent event) {


            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                v.setBackgroundResource(R.color.onTouchBackground);
            }
            if (event.getAction() == MotionEvent.ACTION_UP) {
                v.setBackgroundResource(R.color.buttonBackground3);
                cargaExitosaTv.setTextColor(getResources().getColor(R.color.inactiveFlag));
            }

            return true;
        }
    }


    class onTouchColors3 implements View.OnTouchListener {
        @Override

        public boolean onTouch(View v, MotionEvent event) {


            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                v.setBackgroundResource(R.color.onTouchBackground);
            }
            if (event.getAction() == MotionEvent.ACTION_UP) {
                v.setBackgroundResource(R.color.buttonBackground2);
            }

            return true;
        }
    }

/*    public void modoManualFlagColor(View view) {

        int verdeFlag = getResources().getColor(R.color.verdeflag);
        int rojoFlag = getResources().getColor(R.color.rojoflag);
        TextView tv = findViewById(R.id.carga_flag_view);

        if (manualVal == 0) {
            tv.setBackgroundColor(verdeFlag);
            manualVal = 1;
        } else {
            tv.setBackgroundColor(rojoFlag);
            manualVal = 0;
        }


    }*/
}
