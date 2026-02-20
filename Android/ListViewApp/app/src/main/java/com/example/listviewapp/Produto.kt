package com.example.listviewapp

class Produto(var nome: String, var categoria: String, var preco: Double, var peso: Double) {

    override fun toString(): String {
        return "$nome | $preco €"
    }
}