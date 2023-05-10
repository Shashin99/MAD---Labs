package com.example.notificationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

    private lateinit var notificationHelper: NotificationHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notificationHelper = NotificationHelper(this)
    }

    fun sendNotificationOnClick(view: View) {
        notificationHelper.sendNotification()
    }
}
