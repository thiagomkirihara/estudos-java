import java.util.Scanner;

public class Exercicio6 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
            System.out.println("---CALCULO DE DESCONTO---");

            System.out.println("Digite o preço do produto: ");
            double precoProduto = entrada.nextDouble();

            System.out.println("Digite a porcentagem do desconto: ");
            double desconto = entrada.nextDouble();

            entrada.close();

            double valorDesconto = (precoProduto/100) * desconto;
            double precoFinal = precoProduto - valorDesconto;

            System.out.printf("Desconto de %.2f por cento, aplicado no produto de R$ %.2f%n" , desconto , precoProduto);
            System.out.printf("O valor do desconto encima deste produto é de: %.2f%n" , valorDesconto);
            System.out.printf("O preço final do produto fica R$ %.2f%n" , precoFinal);


    }
    
}
