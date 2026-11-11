import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("--CALCULO DE INDICE DE MASSA CORPORAL--");

        System.out.println("Informe seu peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Informe sua altura");
        double altura = entrada.nextDouble();  
        
        entrada.close();
         
        double imc = peso/(altura*altura);

        System.out.println("Seu peso: " + peso);
        System.out.println("Sua altura: " + altura);
        System.out.printf("Calculo para obter IMC: %.2f /(%.2f * %.2f) = %.2f%n" , peso , altura , altura , imc);
        System.out.printf("Seu indice de massa corporal é: %.2f%n" , imc);

    }
}   
