package Banco;
import Conta.Conta;

public class Banco {
    private String nome;
    private final int numeroAgenciaBanco;
    private Conta conta;
   
    public Banco(String nome, int agencia, Conta conta) {
        this.nome = nome;
        this.numeroAgenciaBanco = agencia;
        this.conta = conta;
    }

    private void add(String nome, int agencia, Conta conta) {
        new Banco(nome,agencia, conta);
    }

    public void exibirValores(){
        System.out.println("======================\n O nome do seu banco é: " + this.nome + "\n o número da agência é: " + this.numeroAgenciaBanco + "\n e sua conta é: " + this.conta);
    }

	public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nBanco " + nome + " [Numero da Agência:" + numeroAgenciaBanco + "]";
    }



    
}
