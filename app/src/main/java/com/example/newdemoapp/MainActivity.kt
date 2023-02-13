package com.example.newdemoapp

import androidx.appcompat.app.AppCompatActivity // used in 6th line of code
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

// it is similar to including directories in c++ whose need occurs during the course of the code
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonUpload = findViewById<Button>(R.id.btnUpload)
        val buttonDownload = findViewById<Button>(R.id.btnDownload)

        buttonUpload.setOnClickListener(){
            Toast.makeText(applicationContext,"Uploading..", Toast.LENGTH_SHORT).show()
        }
        buttonDownload.setOnClickListener(){
            Toast.makeText(applicationContext,"Downloading..", Toast.LENGTH_SHORT).show()
        }

    }
}