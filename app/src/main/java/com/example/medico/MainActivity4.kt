package com.example.medico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val textView: TextView = findViewById(R.id.DATE)
        val simpleDateFormat = SimpleDateFormat("dd.MM.yyyy")
        val currDateAndTime: String = simpleDateFormat.format(Date())
        textView.text = currDateAndTime

        val textView1: TextView = findViewById(R.id.TIME)
        val simpleDateFormat1 = SimpleDateFormat("hh.MM.ss")
        val currDateAndTime1: String = simpleDateFormat1.format(Date())
        textView1.text = currDateAndTime1

        val button: ImageView = findViewById(R.id.imageView3)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}