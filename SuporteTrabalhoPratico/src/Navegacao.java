import java.util.Random;
import java.util.Scanner;

public class Navegacao {


    public static int inicio_01() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nBem-vindo à Aventura Espetacular");
        System.out.println("Escolheste o teu nome, a tua vida e a tua força, agora tens de comprar coisas");
        System.out.println("...");
        System.out.println("Compraste coisas, agora tens de ir para algum sitio");

        System.out.println("\n[1] Floresta Mágica");
        System.out.println("[2] Pântano Sujo");

        System.out.print("Escolhe: ");
        int escolhaCaminho = input.nextInt();

        if (escolhaCaminho == 1) {
            return 2;
        } else if (escolhaCaminho == 2) {
            return 3;
        }

        return -1;
    }

    public static int florestaMagica_02() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nBem-vindo/a à Floresta Mágica");
        System.out.println("Tropeçaste e esmurraste o joelho");

        System.out.println("Agora tens de ir para outro sitio");

        System.out.println("\n[1] Pântano Sujo");
        System.out.println("[2] Estreito da Montanha");

        System.out.print("Escolhe: ");
        int escolhaCaminho = input.nextInt();

        if (escolhaCaminho == 1) {
            return 3;
        } else if (escolhaCaminho == 2) {
            return 5;
        }

        return -1;
    }

    public static int pantanoSujo_03() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nBem-vindo/a ao Pântano Sujo");
        System.out.println("Molhaste as meias e os sapatos");

        System.out.println("Agora tens de ir para outro sitio");

        System.out.println("\n[1] Floresta Mágica");
        System.out.println("[2] Montanha Alta");
        System.out.println("[3] Estreito da Montanha");

        System.out.print("Escolhe: ");
        int escolhaCaminho = input.nextInt();

        if (escolhaCaminho == 1) {
            return 6;
        } else if (escolhaCaminho == 2) {
            return 4;
        } else if (escolhaCaminho == 3) {
            return 5;
        }

        return -1;
    }

    public static int montanhaAlta_04() {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo/a à Montanha Alta");
        System.out.println("Afinal isto não dá para lado nenhum");

        System.out.println("Agora tens de ir para outro sitio");

        System.out.println("\n[1] Pântano Sujo");
        System.out.println("[2] Estreito da Montanha");

        System.out.print("Escolhe: ");
        int escolhaCaminho = input.nextInt();

        if (escolhaCaminho == 1) {
            return 3;
        } else if (escolhaCaminho == 2) {
            return 5;
        }

        return -1;

    }

    public static int estreitoMontanha_05() {
        Scanner input = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("\nBem-vindo/a ao Estreito da Montanha");

        int escolhaAleatoria = rd.nextInt(3);

        switch (escolhaAleatoria) {
            case 0:
                System.out.println("Estás a chegar ao fim da aventura");
                System.out.println("Agora vais avançar para o final");
                return 0;

            case 1:
                System.out.println("Escorregaste e perdeste o jogo...");
                return 0;


            case 2:
                System.out.println("Veio uma avalanche e levou-te de volta para a Floresta Mágica");
                return 6;

        }

        return -1;

    }

    public static int florestaMagica_06() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nBem-vindo/a à Floresta Mágica");
        System.out.println("Ias tropeçar, mas como já conhecias o caminho, já estavas a contar");

        System.out.println("Agora tens de ir para outro sitio");

        System.out.println("\n[1] Pântano Sujo");
        System.out.println("[2] Estreito da Montanha");

        System.out.print("Escolhe: ");
        int escolhaCaminho = input.nextInt();

        if (escolhaCaminho == 1) {
            return 3;
        } else if (escolhaCaminho == 2) {
            return 5;
        }

        return -1;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao = 1, escolhaCaminho;


        do {

            switch (opcao) {
                case 1: // Início
                    opcao = inicio_01();
                    break;

                case 2: // Floresta Mágica
                    opcao = florestaMagica_02();
                    break;

                case 3: // Pântano Sujo
                    opcao = pantanoSujo_03();
                    break;

                case 4: // Montanha Alta
                    opcao = montanhaAlta_04();
                    break;

                case 5: // Estreito da Montanha
                    opcao = estreitoMontanha_05();
                    break;

                case 6: // Floresta Mágica
                    opcao = florestaMagica_06();
                    break;

            }

        } while (opcao != 0);

        System.out.println("\nACABASTE O JOGO!!!");
        System.out.println("FIM");
    }
}
