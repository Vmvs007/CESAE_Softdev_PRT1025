package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemIngrediente;
import PequenaPizzaria.Enums.TipoVegetal;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Vegetal extends Topping{
    private TipoVegetal tipoVegetal;

    public Vegetal(int codigo, String nome, UnidadeMedida medida, double kcal, OrigemIngrediente origem, TipoVegetal tipoVegetal) {
        super(codigo, nome, medida, kcal, origem);
        this.tipoVegetal = tipoVegetal;
    }

    public TipoVegetal getTipoVegetal() {
        return tipoVegetal;
    }
}
