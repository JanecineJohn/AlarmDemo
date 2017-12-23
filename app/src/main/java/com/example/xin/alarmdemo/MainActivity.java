package com.example.xin.alarmdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startAct,setBt,cancelBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*startAct = (Button) findViewById(R.id.startAct);
        setBt = (Button) findViewById(R.id.setTimeButton);
        cancelBt = (Button) findViewById(R.id.cancelButton);
        startAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlarmOperator alarmOperator = new AlarmOperator(MainActivity.this);
                alarmOperator.setAlarm("Test Alarm In MainActivity",15,0);
            }
        });
        setBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(MainActivity.this,
                        Service_monitor.class);
                startService(startIntent);//启动服务
            }
        });

        cancelBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                AlarmOperator alarmOperator = new AlarmOperator();
//                alarmOperator.dismissAlarm(MainActivity.this, "For Test");
                Intent stopIntent = new Intent(MainActivity.this,
                        Service_monitor.class);
                stopService(stopIntent);//停止服务
            }
        });*/
    }
}
