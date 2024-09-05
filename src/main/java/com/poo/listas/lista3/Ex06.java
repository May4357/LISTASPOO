package com.poo.listas.lista3;
import java.util.Scanner;

public class Ex06 {
    public static void resolucao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================PIRÂMIDE=====================");
        System.out.print("Qual a altura da pirâmide? ");
        int altura = sc.nextInt();

        
        for (int i = 1; i <= altura; i++) {
            
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            // Imprime os asteriscos
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Pula para a próxima linha
            System.out.println();
        }

        sc.close();
    }
}