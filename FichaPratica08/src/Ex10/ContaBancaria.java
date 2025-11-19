package Ex10;

public class ContaBancaria {
    private String iban;
    private String titular;
    private double saldo = 0;

    public ContaBancaria(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
    }

    public void depositar(double montante) {
        this.saldo += montante;
        System.out.println("Depósito na conta " + this.iban + " efetuado com sucesso: " + montante + " €");
    }

    public void levantar(double montante) {

        if (this.saldo >= montante) {
            // Levantamento válido
            this.saldo -= montante;
            System.out.println("Levantamento da conta " + this.iban + " efetuado com sucesso: " + montante + " €");
        }else{
            // Não tem saldo suficiente
            System.out.println("Levantamento da conta " + this.iban + " recusado. Não tem saldo suficiente para levantar: " + montante + " €");
        }
    }

    public void transferencia(ContaBancaria destino, double montante){

        if (this.saldo >= montante) {
            // Transferencia válida
            this.saldo-=montante;
            destino.saldo+=montante;
            System.out.println("Transferência da conta " + this.iban + " para a conta "+destino.iban+" efetuada com sucesso: "+montante+" €");
        }else{
            // Transferencia inválida, não tem saldo suficiente
            System.out.println("Transferência da conta " + this.iban + " para a conta "+destino.iban+" recusada. Saldo insuficiente.");
        }

    }

    public void exibirDetalhes() {
        System.out.println(this.iban + " | " + this.titular + " | Saldo: " + this.saldo + " €");
    }
}
