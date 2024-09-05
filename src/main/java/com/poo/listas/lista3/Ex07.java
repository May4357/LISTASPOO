package com.poo.listas.lista3;
import java.util.Scanner;

public class Ex07 {
    public static void resolucao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================== RETÂNGULO =====================");
        System.out.print("Qual a altura do retângulo? ");
        int altura = sc.nextInt();
        System.out.print("Qual o comprimento do retângulo? ");
        int comprimento= sc.nextInt();
        

        
        for (int i = 1; i <= altura; i++) {

            for (int j = 0; j < comprimento; j++) {
                System.out.print("*");
            }
             System.out.println();
        }

        sc.close();
    }
}