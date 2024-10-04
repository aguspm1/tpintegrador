package com.tpint.myapplication
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.RadioButton
import android.content.Intent
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import android.content.SharedPreferences

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.testinversor)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etApellido = findViewById<EditText>(R.id.etApellido)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val rgPregunta1 = findViewById<RadioGroup>(R.id.rgpregunta1)
        val rgPregunta2 = findViewById<RadioGroup>(R.id.rgpregunta2)
        val rgPregunta3 = findViewById<RadioGroup>(R.id.rgpregunta3)
        val btnContinuar = findViewById<Button>(R.id.btContinuar)

        val datosInversor = getSharedPreferences("Inversiones", Context.MODE_PRIVATE)
        val yaIngreso = datosInversor.getBoolean("estaIngresado", false)

        if (yaIngreso) {
            Toast.makeText(this, "OK! ", Toast.LENGTH_LONG).show()
        }

        // Configurar botón "Continuar"
        btnContinuar.setOnClickListener {
            val nombre = findViewById<EditText>(R.id.etNombre).text.toString()
            val apellido = findViewById<EditText>(R.id.etApellido).text.toString()
            val email = findViewById<EditText>(R.id.etEmail).text.toString()

            val respuesta1 = findViewById<RadioButton>(rgPregunta1.checkedRadioButtonId).text.toString()
            val respuesta2 = findViewById<RadioButton>(rgPregunta2.checkedRadioButtonId).text.toString()
            val respuesta3 = findViewById<RadioButton>(rgPregunta3.checkedRadioButtonId).text.toString()

            val tipoInversor = determinarTipo(respuesta1, respuesta2, respuesta3)

            val mensaje = "Holaa $nombre $apellido!\n sos un Inversor $tipoInversor"


            datosInversor.edit().putBoolean("estaIngresado", true).apply()

            irAlHome(mensaje)
        }
    }

    private fun determinarTipo(respuesta1: String, respuesta2: String, respuesta3: String): String {
        val respuestas = listOf(respuesta1, respuesta2, respuesta3)
        val conteoRespuestas = respuestas.groupingBy { it }.eachCount()

        return when {
            conteoRespuestas.getOrDefault("a", 0) >= 2 -> "Conservador"
            conteoRespuestas.getOrDefault("b", 0) >= 2 -> "Moderado"
            conteoRespuestas.getOrDefault("c", 0) >= 2 -> "Agresivo"
            else -> "Diversificado"
        }
    }

    private fun irAlHome(mensaje: String) {
        val intent = Intent(this, WelcomeActivity::class.java)
        intent.putExtra("mensaje", mensaje)
        startActivity(intent)
        finish()
    }
}