package com.example.dtajbi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var tv:TextView
    private lateinit var up:Button
    private lateinit var down:Button
    private lateinit var rst:Button
    private var count:Int = 0
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tv)
        up = findViewById(R.id.up)
        down = findViewById(R.id.down)
        rst = findViewById(R.id.rst)

        up.setOnClickListener {
            val count = count++
            tv.text = ""+count
            Toast.makeText(this, "only Testing Mode", Toast.LENGTH_SHORT).show()
        }

        down.setOnClickListener {
            val count = count--
            tv.text = ""+count
            Toast.makeText(this, "Developer: SR Sheam", Toast.LENGTH_SHORT).show()
        }

        rst.setOnClickListener {
            val count = 0
            tv.text = ""+count
            Toast.makeText(this, "fb: @srs1313", Toast.LENGTH_SHORT).show()
        }
    }
}