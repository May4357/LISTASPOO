package com.poo.listas.lista3;
import java.util.Scanner;

public class Ex04 {

    public static void resolucao() {
        Scanner sc = new Scanner(System.in);

        // Primeiro usuário digita um número
        System.out.println(" ============ADIVINHANDO NÚMEROS========== ");
        System.out.println("Digite um número: ");
        int numSecreto = sc.nextInt();

        int tentativa =50000;
        int palpite = 0;
         

        while (tentativa > 0 && palpite != numSecreto) {
            System.out.println("Agora, tente adivinhar o número: ");
            palpite = sc.nextInt();
            int diferenca = Math.abs(numSecreto - palpite);

            if (palpite == numSecreto) {
                System.out.println("PARABÉNS, VOCÊ ACERTOU!");
                break;
            } 

            tentativa--;

            if (tentativa == 0) {
                System.out.println("Você perdeu! O número era " + numSecreto);
                break;
            }

            if (palpite < numSecreto) {
                System.out.println("Mais alto! Você tem " + tentativa + " tentativa(s) restantes.");
            } else {
                System.out.println("Mais baixo! Você tem " + tentativa + " tentativa(s) restantes.");
            }

            if (diferenca <= 4) {
                System.out.println("Está muito quente!");
            } else if (diferenca >= 10) {
                System.out.println("Está muito frio!");
            }
        }

        sc.close();
    }

}
