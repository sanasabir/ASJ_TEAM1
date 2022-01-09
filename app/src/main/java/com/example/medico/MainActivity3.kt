package com.example.medico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val textView: TextView = findViewById(R.id.editTextDate)
        val simpleDateFormat = SimpleDateFormat("dd.MM.yyyy")
        val currDateAndTime: String = simpleDateFormat.format(Date())
        textView.text = currDateAndTime

        val button: Button = findViewById(R.id.report)
        button.setOnClickListener {
            val intent = Intent(this, reports::class.java)
            startActivity(intent)
        }

        val textView1: TextView  = findViewById(R.id.covid_icu_1)
        textView1.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val textView2: TextView  = findViewById(R.id.COVID_ICU)
        textView2.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val textView3: TextView  = findViewById(R.id.COVID_ICU_10)
        textView3.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val textView4: TextView  = findViewById(R.id.COVID_ICU_100)
        textView4.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val textView5: TextView  = findViewById(R.id.COVID_ICU_101)
        textView5.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val textView6: TextView  = findViewById(R.id.COVID_ICU_102)
        textView6.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val textView7: TextView  = findViewById(R.id.COVID_ICU_103)
        textView7.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val textView8: TextView  = findViewById(R.id.COVID_ICU_104)
        textView8.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val textView9: TextView  = findViewById(R.id.COVID_ICU_105)
        textView9.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val textView10: TextView  = findViewById(R.id.COVID_ICU_106)
        textView10.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val textView11: TextView  = findViewById(R.id.COVID_ICU_107)
        textView11.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val textView12: TextView  = findViewById(R.id.COVID_ICU_108)
        textView12.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val textView13: TextView  = findViewById(R.id.COVID_ICU_109)
        textView13.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val textView14: TextView  = findViewById(R.id.COVID_ICU_11)
        textView14.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}