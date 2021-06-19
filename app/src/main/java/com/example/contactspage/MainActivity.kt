package com.example.contactspage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageView=findViewById<ImageView>(R.id.ivContacts)
        imageView.setOnClickListener {
            var intent=Intent(baseContext,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}