
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO inserir informações bancarias
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco DIO! Para iniciar, insira as informações abaixo:");

        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o número da agência: ");
        String numeroAgencia = sc.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.next();
        
        System.out.println("Digite o saldo da conta: ");
        double saldoConta = sc.nextDouble();
        NumberFormat formatoBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String saldoFormatado = formatoBR.format(saldoConta);
        
        sc.nextLine(); // Consumir a quebra de linha pendente após o nextInt()

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua conta " + numeroConta + " na agência " + numeroAgencia + " já está ativa e seu saldo de " + saldoFormatado + " já está disponível para saque.");

        sc.close();

    }

}
