package com.example.linearlayout

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.linearlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonFerrari.setOnClickListener {

            if(binding.editDistancia.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Por favor, insira a distância",Toast.LENGTH_SHORT).show()
            }else{
                var distancia = binding.editDistancia.text.toString().toDouble()

                var consumo = (25 * distancia) / 100

                binding.textResultado.text = "Consumo: $consumo L"
            }
        }

        binding.buttonClio.setOnClickListener {

            if(binding.editDistancia.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Por favor, insira a distância",Toast.LENGTH_SHORT).show()
            }else{
                var distancia = binding.editDistancia.text.toString().toDouble()

                var consumo = (7.5 * distancia) / 100

                binding.textResultado.text = "Consumo: $consumo L"
            }
        }

        binding.buttonBmw.setOnClickListener {

            if(binding.editDistancia.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Por favor, insira a distância",Toast.LENGTH_SHORT).show()
            }else{
                var distancia = binding.editDistancia.text.toString().toDouble()

                var consumo = (9 * distancia) / 100

                binding.textResultado.text = "Consumo: $consumo L"
            }
        }

    }
}