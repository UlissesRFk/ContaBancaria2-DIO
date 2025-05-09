import Banco.Banco;
import Cliente.Cliente;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;

public class App {
    public static void main(String[] args){
        Cliente coao = new Cliente();
        coao.setNome("João");

        ContaCorrente conta2 = new ContaCorrente(coao, 200);
        conta2.exibirValores();
        ContaPoupanca conta1 = new ContaPoupanca(coao, 200);
        conta1.exibirValores();

        Banco interado = new Banco("Inter", 10, conta2);
        interado.exibirValores();

    }
}
