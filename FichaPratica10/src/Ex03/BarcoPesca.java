package Ex03;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private Marca marcaBarco;
    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscoPescado;

    /**
     * Método construtor para <b>Barco</b>
     *
     * @param nome            Nome do Barco
     * @param cor             Cor
     * @param anoFabrico      Ano de Fabrico
     * @param tripulacao      Quantidade de pessoas na tripulação (exluindo o capitão)
     * @param capacidadeCarga Capacidade da Carga (Kg.)
     * @param marcaBarco      Marca do Barco
     */
    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCarga, Marca marcaBarco) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marcaBarco = marcaBarco;
        this.peixesPescados = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
    }

    /**
     * Método que calcula a carga atual (Kg.)
     *
     * @return Peso da carga atual (Kg.)
     */
    public double calcularCargaTotal() {

        double cargaTotal = 0;

        for (Peixe peixeAtual : this.peixesPescados) {
            cargaTotal += peixeAtual.getPeso();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            cargaTotal += mariscoAtual.getPeso();
        }

        return cargaTotal;
    }

    /**
     * Método para pescar <b>Peixe</b>, avalia se temos capacidade de carga suficiente
     *
     * @param peixeNovo <b>Peixe</b> a ser pescado
     */
    public void pescarPeixe(Peixe peixeNovo) {

        if (this.calcularCargaTotal() + peixeNovo.getPeso() <= this.capacidadeCarga) {
            this.peixesPescados.add(peixeNovo);
            System.out.println("Peixe pescado com sucesso: " + peixeNovo.getPeso() + " Kg. de " + peixeNovo.getEspecie());
        } else {
            System.out.println(peixeNovo.getPeso() + " Kg. de " + peixeNovo.getEspecie() + " excedem a capacidade de carga.");
        }

    }

    /**
     * Método para pescar <b>Marisco</b>, avalia se temos capacidade de carga suficiente
     *
     * @param mariscoNovo <b>Peixe</b> a ser pescado
     */
    public void pescarMarisco(Marisco mariscoNovo) {

        if (this.calcularCargaTotal() + mariscoNovo.getPeso() <= this.capacidadeCarga) {
            this.mariscoPescado.add(mariscoNovo);
            System.out.println("Marisco pescado com sucesso: " + mariscoNovo.getPeso() + " Kg. de " + mariscoNovo.getEspecie());
        } else {
            System.out.println(mariscoNovo.getPeso() + " Kg. de " + mariscoNovo.getEspecie() + " excedem a capacidade de carga.");
        }

    }

    /**
     * Método para largar <b>Peixe</b> de forma a desimpedir espaço de carga
     *
     * @param peixeRemovido <b>Peixe</b> que vai ser largado
     */
    public void largarPeixe(Peixe peixeRemovido) {
        System.out.println(peixeRemovido.getEspecie() + " largada.");
        this.peixesPescados.remove(peixeRemovido);
    }

    /**
     * Método para largar <b>Peixe</b> de forma a desimpedir espaço de carga
     *
     * @param mariscoRemovido <b>Peixe</b> que vai ser largado
     */
    public void largarMarisco(Marisco mariscoRemovido) {
        System.out.println(mariscoRemovido.getEspecie() + " largada.");
        this.mariscoPescado.remove(mariscoRemovido);
    }

    /**
     * Método para calcular o valor total da carga (€)
     * @return Valor Total da Carga (€)
     */
    public double valorTotalCarga() {
        double valorTotal = 0;

        for (Peixe peixeAtual : this.peixesPescados) {
            valorTotal += peixeAtual.getPeso() * peixeAtual.getPrecoKg();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            valorTotal += mariscoAtual.getPeso() * mariscoAtual.getPrecoKg();
        }

        return valorTotal;
    }

    /**
     * Método para exibir os detalhes do <b>Barco de Pesca</b>
     */
    public void exibirDetalhes() {
        System.out.println("\n" + this.nome + " | Ano: " + this.anoFabrico + " | " + this.marcaBarco + " | " + this.cor + " | Capacidade Carga Total: ");
        System.out.println("Capacidade de Carga Atual: " + this.calcularCargaTotal() + "/" + this.capacidadeCarga + " Kg.");

    }


}
