package Jogo_de_Boca;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class jogo_de_boca {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jogo, rodada, n, valor;

        System.out.println("=== Jogo de Boca ===");
        System.out.println("\nDigite o número objetivo do jogo: ");
        jogo = input.nextInt();
        valor = 0;

        while (valor < jogo) {
            for (rodada = 1; valor < jogo; rodada++) {
                if (rodada % 2 != 0) {
                    System.out.println("\n" + rodada + "ª Rodada");
                    System.out.println("Primeiro Jogador digite 1 ou 2: ");
                    n = input.nextInt();
                    while ((n != 1) && (n != 2)) {
                        System.out.println("Número inválido, tente novamente: ");
                        n = input.nextInt();
                    }
                    valor = valor + n;
                    System.out.println("A somatória chegou em: " + valor);

                } else {
                    System.out.println("\n" + rodada + "ª Rodada");
                    System.out.println("Segundo Jogador digite 1 ou 2: ");
                    n = input.nextInt();
                    while ((n != 1) && (n != 2)) {
                        System.out.println("Número inválido, tente novamente: ");
                        n = input.nextInt();
                    }
                    valor = valor + n;
                    System.out.println("A somatória chegou em: " + valor);
                }
                if ((valor == jogo) && (rodada % 2 != 0)) {
                    System.out.println("\nFim do Jogo!");
                    System.out.println("Primeiro jogador venceu, parabéns! ");
                } else if ((valor == jogo) && (rodada % 2 == 0)) {
                    System.out.println("\nFim do Jogo!");
                    System.out.println("Segundo jogador venceu, parabéns! ");

                }
            }
        }
    }
}
