package com.example.myfirstapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MahasiswaAdapter(private val listMahasiswa: List<Mahasiswa>) :
    RecyclerView.Adapter<MahasiswaAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNama: TextView = itemView.findViewById(R.id.tv_nama_mahasiswa)
        val tvNim: TextView = itemView.findViewById(R.id.tv_nim_mahasiswa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_mahasiswa, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val mahasiswa = listMahasiswa[position]
        holder.tvNama.text = mahasiswa.nama
        holder.tvNim.text = mahasiswa.nim

        // Tambahkan klik item
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Klik: ${mahasiswa.nama}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = listMahasiswa.size
}