package com.tpint.myapplication
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val mensaje = intent.getStringExtra("mensaje")
        val textView = findViewById<TextView>(R.id.tvBienvenida)
        val btnContinuar = findViewById<Button>(R.id.btContinuar)

        textView.text = mensaje
    }
}
