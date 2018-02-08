package com.n9s.flyjet.hk2018020802;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by Student on 2018/2/8.
 */

public class MyAlarmService extends Service
{
    public MyAlarmService()
    {

    }
    @Override
    public IBinder onBind(Intent intent)
    {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        Log.d("SERVICE", "Service Start!");
        return super.onStartCommand(intent, flags, startId);
    }
}
