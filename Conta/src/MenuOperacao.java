import java.awt.*;
import java.util.Scanner;

public class MenuOperacao {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        Scanner resposta = new Scanner(System.in);

        int escolhaMenu = 0;
        double valorAReceber = 0;
        double valorATransferir = 0;

        String menu = ("""
                    
                    Execute uma operação:
                                        
                    1- Consultar Saldor
                    2- Receber Valor
                    3- Transferir valor
                    4- Sair
                    
                    """);

        while (escolhaMenu != 4) {
            System.out.println(menu);
            escolhaMenu = resposta.nextInt();

            if (escolhaMenu == 1) {
                System.out.println("Seu saldo é de R$" + conta.getSaldoInicial());

            } else if (escolhaMenu == 2) {
                System.out.println("Digite o valor a receber: ");
                valorAReceber = resposta.nextDouble();
                conta.receberValor(valorAReceber);
                
            } else if (escolhaMenu == 3) {
                System.out.println("Digite o valor a ser transferido:");
                valorATransferir = resposta.nextDouble();
                conta.transfereValor(valorATransferir);
            } else if (escolhaMenu == 4) {
                System.out.println("Obrigado Por utilizar nossos serviços!");
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
