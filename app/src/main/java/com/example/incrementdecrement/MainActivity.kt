package com.example.incrementdecrement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var text= findViewById<TextView>(R.id.textview)
        var plus= findViewById<Button>(R.id.increment_button)
        var  count=0

        plus.setOnClickListener{
            count++
            text.setText(count.toString())
        }
    }
}