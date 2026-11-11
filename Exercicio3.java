import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero decimal: ");
        double primeiro = entrada.nextDouble();

        System.out.println("Digite o segundo numero decimal: ");
        double segundo = entrada.nextDouble();

        System.out.println();
        System.out.println("SOMA: " + (primeiro + segundo));
        System.out.println("SUBTRAÇÃO: " + (primeiro - segundo));
        System.out.println("DIVISÃO: " + (primeiro / segundo));
        System.out.println("MULTIPLICAÇÃO: " + (primeiro * segundo));

        entrada.close();

    }
    
}
