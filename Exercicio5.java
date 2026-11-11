import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("--- CONVERSOR CELSIUS E FAHRENHEIT");

    System.out.println("Informe o graus em celsius: ");
    double celsius = entrada.nextDouble();
    entrada.close();

    double fahre = (celsius * 9 / 5 + 32);

    System.out.printf("A conversão de %.2fºC para Fahrenheit fica: %.2fºF" , celsius , fahre);


}
}
