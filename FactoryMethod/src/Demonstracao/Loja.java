package Demonstracao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Loja {
    private String nome;
    private ArrayList<Produto> inventario;

    public Loja(String nome) {
        this.nome = nome;
        this.inventario = new ArrayList<Produto>();
    }

    public String getNome() {
        return nome;
    }

    public void acrescentarProduto() {
        Scanner input = new Scanner(System.in);

        HashMap<String, String> atributosMapa = new HashMap<>();

        System.out.println("Tipo de Produto");
        System.out.println("1. Roupa");
        System.out.println("2. Eletronico");
        System.out.println("3. Comida");
        System.out.println("4. Ferramenta");
        System.out.println("5. Brinquedo");
        System.out.print("Escolha: ");
        int tipoProduto = input.nextInt();

        System.out.println("Nome: ");
        String nomeProduto = input.next();
        atributosMapa.put("nome", nomeProduto);

        System.out.println("Preço (€): ");
        Double precoProduto = input.nextDouble();
        atributosMapa.put("preco", precoProduto.toString());

        System.out.println("Peso (Kg.): ");
        Double pesoProduto = input.nextDouble();
        atributosMapa.put("peso", pesoProduto.toString());

        if (tipoProduto == 2) {
            System.out.print("Garantia (s/n): ");
            String garantiaProduto = input.next();
            if (garantiaProduto.equals("s")) {
                atributosMapa.put("garantia", "true");
            } else {
                atributosMapa.put("garantia", "false");
            }
        }

        if (tipoProduto == 3) {
            System.out.print("Ano validade: ");
            Integer validadeProduto = input.nextInt();
            atributosMapa.put("validade", validadeProduto.toString());
        }

        this.inventario.add(FabricaProdutos.criarProduto(tipoProduto, atributosMapa));

    }

    public void listarProdutos() {
        for (Produto produtoAtual : this.inventario) {
            produtoAtual.exibirDetalhes();
        }
    }
}
