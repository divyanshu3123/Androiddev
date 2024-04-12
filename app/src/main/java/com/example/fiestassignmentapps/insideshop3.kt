package com.example.fiestassignmentapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Insideshop3 : AppCompatActivity() {
    companion object{
        const val DIVYA=" com.example.environmentalists.inside-shop.DIVYA"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insideshop3)
        val bottomOrder3=findViewById<Button>(R.id.btnOrder3)
        val tt1 = findViewById<EditText>(R.id.eT1)
        val tt2 = findViewById<EditText>(R.id.eT2)
        val tt3 = findViewById<EditText>(R.id.eT3)
        val tt4 = findViewById<EditText>(R.id.eT4)

        bottomOrder3.setOnClickListener {
            val orderInformation= tt1.text.toString() + ""   + tt2.text.toString()+  ""  +
                    tt3.text.toString()+ ""  +tt4.text
            intent= Intent(this,Insideshop4::class.java)
            intent.putExtra(DIVYA,orderInformation  )
            startActivity(intent)
        }






    }
}