package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemIngrediente;
import PequenaPizzaria.Enums.TipoQueijo;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Queijo extends Topping{

    private TipoQueijo tipoQueijo;

    public Queijo(int codigo, String nome, UnidadeMedida medida, double kcal, OrigemIngrediente origem, TipoQueijo tipoQueijo) {
        super(codigo, nome, medida, kcal, origem);
        this.tipoQueijo = tipoQueijo;
    }

    public TipoQueijo getTipoQueijo() {
        return tipoQueijo;
    }
}
