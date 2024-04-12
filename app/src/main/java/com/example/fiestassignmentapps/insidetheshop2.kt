package com.example.fiestassignmentapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Insidetheshop2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insidetheshop2)
        val bottomOrder2=findViewById<Button>(R.id.btnOrder2)

        bottomOrder2.setOnClickListener{
            intent= Intent(applicationContext,Insideshop3::class.java)
            startActivity(intent)
        }

    }
}