package Demonstracao;

import Demonstracao.AttackStrategies.AttackStrategy;
import Demonstracao.AttackStrategies.MeleeAttackStrategy;

public class Cavaleiro extends Heroi{
    public Cavaleiro(String nome, int vida, int forca) {
        super(nome, vida, forca, new MeleeAttackStrategy());
    }
}
