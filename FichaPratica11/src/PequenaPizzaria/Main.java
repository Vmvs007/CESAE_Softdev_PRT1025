package PequenaPizzaria;

import PequenaPizzaria.Enums.*;
import PequenaPizzaria.Ingredientes.*;

public class Main {
    public static void main(String[] args) {

        Base baseFinaItaliana = new Base(900, "Base Fina Italiana", 2, TipoBase.MASSA_FINA, "Clássica e boa");

        Vegetal molhoTomate = new Vegetal(12, "Molho de Tomate", UnidadeMedida.LITROS, 600, OrigemIngrediente.NACIONAL, TipoVegetal.TOMATE);
        Queijo queijoMozzarela = new Queijo(4, "Queijo Mozzarela", UnidadeMedida.GRAMAS, 0.2, OrigemIngrediente.IMPORTADO, TipoQueijo.MOZZARELA);
        Vegetal azeitona = new Vegetal(50, "Azeitona Preta", UnidadeMedida.UNIDADES, 1.5, OrigemIngrediente.NACIONAL, TipoVegetal.AZEITONA);
        Carne pepperoni = new Carne(15, "Pepperoni", UnidadeMedida.UNIDADES, 25, OrigemIngrediente.IMPORTADO, TipoCarne.PEPPERONI);
        Vegetal ananas = new Vegetal(60, "Ananás", UnidadeMedida.UNIDADES, 5, OrigemIngrediente.NACIONAL, TipoVegetal.ANANAS);
        FrutoMar atum = new FrutoMar(100, "Atum", UnidadeMedida.GRAMAS, 2, OrigemIngrediente.IMPORTADO, TipoFrutoMar.ATUM);


        Pizza pizza4EstacoesPequena = new Pizza(500, "4 Estações", "4 cantos diferentes", 10, TamanhoPizza.PEQUENA);
        pizza4EstacoesPequena.adicionarIngredientePizza(baseFinaItaliana, 150);
        pizza4EstacoesPequena.adicionarIngredientePizza(molhoTomate, 0.2);
        pizza4EstacoesPequena.adicionarIngredientePizza(queijoMozzarela, 100);
        pizza4EstacoesPequena.adicionarIngredientePizza(pepperoni, 10);
        pizza4EstacoesPequena.adicionarIngredientePizza(atum, 14);


        Pizza pizzaEspecialChefe = new Pizza(501, "Especial do Chefe", "Nunca sabes o que aí vem", 15, TamanhoPizza.GRANDE);
        pizzaEspecialChefe.adicionarIngredientePizza(baseFinaItaliana, 250);
        pizzaEspecialChefe.adicionarIngredientePizza(molhoTomate, 0.35);
        pizzaEspecialChefe.adicionarIngredientePizza(queijoMozzarela, 200);
        pizzaEspecialChefe.adicionarIngredientePizza(azeitona, 20);
        pizzaEspecialChefe.adicionarIngredientePizza(pepperoni, 16);
        pizzaEspecialChefe.adicionarIngredientePizza(ananas, 14);
        pizzaEspecialChefe.adicionarIngredientePizza(atum, 100);

        pizzaEspecialChefe.removerIngredientePizza(900);
        // ______________________________________________

        pizza4EstacoesPequena.exibirDetalhes();

        pizzaEspecialChefe.exibirDetalhes();

    }
}
