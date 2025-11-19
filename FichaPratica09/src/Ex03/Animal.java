package Ex03;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String[] dieta;
    private ClasseAnimal classe;

    public Animal(String nome, String especie, String paisOrigem, double peso, String[] dieta, ClasseAnimal classe) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.dieta = dieta;
        this.classe = classe;
    }

    public void fazerBarulho() {
        switch (this.classe) {
            case MAMIFERO:
                System.out.println("Tinoninoni");
                break;

            case ANFIBIO:
                System.out.println("Brrrrrrrr");
                break;

            case AVE:
                System.out.println("Kwak Kwak");
                break;

            case PEIXE:
                System.out.println("Blub blub Splash");
                break;

            case REPTIL:
                System.out.println("Pssssss");
                break;

        }
    }

    public void comer(String alimento, double pesoAlimento) {

        boolean gostaComida = false;

        for (int i = 0; i < this.dieta.length; i++) {
            if (this.dieta[i].equals(alimento)) {
                // Gosta da comida
                gostaComida = true;
            }
        }

        if (gostaComida) {
            this.peso += pesoAlimento / 1000;
            System.out.println(this.nome + " " + this.especie + " comeu " + alimento);
            this.fazerBarulho();
        }else{
            System.out.println(this.nome + " " + this.especie + " não gosta de " + alimento+". Recusou-se a comer isso.");
        }

    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.especie + " | " + this.paisOrigem + " | Peso: " + this.peso + " Kg." + " | " + this.classe);
        System.out.print("Dieta: ");

        for (int i = 0; i < this.dieta.length; i++) {
            System.out.print(this.dieta[i] + " - ");
        }
        System.out.println("\n");
    }
}
