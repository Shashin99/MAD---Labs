package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgHome:ImageView = findViewById(R.id.HomeImage)
        val imgUser:ImageView = findViewById(R.id.UserImage)
        val fragmentHome = HomeFragment()
        val fragmentUser = UserFragment()
        imgUser.setOnClickListener {
            imgHome.setImageResource(R.drawable.unselected_home)
            imgUser.setImageResource(R.drawable.selected_user)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView3, fragmentUser)
                commit()
            }
        }
        imgHome.setOnClickListener {
            imgHome.setImageResource(R.drawable.selected_home)
            imgUser.setImageResource(R.drawable.unselected_user)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView3, fragmentHome)
                commit()
            }
        }
    }
}