import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Declarando as variáveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Criando o scanner e configurando o locale para US
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitar e capturar as entradas do usuário
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();  // Captura a agência (String)

        System.out.println("Por favor, digite o número da Conta!");
        while (!scanner.hasNextInt()) {  // Verifica se o próximo valor é um inteiro
            System.out.println("Por favor, digite um número válido para a Conta!");
            scanner.next();  // Descarta a entrada inválida
        }
        numeroConta = scanner.nextInt();  // Captura o número da conta (int)
        scanner.nextLine();  // Corrige a quebra de linha após o nextInt()

        System.out.println("Por favor, digite o seu Nome!");
        nomeCliente = scanner.nextLine();  // Captura o nome do cliente (String)

        System.out.println("Por favor, digite o seu Saldo!");
        while (!scanner.hasNextDouble()) {  // Verifica se o próximo valor é um double
            System.out.println("Por favor, digite um número válido para o Saldo!");
            scanner.next();  // Descarta a entrada inválida
        }
        saldo = scanner.nextDouble();  // Captura o saldo (double)

        // Formatar o saldo para exibição com ponto (.)
        String saldoFormatado = String.format("%.2f", saldo);

        // Exibir a mensagem com as informações capturadas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia + ", conta " + numeroConta + " e seu saldo " + saldoFormatado + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
