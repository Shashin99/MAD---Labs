package com.example.broadcastreceivers

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var myBroadcastReceiver: MyReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myBroadcastReceiver = MyReceiver()

        // Register the receiver to listen for broadcast intents with the custom action
        val filter = IntentFilter("com.example.broadcast-receivers.MY_CUSTOM_ACTION")
        val listenToBroadcastsFromOtherApps = false
        val receiverFlags = if (listenToBroadcastsFromOtherApps) {
            ContextCompat.RECEIVER_EXPORTED
        } else {
            ContextCompat.RECEIVER_NOT_EXPORTED
        }
        ContextCompat.registerReceiver(this, myBroadcastReceiver,filter,receiverFlags)

        val systemFilter = IntentFilter()

        systemFilter.addAction(Intent.ACTION_SCREEN_ON)
        systemFilter.addAction(Intent.ACTION_SCREEN_OFF)
        systemFilter.addAction(Intent.ACTION_BATTERY_LOW)
        ContextCompat.registerReceiver(this, myBroadcastReceiver,systemFilter,receiverFlags)

        GlobalScope.launch {
            delay(5000)
            val intent = Intent()
            intent.action = "com.example.broadcast-receivers.MY_CUSTOM_ACTION"
            sendBroadcast(intent)
        }
    }


}
