package com.example.fiestassignmentapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttomOrder1=findViewById<Button>(R.id.btnOrder1)

        buttomOrder1.setOnClickListener{
            intent= Intent(applicationContext,Insidetheshop2::class.java)
            startActivity(intent)
        }
    }

}