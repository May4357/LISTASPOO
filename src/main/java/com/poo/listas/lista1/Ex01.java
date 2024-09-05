package com.poo.listas.lista1;
import java.util.Scanner;

public class Ex01 {

    public static void resolucao(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 2 numeros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();


        int soma = x + y;

        System.out.println("A soma é: "+ soma);
        sc.close();
    }
}