package com.example.quizv1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.jetbrains.anko.startActivity
import android.widget.EditText
import android.widget.TextView

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        val btn_login = findViewById<Button>(R.id.btn_login)
        val txt_login = findViewById<EditText>(R.id.txt_login)
        val txt_senha = findViewById<EditText>(R.id.txt_senha)
        var txt_Resultado = findViewById<TextView>(R.id.txt_Resultado)

        btn_login.setOnClickListener{
            nome = txt_login.getText().toString()
            var Senha: String = txt_senha.getText().toString()
            if ((nome == "Cristiano" || nome == "Adriana" || nome == "Guilherme" || nome == "Fernando") && (Senha == "fatec")){
                txt_Resultado.text= "Login Efetuado com Sucesso"
                startActivity<MainActivity>()
            }else{
                txt_Resultado.text = "Senha ou Usuário Inválido!!!"
            }

        }
    }
}