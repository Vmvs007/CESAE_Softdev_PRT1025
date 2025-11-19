package Ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira a marca: ");
        String marcaUser = input.next();

        System.out.print("Insira o modelo: ");
        String modeloUser = input.next();

        System.out.print("Insira a cor: ");
        String corUser = input.next();

        System.out.print("Insira a potência (CV): ");
        int potenciaCVUser = input.nextInt();

        Carro carro1 = new Carro(marcaUser,modeloUser,corUser,2020,potenciaCVUser,2000,TipoCombustivel.DIESEL,10);
        Carro carro2 = new Carro("BMW", "116d", "Preto", 2010, 110, 1500, TipoCombustivel.DIESEL, 7);
        Carro carro3 = new Carro("Ferrari", "SF90", "Vermelho", 2021, 900, 5000, TipoCombustivel.GASOLINA, 20);
        Carro carro4 = new Carro("Papa", "Reformas", "Amarelo", 1998, 900, 900, TipoCombustivel.GPL, 5);

        Carro vencedor1 = carro1.corrida(carro2);
        System.out.print("Vencedor corrida 1: ");
        vencedor1.exibirDetalhes();

        Carro vencedor2 = carro3.corrida(carro4);
        System.out.print("Vencedor corrida 2: ");
        vencedor2.exibirDetalhes();

        Carro vencedorTotal = vencedor1.corrida(vencedor2);
        System.out.print("\nVencedor corrida final: ");
        vencedorTotal.exibirDetalhes();
    }
}
