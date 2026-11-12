import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- CALCULO DESCONTO (IF, ELSE)---");

        System.out.println("Digite o valor do produto: ");
        double precoProduto = entrada.nextDouble();

        if (precoProduto <= 0) {
            System.out.println("não é possível aplicar desconto nesse valor.");
        } else {

            System.out.println("Digite a porcentagem do desconto: ");
            double desconto = entrada.nextDouble();

            if (desconto < 0 || desconto > 100) {
                System.out.println("Não é possível aplicar esse desconto.");
            } else {

                double valorDesconto = (precoProduto / 100) * desconto;
                double precoFinal = precoProduto - valorDesconto;

                System.out.printf("Desconto de %.2f por cento que será aplicado no produto: R$ %.2f%n", desconto,valorDesconto);
                System.out.printf("Valor final do produto: R$ %.2f%n", precoFinal);
            }
        }
        entrada.close();
    }
}