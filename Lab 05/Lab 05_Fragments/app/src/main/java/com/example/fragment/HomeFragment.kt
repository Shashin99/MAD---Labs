package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val btnDisplay = view.findViewById<Button>(R.id.btnDisplay)
        val etName = view.findViewById<EditText>(R.id.etName)

        btnDisplay.setOnClickListener {
            Toast.makeText(context, "Hello, ${etName.text.toString()} Welcome!", Toast.LENGTH_LONG).show()
        }

        return view
    }


}