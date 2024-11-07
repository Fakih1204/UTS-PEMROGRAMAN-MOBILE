package com.example.mycerpen
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            // MemBase MainActivity2 saat tombola dietitian
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
