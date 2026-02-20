package com.example.listviewapp

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.listviewapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var arrayListNomes = ArrayList<String>()
        arrayListNomes.add("Vitor")
        arrayListNomes.add("Joaquim")
        arrayListNomes.add("Joana")
        arrayListNomes.add("António")
        arrayListNomes.add("Ana")

        var arrayAdapterNomes =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayListNomes)

        binding.listNomes.adapter = arrayAdapterNomes

        // Click listener da lista
        binding.listNomes.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(
                applicationContext,
                "Presente: ${arrayListNomes.get(position)}",
                Toast.LENGTH_SHORT
            ).show()

        }

        // Click listener do botão (avançar)
        binding.buttonAvancar.setOnClickListener {
            var i = Intent(this, ComprasActivity::class.java)
            startActivity(i)
        }

    }
}