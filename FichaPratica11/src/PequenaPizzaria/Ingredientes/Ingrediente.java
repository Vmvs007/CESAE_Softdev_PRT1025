package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.UnidadeMedida;

public class Ingrediente {
    protected int codigo;
    protected String nome;
    protected UnidadeMedida medida;
    protected double kcal;

    public Ingrediente(int codigo, String nome, UnidadeMedida medida, double kcal) {
        this.codigo = codigo;
        this.nome = nome;
        this.medida = medida;
        this.kcal = kcal;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public UnidadeMedida getMedida() {
        return medida;
    }

    public double getKcal() {
        return kcal;
    }

    public void exibirDetalhes() {
        System.out.print("[ " + this.codigo + " | " + this.nome + " | " + this.kcal + " Kcal ] ");
    }
}
