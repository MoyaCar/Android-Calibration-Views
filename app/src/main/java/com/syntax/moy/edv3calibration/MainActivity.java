package com.syntax.moy.edv3calibration;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int manualVal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void modoManualFlagColor(View view) {

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


    }
}
