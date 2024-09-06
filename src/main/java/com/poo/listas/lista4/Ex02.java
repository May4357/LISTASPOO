package com.poo.listas.lista4;
import java.util.Scanner;

public class Ex02 {
    public static void resolucao(){

        Scanner sc = new Scanner(System.in);

        double[] vendas = {10, 55.60, 85.30, 72.25};
        double valorMaior = vendas[0];
        double valorMenor = vendas[0];

        
        for (int i = 1; i < vendas.length; i++) {

            if (vendas[i] < valorMenor) {
                valorMenor = vendas[i];
            }

            if (vendas[i] > valorMaior) {
                valorMaior = vendas[i];
            }
        }

        System.out.println("O menor valor é: R$ " + valorMenor);
        System.out.println("O maior valor é: R$ " + valorMaior);
    }
}