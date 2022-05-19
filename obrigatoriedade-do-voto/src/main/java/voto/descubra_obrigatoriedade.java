package voto;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class descubra_obrigatoriedade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, alfa;
        System.out.println("\n\n=== Descubra a obrigatoriedade do seu voto! ===");
        System.out.println("\nVocê possui alfabetização ?\n Digite 0 para não ou digite 1 para sim: ");
        alfa = input.nextInt();

        if (alfa == 0) {
            System.out.println("\nSeu voto é Facultativo!");
        } else {
            System.out.println("\nDigite sua idade: ");
            idade = input.nextInt();

            if (idade < 16) {
                System.out.println("\nVocê ainda não possui idade para votar!");
            } else if (16 <= idade && idade < 18 || 70 < idade) {
                System.out.println("\nSeu voto é Facultativo!");
            } else if (18 <= idade && idade <= 70) {
                System.out.println("\nSeu voto é Obrigatório!");
            }
        }
        input.close();
    }
}
