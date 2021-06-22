package com.example.mybroadcastrecievers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
ImageView imageView;

    public MyReceiver(ImageView imageView){
        this.imageView = imageView;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        switch (intent.getAction()){
            case Intent.ACTION_POWER_CONNECTED:
                imageView.setImageResource(R.drawable.power_on);
        }
        switch (intent.getAction()){
            case Intent.ACTION_POWER_DISCONNECTED:
                imageView.setImageResource(R.drawable.power_off);
        }
        switch (intent.getAction()) {
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                Toast.makeText(context, "Airplane Mode is changed...", Toast.LENGTH_SHORT).show();

        }
    }
}