package com.example.taskify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.Button;
import java.math.*;
//FOR BEST UI EXPERIENCE USE PIXEL 6 PRO
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ToggleButton buttonAnkara,buttonBaku,buttonBarcelona,buttonDubai,buttonHavana,buttonIstanbul,buttonJerusalem,buttonMadrid,buttonMiami,buttonMonaco;
    int l1,s1,l2,s2,dif;
    Button buttonRefresh;
    Button buttonGo;
    TextView minutes;
    TextView stations;
    ImageView warningImage;
    int k=0;
    TextView changeLanesText,minutesText,stationsText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAnkara = findViewById(R.id.toggleButton1);
        buttonBaku = findViewById(R.id.toggleButton2);
        buttonBarcelona = findViewById(R.id.toggleButton3);
        buttonDubai = findViewById(R.id.toggleButton4);
        buttonHavana = findViewById(R.id.toggleButton5);
        buttonIstanbul = findViewById(R.id.toggleButton6);
        buttonJerusalem = findViewById(R.id.toggleButton7);
        buttonMadrid = findViewById(R.id.toggleButton8);
        buttonMiami = findViewById(R.id.toggleButton9);
        buttonMonaco = findViewById(R.id.toggleButton10);

        buttonRefresh = findViewById(R.id.button3);
        buttonGo = findViewById(R.id.button4);
        minutes = findViewById(R.id.textViewMinutes);
        stations = findViewById(R.id.textViewStations);
        warningImage = findViewById(R.id.imageViewWarn);

        buttonAnkara.setOnClickListener(this);
        buttonBaku.setOnClickListener(this);
        buttonBarcelona.setOnClickListener(this);
        buttonDubai.setOnClickListener(this);
        buttonHavana.setOnClickListener(this);
        buttonIstanbul.setOnClickListener(this);
        buttonJerusalem.setOnClickListener(this);
        buttonMadrid.setOnClickListener(this);
        buttonMiami.setOnClickListener(this);
        buttonMonaco.setOnClickListener(this);

        buttonRefresh.setOnClickListener(this);
        buttonGo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        if(buttonRefresh.isPressed())
        {
            k=0;
            buttonGo.setClickable(false);
            buttonAnkara.setChecked(false);
            buttonBaku.setChecked(false);
            buttonBarcelona.setChecked(false);
            buttonDubai.setChecked(false);
            buttonHavana.setChecked(false);
            buttonIstanbul.setChecked(false);
            buttonJerusalem.setChecked(false);
            buttonMadrid.setChecked(false);
            buttonMiami.setChecked(false);
            buttonMonaco.setChecked(false);
            minutes.setText("Expected time: ");
            stations.setText("");
            warningImage.setVisibility(View.INVISIBLE);
        }
        else if(buttonGo.isPressed())
        {
            if (l1 == 3) {
                if (l2 == 0) {
                    l1 = 0;
                    s1 = 5;
                }
                if (l2 == 1) {
                    l1 = 1;
                    s1 = 0;
                }
            }
            if (l2 == 3) {
                if (l1 == 0) {
                    l2 = 0;
                    s2 = 5;
                }
                if (l1 == 1) {
                    l2 = 1;
                    s2 = 0;
                }
            }
            if(l1==l2)
            {
                dif = Math.abs(s2-s1);
            }
            else if(l1==0 && l2==1)
            {
                warningImage.setVisibility(View.VISIBLE);
                dif = (Math.abs(s2)+Math.abs(s1-5));
            }
            else if(l1==1 && l2==0)
            {
                warningImage.setVisibility(View.VISIBLE);
                dif = (Math.abs(s1)+Math.abs(s2-5));
            }
            minutes.setText("Expected time: "+dif*3+" min");
            stations.setText(dif+" stations");
        }
        else{
            buttonGo.setClickable(true);
            if ((buttonAnkara.isPressed() && !buttonAnkara.isChecked()) || (buttonBaku.isPressed() && !buttonBaku.isChecked()) || (buttonBarcelona.isPressed() && !buttonBarcelona.isChecked()) || (buttonDubai.isPressed() && !buttonDubai.isChecked()) || (buttonHavana.isPressed() && !buttonHavana.isChecked()) || (buttonIstanbul.isPressed() && !buttonIstanbul.isChecked()) || (buttonJerusalem.isPressed() && !buttonJerusalem.isChecked()) || (buttonMadrid.isPressed() && !buttonMadrid.isChecked()) || (buttonMiami.isPressed() && !buttonMiami.isChecked()) || (buttonMonaco.isPressed() && !buttonMonaco.isChecked()))
                k--;
            if (buttonAnkara.isPressed() && buttonAnkara.isChecked()) {
                k++;
                if (k == 1) {
                    l1 = 0;
                    s1 = 0;
                }
                if (k == 2) {
                    l2 = 0;
                    s2 = 0;
                }
            } else if (buttonBaku.isPressed() && buttonBaku.isChecked()) {
                k++;
                if (k == 1) {
                    l1 = 0;
                    s1 = 1;
                }
                if (k == 2) {
                    l2 = 0;
                    s2 = 1;
                }
            } else if (buttonBarcelona.isPressed() && buttonBarcelona.isChecked()) {
                k++;
                if (k == 1) {
                    l1 = 0;
                    s1 = 2;
                }
                if (k == 2) {
                    l2 = 0;
                    s2 = 2;
                }
            } else if (buttonDubai.isPressed() && buttonDubai.isChecked()) {
                k++;
                if (k == 1) {
                    l1 = 0;
                    s1 = 3;
                }
                if (k == 2) {
                    l2 = 0;
                    s2 = 3;
                }
            } else if (buttonHavana.isPressed() && buttonHavana.isChecked()) {
                k++;
                if (k == 1) {
                    l1 = 0;
                    s1 = 4;
                }
                if (k == 2) {
                    l2 = 0;
                    s2 = 4;
                }
            } else if (buttonIstanbul.isPressed() && buttonIstanbul.isChecked()) {
                k++;
                if (k == 1) {
                    l1 = 3;
                    s1 = 100;
                }
                if (k == 2) {
                    l2 = 3;
                    s2 = 100;
                }
            } else if (buttonJerusalem.isPressed() && buttonJerusalem.isChecked()) {
                k++;
                if (k == 1) {
                    l1 = 0;
                    s1 = 6;
                }
                if (k == 2) {
                    l2 = 0;
                    s2 = 6;
                }
            } else if (buttonMadrid.isPressed() && buttonMadrid.isChecked()) {
                k++;
                if (k == 1) {
                    l1 = 1;
                    s1 = 1;
                }
                if (k == 2) {
                    l2 = 1;
                    s2 = 1;
                }
            } else if (buttonMiami.isPressed() && buttonMiami.isChecked()) {
                k++;
                if (k == 1) {
                    l1 = 1;
                    s1 = 2;
                }
                if (k == 2) {
                    l2 = 1;
                    s2 = 2;
                }
            } else if (buttonMonaco.isPressed() && buttonMonaco.isChecked()) {
                k++;
                if (k == 1) {
                    l1 = 1;
                    s1 = 3;
                }
                if (k == 2) {
                    l2 = 1;
                    s2 = 3;
                }
            }

        }
    }
}