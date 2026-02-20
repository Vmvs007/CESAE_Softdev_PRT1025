package com.example.listviewapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.listviewapp.databinding.ActivityComprasBinding

class ComprasActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityComprasBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // VARIÁVEIS - PESO PREÇO ______________________________________________________________________________________________
        var pesoTotal = 0.0
        var precoTotal = 0.0

        // ARRAY LIST CATALOGO ______________________________________________________________________________________________
        var arrayListCatalogo = ArrayList<Produto>()
        arrayListCatalogo.add(Produto("Laptop HP 17", "Laptops", 1500.5, 3.5))
        arrayListCatalogo.add(Produto("Rato Logitech", "Periféricos", 90.0, 0.15))
        arrayListCatalogo.add(Produto("Monitor ASUS", "Monitores", 950.99, 5.25))
        arrayListCatalogo.add(Produto("Laptop ASUS ROG", "Laptops", 1100.9, 2.8))
        arrayListCatalogo.add(Produto("Disco SSD 1TB", "Armazenamento", 150.9, 0.1))
        arrayListCatalogo.add(Produto("Disco SSD 2TB", "Armazenamento", 250.9, 0.1))
        arrayListCatalogo.add(Produto("Processador Intel Core i9", "CPU", 550.99, 0.12))
        arrayListCatalogo.add(Produto("Processador Intel Core i7", "CPU", 390.99, 0.12))
        arrayListCatalogo.add(Produto("NVIDIA RTX 5080", "GPU", 1890.99, 0.45))

        // Atualizar a List View - Catalogo
        var arrayAdapterCatalogo =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayListCatalogo)

        binding.listCatalogo.adapter = arrayAdapterCatalogo

        // ARRAY LIST CARRINHO ______________________________________________________________________________________________
        var arrayListCarrinho = ArrayList<Produto>()


        // CLICK LISTENER CATALOGO ______________________________________________________________________________________________
        binding.listCatalogo.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(applicationContext, "Produto Adicionado", Toast.LENGTH_SHORT).show()

            // Adicionar ao Carrinho o Produto clicado
            arrayListCarrinho.add(arrayListCatalogo.get(position))

            // Atualizar a List View - Carrinho
            var arrayAdapterCarrinho =
                ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayListCarrinho)

            binding.listCarrinho.adapter = arrayAdapterCarrinho

            // Atualizar os campos - PESO PREÇO
            pesoTotal += arrayListCatalogo.get(position).peso
            precoTotal += arrayListCatalogo.get(position).preco

            val pesoArredondado: Double = String.format("%.2f", pesoTotal).toDouble()
            val precoArredondado: Double = String.format("%.2f", precoTotal).toDouble()

            binding.textPeso.text="PESO: $pesoArredondado KG."
            binding.textTotal.text="TOTAL: $precoArredondado €"
        }


        // CLICK LISTENER CARRINHO ______________________________________________________________________________________________
        binding.listCarrinho.setOnItemClickListener { parent, view, position, id ->

            // Atualizar os campos - PESO PREÇO
            pesoTotal -= arrayListCarrinho.get(position).peso
            precoTotal -= arrayListCarrinho.get(position).preco

            val pesoArredondado: Double = String.format("%.2f", pesoTotal).toDouble()
            val precoArredondado: Double = String.format("%.2f", precoTotal).toDouble()

            binding.textPeso.text="PESO: $pesoArredondado KG."
            binding.textTotal.text="TOTAL: $precoArredondado €"

            arrayListCarrinho.removeAt(position)

            // Atualizar a List View - Carrinho
            var arrayAdapterCarrinho =
                ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayListCarrinho)

            binding.listCarrinho.adapter = arrayAdapterCarrinho
        }


    }
}