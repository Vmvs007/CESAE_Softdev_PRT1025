package PequenaPizzaria;

import PequenaPizzaria.Enums.TamanhoPizza;
import PequenaPizzaria.Ingredientes.*;

import java.util.ArrayList;

public class Pizza {
    private final int MAX_INGREDIENTES = 5;
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;
    private ArrayList<IngredientePizza> listaIngredientesPizza;

    public Pizza(int codigo, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.listaIngredientesPizza = new ArrayList<IngredientePizza>();
    }

//    public void adicionarIngredientePizza(IngredientePizza ingredientePizzaNovo) {
//        this.listaIngredientesPizza.add(ingredientePizzaNovo);
//    }

    public void adicionarIngredientePizza(Ingrediente ingredienteNovo, double quantidade) {

        if (this.listaIngredientesPizza.size() < this.MAX_INGREDIENTES) {

            if (this.listaIngredientesPizza.isEmpty() && ingredienteNovo instanceof Base) {
                // Se a lista está vazia e o ingredienteNovo é uma Base
                IngredientePizza ingredientePizzaNovo = new IngredientePizza(ingredienteNovo, quantidade);
                this.listaIngredientesPizza.add(ingredientePizzaNovo);
            }

            if (!this.listaIngredientesPizza.isEmpty() && ingredienteNovo instanceof Topping) {
                // Se a lista não está vazia (já tem Base) e estamos a tentar adicionar um Topping
                IngredientePizza ingredientePizzaNovo = new IngredientePizza(ingredienteNovo, quantidade);
                this.listaIngredientesPizza.add(ingredientePizzaNovo);
            }

        }

    }

    public void removerIngredientePizza(int codigoRemovido) {

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientesPizza) {
            if (ingredientePizzaAtual.getIngrediente().getCodigo() == codigoRemovido) {
                if (!(ingredientePizzaAtual.getIngrediente() instanceof Base)) {
                    this.listaIngredientesPizza.remove(ingredientePizzaAtual);
                    return;
                }

            }
        }
    }

    public void editarQuantidadeIngredientePizza(int codigoEditado, double quantidadeNova) {
        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientesPizza) {
            if (ingredientePizzaAtual.getIngrediente().getCodigo() == codigoEditado) {
                ingredientePizzaAtual.setQuantidade(quantidadeNova);
                return;
            }
        }
    }

    public double kcalTotais() {
        double kcalTotais = 0;

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientesPizza) {
            kcalTotais += ingredientePizzaAtual.getQuantidade() * ingredientePizzaAtual.getIngrediente().getKcal();
        }

        return kcalTotais;
    }

    public String tipoPizza() {
        int contadorQueijo = 0, contadorCarne = 0, contadorVegetais = 0, contadorFrutosMar = 0;

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientesPizza) {
            if (ingredientePizzaAtual.getIngrediente() instanceof Queijo) {
                contadorQueijo++;
            }

            if (ingredientePizzaAtual.getIngrediente() instanceof Carne) {
                contadorCarne++;
            }

            if (ingredientePizzaAtual.getIngrediente() instanceof Vegetal) {
                contadorVegetais++;
            }

            if (ingredientePizzaAtual.getIngrediente() instanceof FrutoMar) {
                contadorFrutosMar++;
            }
        }

        if (contadorQueijo > 0 && contadorCarne == 0 && contadorVegetais == 0 && contadorFrutosMar == 0) {
            return "Pizza de Queijo";
        } else if (contadorQueijo == 0 && contadorCarne > 0 && contadorVegetais == 0 && contadorFrutosMar == 0) {
            return "Pizza de Carne";
        } else if (contadorQueijo == 0 && contadorCarne == 0 && contadorVegetais > 0 && contadorFrutosMar == 0) {
            return "Pizza Vegetariana";
        } else if (contadorQueijo == 0 && contadorCarne == 0 && contadorVegetais == 0 && contadorFrutosMar > 0) {
            return "Pizza do Mar";
        } else if (contadorQueijo > 0 && contadorCarne > 0 && contadorVegetais > 0 && contadorFrutosMar > 0) {
            return "Pizza Completa";
        } else {
            return "Pizza Mista";
        }

    }

    public void exibirDetalhes() {
        System.out.println("\n***** " + this.nome + " *****");
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco + " €");
        System.out.println("Tamanho: " + this.tamanho);
        int x = 1;

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientesPizza) {
            System.out.print("Ingrediente " + x++ + ": ");
            ingredientePizzaAtual.exibirDetalhes();
        }
        System.out.println("Kcal Totais: " + this.kcalTotais());
        System.out.println("Tipo de Pizza: " + this.tipoPizza());
    }
}
