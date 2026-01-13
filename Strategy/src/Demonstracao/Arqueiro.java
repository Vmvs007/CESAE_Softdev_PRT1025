package Demonstracao;

import Demonstracao.AttackStrategies.AttackStrategy;
import Demonstracao.AttackStrategies.MeleeAttackStrategy;

public class Arqueiro extends Heroi{

    public Arqueiro(String nome, int vida, int forca) {
        super(nome, vida, forca, new MeleeAttackStrategy());
    }
}
