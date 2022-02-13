package com.example.demomembresia

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun enviarDatos(view: View){
        val alertaGuardar = AlertDialog.Builder(this)
        val txtNickname = findViewById<TextView>(R.id.txtNickname)
        val nickName = txtNickname.text.toString()

        alertaGuardar.setTitle("Confirmación")
        alertaGuardar.setMessage("¿Está seguro que desea guardar los cambios?")

        alertaGuardar.setNegativeButton("No"){
            dialogInterface: DialogInterface, i: Int -> Toast.makeText(applicationContext, "Accion cancelada", Toast.LENGTH_LONG).show()
        }
        alertaGuardar.setPositiveButton("Si"){
                dialogInterface: DialogInterface, i: Int -> Toast.makeText(applicationContext, "Guardado con exito", Toast.LENGTH_LONG).show()

            var intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("Nickname", nickName)
            startActivity(intent)
        }

        alertaGuardar.show()

    }
}