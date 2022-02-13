package com.example.demomembresia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var datoTransferido = intent.extras
        val dato = datoTransferido?.getString("Nickname")

        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        txtResultado.text = dato
    }
}