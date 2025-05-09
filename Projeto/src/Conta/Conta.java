package Conta;
public interface Conta {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, Conta numeroConta);
}
