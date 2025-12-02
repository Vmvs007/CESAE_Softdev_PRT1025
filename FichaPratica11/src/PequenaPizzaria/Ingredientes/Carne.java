package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemIngrediente;
import PequenaPizzaria.Enums.TipoCarne;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Carne extends Topping{

    private TipoCarne tipoCarne;

    public Carne(int codigo, String nome, UnidadeMedida medida, double kcal, OrigemIngrediente origem, TipoCarne tipoCarne) {
        super(codigo, nome, medida, kcal, origem);
        this.tipoCarne = tipoCarne;
    }
}
