package Conta;

import Cliente.Cliente;

public class ContaPoupanca implements Conta {
    private int numeroConta;
    private double valorNaConta;
    private Cliente cliente;

    public ContaPoupanca(Cliente cliente, int numeroConta) {
        this.valorNaConta = 0;
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ContaPoupanca [cliente=" + cliente + "]";
    }

    public void exibirValores(){
        System.out.println("\nO numero da sua conta é: " + this.numeroConta + "\n seu nome é: " + this.cliente + "\n e o valor da sua conta é: " + this.valorNaConta);
    }

    public void depositar(double valor) {
        this.valorNaConta += valor;
        System.out.println("Valor adicionado: " + valor + "\nValor da Conta: " + this.valorNaConta);
    }

    public void sacar(double valor) {
        if (getValorNaConta() == 0) {
            System.out.println("Sua conta está vazia!");
        } else {
            this.valorNaConta -= valor;
            System.out.println("Valor adicionado: " + valor + "\nValor da Conta: " + this.valorNaConta);
        }
    }

    public void transferir(double valor, Conta numeroConta) {
        if (getValorNaConta() < valor) {
            System.out.println("Sua conta não tem valor suficiente para a transferência!");
        }

        else {
            this.sacar(valor);
            System.out.println("================ Conta Transferida ================");
            numeroConta.depositar(valor);
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getValorNaConta() {
        return valorNaConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setValorNaConta(double valorNaConta) {
        this.valorNaConta = valorNaConta;
    }

}
