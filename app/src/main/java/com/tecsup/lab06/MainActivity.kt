package com.tecsup.lab06

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            val intent = Intent(this, LLamadaActivity::class.java)
            intent.putExtra("nombre", "Daniel Ramirez")
            intent.putExtra("numero", "933 928 155")
            startActivity(intent)
        }

        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            val intent = Intent(this, LLamadaActivity::class.java)
            intent.putExtra("nombre", "Samuel Ramirez")
            intent.putExtra("numero", "923 456 311")
            startActivity(intent)
        }

        val btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener {
            val intent = Intent(this, LLamadaActivity::class.java)
            intent.putExtra("nombre", "Hennry Ramirez")
            intent.putExtra("numero", "944 739 449")
            startActivity(intent)
        }

        val btn4 = findViewById<Button>(R.id.btn4)
        btn4.setOnClickListener {
            val intent = Intent(this, LLamadaActivity::class.java)
            intent.putExtra("nombre", "Lucas Preira")
            intent.putExtra("numero", "924 930 329")
            startActivity(intent)
        }
    }
}
