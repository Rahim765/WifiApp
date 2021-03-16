package com.example.wifiapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.provider.MediaStore;
import android.provider.Settings;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyAlarm extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {


      //  WifiManager wifi = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
       // wifi.setWifiEnabled(true);
       // Toast.makeText(context, "YES", Toast.LENGTH_SHORT).show();
      //  MediaPlayer mediaPlayer = MediaPlayer.create(context, Settings.System.DEFAULT_RINGTONE_URI);
        //mediaPlayer.start();
    }
}
