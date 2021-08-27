package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {


   private val clockText:TextView by lazy {
       findViewById(R.id.clockText)
   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clock=clock()
        clockText.text=clock
    }


    private fun clock(): String {
        val sdf = SimpleDateFormat("hh:mm")
        return sdf.format(Date())

    }
}