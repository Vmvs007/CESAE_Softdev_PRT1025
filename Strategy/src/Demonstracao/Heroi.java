package Demonstracao;

import Demonstracao.AttackStrategies.AttackStrategy;

public class Heroi {

    private String nome;
    private int vida;
    private int forca;

    private AttackStrategy attackStrategyAtual;

    public Heroi(String nome, int vida, int forca, AttackStrategy attackStrategyAtual) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.attackStrategyAtual = attackStrategyAtual;
    }

    public void performAttack(){
        this.attackStrategyAtual.attack();
    }

    public void setAttackStrategyAtual(AttackStrategy attackStrategyNova) {
        this.attackStrategyAtual = attackStrategyNova;
    }
}
