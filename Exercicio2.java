import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.close();

        System.out.println();
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos");
        System.out.println("Daqui 10 anos, você terá " + (idade + 10) + " anos");
    }
}
