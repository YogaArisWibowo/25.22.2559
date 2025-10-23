package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
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
        val btn_pria : RadioButton = findViewById(R.id.btn_pria)
        val btn_wanita : RadioButton = findViewById(R.id.btn_wanita)
        val et_kelamin : RadioGroup = findViewById(R.id.et_kelamin)
        val et_sdk : CheckBox = findViewById(R.id.et_sdk)

        btn_register.setOnClickListener {
            val pindah: Intent = Intent (this, Login::class.java)
            //Mendapat id dari RadioButton yang dipilih
            val selectRadioButtonId = et_kelamin.checkedRadioButtonId
            val selectRadioButton : RadioButton = findViewById(selectRadioButtonId)

            //Menentukan Text berdasarkan pilihan
            val jeniskelamin = when(selectRadioButtonId){
                R.id.btn_pria->"Pria"
                R.id.btn_wanita->"Wanita"
                else -> "Tidak diketahui"
            }

            //Memerika apakah Checkbox dicentang
            val isSetuju = et_sdk.isChecked

            // Di dalam onCreate
            val spinnerDomisili: Spinner = findViewById(R.id.spinner_domisili)
            val domisili = spinnerDomisili.selectedItem.toString()



            //Menampilkan Hasilnya Toast
            Toast.makeText(
                this,
                "Jenis Kelamin :  $jeniskelamin, Domisili: $domisili, , setuju: $isSetuju",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(pindah)
        }


    }
}