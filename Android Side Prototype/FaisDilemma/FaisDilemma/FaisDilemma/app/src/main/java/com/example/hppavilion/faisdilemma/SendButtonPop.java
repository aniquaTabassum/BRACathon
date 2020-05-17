package com.example.hppavilion.faisdilemma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class SendButtonPop extends AppCompatActivity {

    Button yes;
    Button no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_button_pop);

        DisplayMetrics dm= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int) (width*.9),(int)(height*.3));


        yes=(Button) findViewById(R.id.yesButton);
        no=(Button) findViewById(R.id.noButton);


        YesButton();
        NoButton();
    }

    private void YesButton()
    {
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SendButtonPop.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void NoButton()
    {
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SendButtonPop.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
