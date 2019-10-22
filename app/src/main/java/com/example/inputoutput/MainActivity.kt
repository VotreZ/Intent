package com.example.inputoutput

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        val NAMA: String? = "Nama"
        val NIM: String? = "NIM"
        val NILAI: String? = "Nilai"
    }

    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        simpan.setOnClickListener{
            if (nama.text.isEmpty() || nim.text.isEmpty() || nilai.text.isEmpty()){
                Toast.makeText(this, "Silahkan Lengkapi Data", Toast.LENGTH_SHORT).show()
            }else if (nama.text.isNotEmpty() || nim.text.isNotEmpty() || nilai.text.isNotEmpty()){
                Toast.makeText(this, "Berhasil", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, Output::class.java)
                val bundle = Bundle()

                bundle.putString(NAMA, nama.text.toString())
                bundle.putString(NIM, nim.text.toString())
                bundle.putString(NILAI, nilai.text.toString())

                intent.putExtras(bundle)
                startActivity(intent)

                Toast.makeText( this, "Berhasil", Toast.LENGTH_SHORT)
                }
        }
    }
}
