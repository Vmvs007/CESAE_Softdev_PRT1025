package Demonstracao.AttackStrategies;

public class CarAttackStrategy implements AttackStrategy {

    public CarAttackStrategy() {
    }

    @Override
    public void attack() {
        System.out.println("Deixas o carro desengatado e atropelas alguém");
    }
}
