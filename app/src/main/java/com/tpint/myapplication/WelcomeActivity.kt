package com.tpint.myapplication
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mensaje = intent.getStringExtra("mensaje")
        val tvBienvenida = findViewById<TextView>(R.id.tvBienvenida)
        tvBienvenida.text = mensaje

        val btnConsulta = findViewById<Button>(R.id.btnConsulta)
        val btnHistorial = findViewById<Button>(R.id.btnHistorial)
        val btnTyC = findViewById<Button>(R.id.btnTyC)
        val btnSalir = findViewById<Button>(R.id.btnSalir)

        /*   btnConsulta.setOnClickListener {
            val intent = Intent(this, CrearConsultaActivity::class.java)
            startActivity(intent)
        }

        btnHistorial.setOnClickListener {
            val intent = Intent(this, HistorialConsultasActivity::class.java)
            startActivity(intent)
        }*/

        btnTyC.setOnClickListener {
            val intent = Intent(this, termycond::class.java)
            startActivity(intent)
        }

        btnSalir.setOnClickListener {
            finish()
        }

    }
}
