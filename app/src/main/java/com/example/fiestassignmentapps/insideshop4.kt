package com.example.fiestassignmentapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Insideshop4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insideshop4)
        val mew5 =findViewById<TextView>(R.id.just4)
        val orderOfCustomer =intent.getStringExtra(Insideshop3.DIVYA)
            mew5.text= "ORDER PLACED - " +" "+
                    "YOUR ORDER IFORMATION -  "+ orderOfCustomer.toString()
       }
    }
