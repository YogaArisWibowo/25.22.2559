package com.example.myfirstapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.dashboard)
        val dataList = arrayListOf(
            Mahasiswa("Yoga Aris Wibowo", "25.22.2559"),
            Mahasiswa("Siti Aminah", "25.22.2560"),
            Mahasiswa("Budi Santoso", "25.22.2561")
        )

        val rvMahasiswa: RecyclerView = findViewById(R.id.rv_mahasiswa)
        rvMahasiswa.layoutManager = GridLayoutManager(this, 2)
        val adapter = MahasiswaAdapter(dataList)
        rvMahasiswa.adapter = adapter

    }
}