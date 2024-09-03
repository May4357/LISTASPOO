package com.poo.listas.pooentrega1;

import java.util.Scanner;

public class Ex03 {

    public static void resolucao(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em reais: ");
        double reais = sc.nextDouble();

        System.out.println("O dolar está valendo R$ 5.25");

        double dolar = reais / 5.25;

        System.out.println("O valor em dolar é $" + dolar);

        sc.close();
    }
} 
