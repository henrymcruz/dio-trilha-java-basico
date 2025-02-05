import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Declarando as variáveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Criando o scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitar e capturar as entradas do usuário
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();  // Captura a agência (String)

        System.out.println("Por favor, digite o número da Conta!");
        numeroConta = scanner.nextInt();  // Captura o número da conta (int)
        scanner.nextLine();  // Corrige a quebra de linha após o nextInt()

        System.out.println("Por favor, digite o seu Nome!");
        nomeCliente = scanner.nextLine();  // Captura o nome do cliente (String)

        System.out.println("Por favor, digite o seu Saldo!");
        saldo = scanner.nextDouble();  // Captura o saldo (double)
        
        // Exibir a mensagem com as informações capturadas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
