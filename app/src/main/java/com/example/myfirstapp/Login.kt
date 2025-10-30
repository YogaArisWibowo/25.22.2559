package com.example.myfirstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login)


        val et_Username : EditText = findViewById(R.id.et_Username)
        val et_Password : EditText = findViewById(R.id.et_Password)
        val btn_login : Button = findViewById(R.id.et_btn_login)
        val et_Register: TextView = findViewById( R.id.et_btn_register)
        val btn_situs: Button = findViewById(R.id.et_btn_situs)

        btn_login.setOnClickListener {
            val username = et_Username.text.toString()
            val pindah: Intent = Intent(this,Dashboard::class.java)
            pindah.putExtra( "nama", username)
            startActivity(pindah)
        }
        et_Register.setOnClickListener {
            val pindah: Intent = Intent(this, Register::class.java)
            startActivity(pindah)

        }

        btn_situs.setOnClickListener {
            val url = "https://id.pinterest.com" // Ganti dengan URL yang kamu inginkan
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

    }

}