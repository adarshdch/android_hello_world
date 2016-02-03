package com.example.adarshk.hello_world;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class HelloReceiver extends BroadcastReceiver {
    public HelloReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
    }
}
