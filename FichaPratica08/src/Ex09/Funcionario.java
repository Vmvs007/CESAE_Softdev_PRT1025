package Ex09;

public class Funcionario {

    private String nome;
    private String email;
    private String departamento;
    private double salario;

    public Funcionario(String nome, String email, String departamento, double salario) {
        this.nome = nome;
        this.email = email;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double aumentoPercentagem) {
        this.salario *= 1 + aumentoPercentagem / 100;
    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.email);
        System.out.println(this.departamento + " | Salário: " + this.salario + " €");
    }
}
