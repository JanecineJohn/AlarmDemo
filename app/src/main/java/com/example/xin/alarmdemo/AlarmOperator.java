package com.example.xin.alarmdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.AlarmClock;
import android.widget.Toast;

/**
 * Created by xin on 2017/11/8.
 */

public class AlarmOperator {

    Context context;
    public AlarmOperator(Context context){
        this.context = context;
    }
    public void setAlarm(String content, int hour, int minute){
        Intent alarmIntent = new Intent(AlarmClock.ACTION_SET_ALARM);
        alarmIntent.putExtra(AlarmClock.EXTRA_MESSAGE,content);
        alarmIntent.putExtra(AlarmClock.EXTRA_HOUR,hour);
        alarmIntent.putExtra(AlarmClock.EXTRA_MINUTES,minute);
        alarmIntent.putExtra(AlarmClock.EXTRA_SKIP_UI,true);//设置闹钟时不显示系统闹钟界面
        alarmIntent.putExtra(AlarmClock.EXTRA_VIBRATE,true);//设置闹钟响时震动
        alarmIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(alarmIntent);
    }

    public void dismissAlarm(String content){
        if (Build.VERSION.SDK_INT < 23){
            Toast.makeText(context,"手机版本过低,需手动取消闹钟",
                    Toast.LENGTH_SHORT).show();
            Intent alarmIntent = new Intent(AlarmClock.ACTION_SHOW_ALARMS);
            context.startActivity(alarmIntent);
        }else {
            Intent alarmIntent = new Intent(AlarmClock.ACTION_DISMISS_ALARM);
            alarmIntent.putExtra(AlarmClock.ALARM_SEARCH_MODE_LABEL,content);
            context.startActivity(alarmIntent);
        }
    }
}
