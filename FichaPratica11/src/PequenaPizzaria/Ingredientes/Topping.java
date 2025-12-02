package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemIngrediente;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Topping extends Ingrediente{

    protected OrigemIngrediente origem;

    public Topping(int codigo, String nome, UnidadeMedida medida, double kcal, OrigemIngrediente origem) {
        super(codigo, nome, medida, kcal);
        this.origem = origem;
    }

    public OrigemIngrediente getOrigem() {
        return origem;
    }
}
