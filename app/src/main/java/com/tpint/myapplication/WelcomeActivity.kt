package com.tpint.myapplication
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val mensaje = intent.getStringExtra("mensajeBienvenida")
        val textView = findViewById<TextView>(R.id.tvWelcomeMessage)

        textView.text = mensaje
    }
}
