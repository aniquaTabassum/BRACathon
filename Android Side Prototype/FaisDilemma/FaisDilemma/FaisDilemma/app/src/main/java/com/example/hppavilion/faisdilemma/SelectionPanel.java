package com.example.hppavilion.faisdilemma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectionPanel extends AppCompatActivity {

    Button attendance;
    Button performance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_panel);

        attendance = (Button) findViewById(R.id.attendanceButton);
        performance = (Button) findViewById(R.id.performanceButton);

        OnClickAttendance();
    }


    private void OnClickAttendance()
    {
        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectionPanel.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }

    private void OnClickPerformance()
    {

    }

}
