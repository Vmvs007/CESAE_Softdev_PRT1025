package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.TipoBase;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Base extends Ingrediente{
    private TipoBase tipo;
    private String descricao;

    public Base(int codigo, String nome, double kcal, TipoBase tipo, String descricao) {
        super(codigo, nome, UnidadeMedida.GRAMAS, kcal);
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public TipoBase getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }
}
