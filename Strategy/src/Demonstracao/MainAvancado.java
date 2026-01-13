package Demonstracao;

import Demonstracao.AttackStrategies.MagicAttackStrategy;

public class MainAvancado {
    public static void main(String[] args) {

        Cavaleiro quim = new Cavaleiro("Quim",100,50);

        quim.performAttack();

        quim.setAttackStrategyAtual(new MagicAttackStrategy());

        quim.performAttack();

    }
}
