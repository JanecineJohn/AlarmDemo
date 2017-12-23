package com.example.xin.alarmdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class Service_monitor extends Service {
    public Service_monitor() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    //服务创建时调用
    @Override
    public void onCreate() {
        super.onCreate();
    }

    //服务启动时调用
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i < 5){
                    AlarmOperator alarmOperator = new AlarmOperator(Service_monitor.this);
                    alarmOperator.setAlarm("Test Alarm In Service"+i,14,0);
                    i++;
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                stopSelf();
            }
        }).start();
        return super.onStartCommand(intent, flags, startId);
    }

    //服务销毁时调用
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
