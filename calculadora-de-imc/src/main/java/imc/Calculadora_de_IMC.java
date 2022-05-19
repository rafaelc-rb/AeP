package imc;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Calculadora_de_IMC {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\n=== Teste seu Índice de Massa Corporal ===\n");

        float massa, altura, imc;

        System.out.println("Digite sua massa (Kg): ");
        massa = input.nextFloat();

        System.out.println("Digite sua altura (m): ");
        altura = input.nextFloat();

        input.close();

        imc = massa / (altura * altura);
        System.out.println("\nSeu IMC é: " + imc);

        if (imc < 18.5F) {
            System.out.println("Você está abaixo do peso ideal");
        } else if (18.5F <= imc && imc <= 24.9F) {
            System.out.println("Você está com um peso ideal");
        } else if (25F <= imc && imc <= 29.9F) {
            System.out.println("Você está em pré-obesidade ou acima do peso ideal");
        } else if (30F <= imc && imc <= 34.9F) {
            System.out.println("Você está com obesidade de grau um");
        } else if (35F <= imc && imc <= 39.9F) {
            System.out.println("Você está com obesidade de grau dois");
        } else if (40F <= imc) {
            System.out.println("Você está com obesidade de grau três ou mórbida");
        }
    }
}
