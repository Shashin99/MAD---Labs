package com.example.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        if (intent?.action == "com.example.broadcast-receivers.MY_CUSTOM_ACTION") {
            Toast.makeText(context,"5 seconds passed",Toast.LENGTH_LONG).show()
        }else if (intent?.action == Intent.ACTION_SCREEN_ON) {
            Toast.makeText(context,"Screen On",Toast.LENGTH_LONG).show()
        } else if (intent?.action == Intent.ACTION_SCREEN_OFF) {
        } else if (intent?.action == Intent.ACTION_BATTERY_LOW) {
        }else{

        }
    }
}