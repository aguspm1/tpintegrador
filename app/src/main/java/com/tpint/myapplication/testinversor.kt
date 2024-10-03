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


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.testinversor)
        // Inicializar vistas
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etApellido = findViewById<EditText>(R.id.etApellido)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val rgPregunta1 = findViewById<RadioGroup>(R.id.rgpregunta1)
        val rgPregunta2 = findViewById<RadioGroup>(R.id.rgpregunta2)
        val rgPregunta3 = findViewById<RadioGroup>(R.id.rgpregunta3)
        val btnContinuar = findViewById<Button>(R.id.btContinuar)

        // Configurar botón "Continuar"
        btnContinuar.setOnClickListener {


            val etNombre = etNombre.text.toString()
            val etApellido = etApellido.text.toString()
            val etEmail = etEmail.text.toString()

            // Obtener las respuestas seleccionadas
            val respuesta1 = findViewById<RadioButton>(rgPregunta1.checkedRadioButtonId).text
            val respuesta2 = findViewById<RadioButton>(rgPregunta2.checkedRadioButtonId).text
            val respuesta3 = findViewById<RadioButton>(rgPregunta3.checkedRadioButtonId).text

            val datosAlmacenados = getSharedPreferences("loginPref", Context.MODE_PRIVATE)
            // Contar las respuestas seleccionadas
            val respuestasSeleccionadas = mutableListOf<String>().apply {
                add(respuesta1.toString())
                add(respuesta2.toString())
                add(respuesta3.toString())
            }

            // Crear mensaje de bienvenida
            val mensaje = "Hola $etNombre $etApellido!\n"+
            "Respuestas del Test del Inversor:\n" +
                    "1. $respuesta1\n" +
                    "2. $respuesta2\n" +
                    "3. $respuesta3\n" +
                    "Cantidad de Respuestas seleccionadas: ${respuestasSeleccionadas.size}"
            val yaSeLogueo = datosAlmacenados.getBoolean("estaLogueado", false)

            if (yaSeLogueo) {
                Toast.makeText(this, "OK! ", Toast.LENGTH_LONG).show()
            }

            }

        }
    }
    private fun irAWelcomeActivity() {
        val intent = Intent(this, WelcomeActivity::class.java)
        startActivity(intent)
        finish()

    }
}