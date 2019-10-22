package com.example.inputoutput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_output.*

class Output : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        val bundle = intent.extras

        val nil = bundle?.getCharSequence(MainActivity.NILAI)
        val nama = bundle?.getCharSequence(MainActivity.NAMA)
        val nim = bundle?.getCharSequence(MainActivity.NIM)

        outNama.text = ("Nama : " +nama)
        outNim.text = ("NIM : " +nim)
        outNilai.text = ("Nilai : " +nil)

        val nilaii = nil.toString().toFloat()

        when {
            nilaii >= 80 -> outKet.text = ("Keterangan : A")
            nilaii >= 60 -> outKet.text = ("Keterangan : B")
            nilaii >= 40 -> outKet.text = ("Keterangan : C")
            nilaii >= 20 -> outKet.text = ("Keterangan : D")
            else -> outKet.text = ("Keterangan : E")
        }

    }
}

