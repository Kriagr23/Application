package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.graphics.Color
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the button using findViewById
        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            // Call a function to handle the button click
            onButtonClick(textView)
        }
    }
    fun onButtonClick(textView: TextView) {
        // Change the button color when clicked
        textView.setBackgroundColor(Color.BLUE)
    }
}