package Conta;

import java.util.Scanner;

import Cliente.Cliente;

public class ContaCorrente implements Conta {
    private int numeroConta;
    private double valorNaConta;
    private Cliente cliente;

    public ContaCorrente(Cliente cliente, int numeroConta) {
        this.valorNaConta = 0;
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta Corrente [cliente=" + cliente + "]";
    }

    public void exibirValores(){
        System.out.println("\n ========================= " + "\nO numero da sua conta é: " + this.numeroConta + "\n seu nome é: " + this.cliente + "\n e o valor da sua conta é: " + this.valorNaConta);
    }

    public void depositar(double valor) {
        double novoValor = getValorNaConta() + valor;
        System.out.println("Valor adicionado: " + valor + "\nValor da Conta: " + novoValor);
    }

    public void sacar(double valor) {
        if (getValorNaConta() == 0) {
            System.out.println("Sua conta está vazia!");
        } else {
            double novoValor = getValorNaConta() - valor;
            System.out.println("Valor adicionado: " + valor + "\nValor da Conta: " + novoValor);
        }
    }

    public void transferir(double valor, Conta numeroConta) {
        if (getValorNaConta() < valor) {
            System.out.println("Sua conta não tem valor suficiente para a transferência!");
        }

        else {
            this.sacar(valor);
            numeroConta.depositar(valor);
        }
    }

    public void pedirChequeEspecial() {
        Scanner opicao = new Scanner(System.in);
        double valorAdicionado;
        if (getValorNaConta() == 0)
            System.out.println("Sua conta esta zerada, poranto, não é possível fazer o cheque");
        else {
            if (getValorNaConta() > 1000) {
                valorAdicionado = 500;
                System.out.println("Você pode fazer um chque de 500 reais!");
                System.out.println("Deseja fazer?");
                String SimNao = opicao.nextLine();
                switch (SimNao) {
                    case "Sim":
                        double novoValor = getValorNaConta() + valorAdicionado;
                        System.out.println("O saldo da sua conta agora é: " + novoValor
                                + "\nFoi adicionado um valor de cheque de: " + valorAdicionado);
                        break;

                    case "Não":
                        break;
                }
            } else if (getValorNaConta() <= 1000 && getValorNaConta() >= 100) {
                valorAdicionado = 200;
                System.out.println("Você pode fazer um chque de 500 reais!");
                System.out.println("Deseja fazer?");
                String SimNao = opicao.nextLine();
                switch (SimNao) {
                    case "Sim":
                        double novoValor = getValorNaConta() + valorAdicionado;
                        System.out.println("O saldo da sua conta agora é: " + novoValor
                                + "\nFoi adicionado um valor de cheque de: " + valorAdicionado);
                        break;
                    case "Não":
                        break;
                }
            } else {
                valorAdicionado = 1000;
                System.out.println("Você pode fazer um chque de 1000 reais!");
                System.out.println("Deseja fazer?");
                String SimNao = opicao.nextLine();
                switch (SimNao) {
                    case "Sim":
                        double novoValor = getValorNaConta() + valorAdicionado;
                        System.out.println("O saldo da sua conta agora é: " + novoValor
                                + "\nFoi adicionado um valor de cheque de: " + valorAdicionado);
                        break;
                    case "Não":
                        break;
                }
            }
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getValorNaConta() {
        return valorNaConta;
    }

    public void setValorNaConta(double valorNaConta) {
        this.valorNaConta = valorNaConta;
    }

}
