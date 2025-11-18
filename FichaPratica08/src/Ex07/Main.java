package Ex07;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1= new Aluno("Joaquim",25,"quim@mail.pt","Software Developer",15);
        Aluno aluno2 = new Aluno("Fernando",30,"nando@email.pt","Culinária",7.5);

        aluno1.exibirDetalhes();
        aluno2.exibirDetalhes();

        System.out.println("\n\n*****************************************************\n");

        aluno1.felizAniversario();

        aluno1.exibirDetalhes();
        aluno2.exibirDetalhes();

        System.out.println("\n\n*****************************************************\n");

        if(aluno1.situacaoAprovacao()){
            System.out.println(aluno1.getNome()+" está aprovado");
        }else{
            System.out.println(aluno1.getNome()+" está reprovado");
        }


    }
}
