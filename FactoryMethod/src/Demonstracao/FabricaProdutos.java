package Demonstracao;

import java.util.HashMap;

public class FabricaProdutos {

    public static Produto criarProduto(int tipoProduto, HashMap<String,String> atributos) {
        switch (tipoProduto) {
            case 1: // Roupa
                return new Roupa(atributos.get("nome"), Double.parseDouble(atributos.get("preco")), Double.parseDouble(atributos.get("peso")));

            case 2: // Eletronico
                return new Eletronico(atributos.get("nome"), Double.parseDouble(atributos.get("preco")), Double.parseDouble(atributos.get("peso")), Boolean.parseBoolean(atributos.get("garantia")));

            case 3: // Comida
                return new Comida(atributos.get("nome"), Double.parseDouble(atributos.get("preco")), Double.parseDouble(atributos.get("peso")), Integer.parseInt(atributos.get("validade")));

            case 4: // Ferramenta
                return new Ferramenta(atributos.get("nome"), Double.parseDouble(atributos.get("preco")), Double.parseDouble(atributos.get("peso")));

            case 5: // Brinquedo
                return new Brinquedo(atributos.get("nome"), Double.parseDouble(atributos.get("preco")), Double.parseDouble(atributos.get("peso")));


            default:
                throw new IllegalArgumentException("Tipo de Produto não reconhecido: " + tipoProduto);
        }
    }

}
