package com.example.toastmessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe : Button = findViewById(R.id.button2)
        val textClick: TextView = findViewById(R.id.TextView)

        btnClickMe.setOnClickListener {
            Toast.makeText(this@MainActivity,"Hey, Congratulations! Toast Message Working Properly ", Toast.LENGTH_LONG).show()
        }
    }
}