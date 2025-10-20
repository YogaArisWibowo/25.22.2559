package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.register)
        val btn_register: Button = findViewById(R.id.et_btn_register)

        btn_register.setOnClickListener {
            val pindah: Intent = Intent (this, Login::class.java)
            startActivity(pindah)
        }


    }
}