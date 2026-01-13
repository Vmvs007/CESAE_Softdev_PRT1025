package Demonstracao;

import Demonstracao.AttackStrategies.CarAttackStrategy;
import Demonstracao.AttackStrategies.MeleeAttackStrategy;
import Demonstracao.AttackStrategies.RangedAttackStrategy;

public class MainBasico {
    public static void main(String[] args) {

        Heroi quim = new Heroi("Quim",100,30,new RangedAttackStrategy());

        quim.performAttack();

        quim.setAttackStrategyAtual(new MeleeAttackStrategy());

        quim.performAttack();
        quim.performAttack();

        quim.setAttackStrategyAtual(new CarAttackStrategy());

        quim.performAttack();

    }
}
