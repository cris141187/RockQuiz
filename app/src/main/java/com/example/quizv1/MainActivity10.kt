package com.example.quizv1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.startActivity

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        val btnfim = findViewById<Button>(R.id.btnfim)
        val txtfim = findViewById<TextView>(R.id.txtfim)
        val txtfim2 = findViewById<TextView>(R.id.txtfim2)
        val txttks = findViewById<TextView>(R.id.txttks)
        val btn_inicio = findViewById<Button>(R.id.btn_inicio)

        btnfim.setOnClickListener{
            txtfim.text = "$cont de $cont2"
            txtfim2.text = "Respondidas $cont2 de 10"
            txttks.text = "Obrigado $nome por brincar em nosso Quiz"
        }
        btn_inicio.setOnClickListener {
            0.also { cont = it }
            0.also { cont2 = it }
            startActivity<MainActivity1>()
        }
    }
}