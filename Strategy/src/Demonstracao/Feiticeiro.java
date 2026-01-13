package Demonstracao;

import Demonstracao.AttackStrategies.AttackStrategy;
import Demonstracao.AttackStrategies.MagicAttackStrategy;

public class Feiticeiro extends Heroi{

    public Feiticeiro(String nome, int vida, int forca) {
        super(nome, vida, forca, new MagicAttackStrategy());
    }
}
