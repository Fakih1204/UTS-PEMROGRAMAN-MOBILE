package com.example.mycerpen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val buttonBungan: Button = findViewById(R.id.startButton)

        // Set OnClickListener for the button
        buttonBungan.setOnClickListener {
            // Open MainActivity3 when the button is pressed
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}