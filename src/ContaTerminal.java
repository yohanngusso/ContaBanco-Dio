
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da Conta: ");
        int numConta = teclado.nextInt();

        System.out.println("Digite o número da Agência: ");
        String agencia = teclado.next();

        teclado.nextLine();
        System.out.println("Digite seu nome completo: ");
        String nome = teclado.nextLine();

        System.out.println("Digite o saldo: ");
        double saldo = teclado.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                        "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
                nome, agencia, numConta, saldo);

        teclado.close();
    }
}
