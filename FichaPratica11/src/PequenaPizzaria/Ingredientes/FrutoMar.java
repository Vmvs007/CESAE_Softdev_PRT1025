package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemIngrediente;
import PequenaPizzaria.Enums.TipoFrutoMar;
import PequenaPizzaria.Enums.UnidadeMedida;

public class FrutoMar extends Topping{
    private TipoFrutoMar tipoFrutoMar;

    public FrutoMar(int codigo, String nome, UnidadeMedida medida, double kcal, OrigemIngrediente origem, TipoFrutoMar tipoFrutoMar) {
        super(codigo, nome, medida, kcal, origem);
        this.tipoFrutoMar = tipoFrutoMar;
    }

    public TipoFrutoMar getTipoFrutoMar() {
        return tipoFrutoMar;
    }
}
