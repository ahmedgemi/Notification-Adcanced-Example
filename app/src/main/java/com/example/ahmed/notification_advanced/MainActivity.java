package com.example.ahmed.notification_advanced;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.RemoteViews;

public class MainActivity extends AppCompatActivity {


    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = (Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this);

                RemoteViews views = new RemoteViews(getPackageName(), R.layout.notification_layout);

                views.setTextViewText(R.id.textView, "Hello");


                Intent intent = new Intent(MainActivity.this , NotificationReceiver.class);

                PendingIntent pending = PendingIntent.getBroadcast(MainActivity.this,0,intent,0);

                views.setOnClickPendingIntent(R.id.button2,pending);


                builder.setContent(views);

                builder.setSmallIcon(R.drawable.ic_launcher);




                NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

                manager.notify(11,builder.build());

            }
        });
    }


}
