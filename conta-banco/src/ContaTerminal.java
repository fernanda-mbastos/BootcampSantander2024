import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {

  public static void main(String[] args) {
    // criando o obejto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da Conta: ");
    int conta = scanner.nextInt();

    System.out.println("Por favor, digite o número da Agência: ");
    String agencia = scanner.next();

    System.out.println("Por favor, digite o nome do cliente: ");
    String nome = scanner.next();

    System.out.println("Por favor, digite saldo: ");
    double saldo = scanner.nextDouble();


    // imprimindo os dados
    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua conta é " + conta + " , Agência: " + agencia + " e seu saldo " + saldo + " já está disponível para saque");
    }
  
}
