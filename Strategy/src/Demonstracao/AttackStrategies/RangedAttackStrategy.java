package Demonstracao.AttackStrategies;

public class RangedAttackStrategy implements AttackStrategy{

    public RangedAttackStrategy() {
    }

    @Override
    public void attack() {
        System.out.println("Atira uma pedra de longe e foge");
    }
}
