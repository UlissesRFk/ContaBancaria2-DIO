import java.util.Scanner;

import Banco.Banco;
import Cliente.Cliente;
import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;

public class App {
    public static void main(String[] args) {

        // Para o "transferencia" na conta corrente
        Cliente clienteTransferencia = new Cliente();
        clienteTransferencia.setNome("Jonas");
        Conta contaCorrenteTransferencia = new ContaCorrente(clienteTransferencia, 100);
        // Para o "transferencia" na conta poupança
        Cliente clienteTransferencia2 = new Cliente();
        clienteTransferencia2.setNome("Maria");
        Conta contaCorrentePoupança = new ContaPoupanca(clienteTransferencia2, 200);

        // Passando o nome do cliente
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite seu nome: ");
        String nome = scanner.nextLine();
        cliente.setNome(nome);

        // escolhendo o tipo da conta
        System.out.println("Digite 1 para conta corrente e 2 para conta poupança");
        int conta = scanner.nextInt();
        scanner.nextLine();
        String nomeBanco;
        switch (conta) {
            case 1:
                ContaCorrente contaCorrente = new ContaCorrente(cliente, 10);
                // Escolhendo o banco que quer criar a conta
                System.out.println("Qual o banco você escolhe?");
                System.out.println("Inter");
                System.out.println("Nubank");
                System.out.println("C6 Bank");
                System.out.println("Sair");
                nomeBanco = scanner.nextLine();
                Banco banco1 = new Banco(nomeBanco, 30, contaCorrente);
                String operacao;

                // Escolhando a operação que a conta irá realizar
                do{
                System.out.println("Qual operação você deseja fazer agora?");
                System.out.println("Sacar | Depositar | Transferir | Cheque | Sair?");
                operacao = scanner.nextLine();
                if (operacao.equalsIgnoreCase("Sacar")) {
                    System.out.println("Quanto você quer sacar?");
                    double valorSacado = scanner.nextDouble();
                    scanner.nextLine();
                    contaCorrente.sacar(valorSacado);
                    contaCorrente.exibirValores();
                } else if (operacao.equalsIgnoreCase("Depositar")) {
                    System.out.println("Quanto você quer Depositar?");
                    double valordepositado = scanner.nextDouble();
                    scanner.nextLine();
                    contaCorrente.depositar(valordepositado);
                    contaCorrente.exibirValores();
                } else if (operacao.equalsIgnoreCase("Cheque")) {
                    contaCorrente.pedirChequeEspecial();
                    contaCorrente.exibirValores();
                } else if (operacao.equalsIgnoreCase("Transferir")) {
                    // O unico que tera que ser feito manualmente é a Transferência, pois não possui
                    // scanner que passe objeto(classe) como parametro;
                    contaCorrente.transferir(200.00, contaCorrenteTransferencia);
                    contaCorrente.exibirValores();
                } 
            }while(!operacao.equalsIgnoreCase("Sair"));
               
                System.out.println("Finalizado com sucesso!");
                break; 
            
            case 2:
                ContaPoupanca contaPoupança = new ContaPoupanca(cliente, 10);
                System.out.println("Qual o banco você escolhe?");
                System.out.println("Inter");
                System.out.println("Nubank");
                System.out.println("C6 Bank");
                System.out.println("Sair");
                nomeBanco = scanner.nextLine();
                String operacao2;
                do{
                Banco banco2 = new Banco(nomeBanco, 30, contaPoupança);
                System.out.println("Qual operação você deseja fazer agora?");
                System.out.println("Sacar | Depositar | Transferir ou Sair ");
                operacao2 = scanner.nextLine();
                if (operacao2.equalsIgnoreCase("Sacar")) {
                    System.out.println("Quanto você quer sacar?");
                    double valorSacado = scanner.nextDouble();
                    scanner.nextLine();
                    contaPoupança.sacar(valorSacado);
                    contaPoupança.exibirValores();
                } else if (operacao2.equalsIgnoreCase("Depositar")) {
                    System.out.println("Quanto você quer Depositar?");
                    double valordepositado = scanner.nextDouble();
                    scanner.nextLine();
                    contaPoupança.depositar(valordepositado);
                    contaPoupança.exibirValores();
                } else if (operacao2.equalsIgnoreCase("Transferir")) {
                    // O unico que tera que ser feito manualmente é a Transferência, pois não possui
                    // scanner que passe objeto(classe) como parametro;
                    contaPoupança.transferir(100.00, contaCorrentePoupança);
                    contaPoupança.exibirValores();
                }
            }while(!operacao2.equalsIgnoreCase("Sair"));

                System.out.println("Finalizado com sucesso!");
                break;
        }
    }
}
