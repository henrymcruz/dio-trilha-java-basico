import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // try para tratar exceções
        try{
        //criando um objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho "+ idade + " Anos ");
        System.out.println("Minha altura é " + altura + " CM ");
        scanner.close();
        }
        //catch para mostrar o erro gerado caso não seja inserido um inteiro nas variaveis idade e altura
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisão ser numericos");
        }
    }
}
