package Ex06;

public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Cristiano Ronaldo","Futebol",1.80,75,"Portugal",1);
        Atleta atleta2 = new Atleta("Usain Bolt","Atletismo",1.95,80,"Jamaica",1);
        Atleta atleta3 = new Atleta("Rui Costa","Ciclismo",1.7,60,"Portugal",10);
        Atleta atleta4 = new Atleta("Mike Tyson","Boxe",1.75,90,"USA",2);
        Atleta atleta5 = new Atleta("Lebron James","Basket",2.5,120,"USA",3);

        Competicao cortaMatoFreixoEspadaCinta = new Competicao("Corta-Mato Freixo de Espada à Cinta","Portugal",10);
        cortaMatoFreixoEspadaCinta.inscreverAtleta(atleta1);
        cortaMatoFreixoEspadaCinta.inscreverAtleta(atleta4);
        cortaMatoFreixoEspadaCinta.inscreverAtleta(atleta5);

        cortaMatoFreixoEspadaCinta.atletasDaCasa();

    }
}
