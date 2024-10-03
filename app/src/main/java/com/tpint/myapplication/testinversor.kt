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
            val nombre = etNombre.text.toString()
            val apellido = etApellido.text.toString()

            val respuesta1 = findViewById<RadioButton>(rgPregunta1.checkedRadioButtonId)?.text
            val respuesta2 = findViewById<RadioButton>(rgPregunta2.checkedRadioButtonId)?.text
            val respuesta3 = findViewById<RadioButton>(rgPregunta3.checkedRadioButtonId)?.text

            val respuestasSeleccionadas = mutableListOf<String>().apply {
                respuesta1?.let { add(it.toString()) }
                respuesta2?.let { add(it.toString()) }
                respuesta3?.let { add(it.toString()) }
            }

            // Crear mensaje de bienvenida
            val mensaje = "Holaa $nombre $apellido!\n" +
                    "Respuestas del Test del Inversor:\n" +
                    "1. $respuesta1\n" +
                    "2. $respuesta2\n" +
                    "3. $respuesta3\n" +
                    "Cantidad de Respuestas seleccionadas: ${respuestasSeleccionadas.size}"

            datosInversor.edit().putBoolean("estaIngresado", true).apply()

            irAlHome()
        }
    }

                private fun irAlHome() {
                    val intent = Intent(this, WelcomeActivity::class.java)
                    startActivity(intent)
                    finish()
                }
}