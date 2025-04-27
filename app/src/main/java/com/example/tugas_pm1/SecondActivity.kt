package com.example.tugas_pm1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val accepText: TextView =findViewById(R.id.txt_second)
        val receivedText: String? = intent.getStringExtra("ini dikirim")
        accepText.text = receivedText

    }
}