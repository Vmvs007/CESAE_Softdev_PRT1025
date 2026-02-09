package com.example.myfirstapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonCumprimentar.setOnClickListener {

            var nome = binding.editNome.text.toString()
            var apelido = binding.editApelido.text.toString()

            if (nome.isEmpty() || apelido.isEmpty()) {
                Toast.makeText(applicationContext, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Olá ${nome} ${apelido}", Toast.LENGTH_SHORT).show()
            }


        }

    }
}