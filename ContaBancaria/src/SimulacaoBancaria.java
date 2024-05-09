import java.util.Scanner;


public class SimulacaoBancaria {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0; 

          // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 

          int opcao = scanner.nextInt(); 
          switch(opcao) {
            case 1:
              // System.out.println("Informe o valor a ser depositado: ");
              double valorDepositado = scanner.nextDouble();
              saldo += valorDepositado;
              System.out.println("Saldo atual: " + saldo);
              break;
              case 2: 
                // System.out.println("Informe o valor a ser sacado: ");
                double saque = scanner.nextDouble();
                if (saque < saldo) {
                  saldo = saldo - saque;
                  System.out.println("Saldo atual: " + saldo);
                } else {
                  System.out.println("Saldo insuficiente.");
                }
                break;
                case 3: 
                  System.out.println("Saldo atual: " + saldo);
                  break;
                case 0:
                  System.out.println("Programa encerrado.");
                  return;
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida: 
                default:
                  System.out.println("Opção inválida. Tente novamente.");

          }
          
        }

    }
    
}