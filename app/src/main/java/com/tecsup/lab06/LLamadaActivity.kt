package com.tecsup.lab06

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LLamadaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_llamada)

        val btnEnd = findViewById<ImageButton>(R.id.btnEnd)
        btnEnd.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        val intent = intent

        val nombre = intent.getStringExtra("nombre")
        val numero = intent.getStringExtra("numero")

        val Nombre = findViewById<TextView>(R.id.txtNombre)
        Nombre.text = nombre

        val Numero = findViewById<TextView>(R.id.txtLlamadNumero)
        Numero.text = numero
    }

    }

