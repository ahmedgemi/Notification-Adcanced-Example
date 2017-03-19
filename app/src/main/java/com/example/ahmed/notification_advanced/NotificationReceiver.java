package com.example.ahmed.notification_advanced;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by ahmed on 15/03/17.
 */

public class NotificationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"Welcome Android",Toast.LENGTH_SHORT).show();
    }
}
