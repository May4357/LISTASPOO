package com.poo.listas.pooentrega1;
import java.util.Scanner;

class Ex02 {

    public static void resolucao(){

    Scanner sc = new Scanner(System.in);

    System.out.println("Escreva Primeiro nome: ");
    String n1 = sc.nextLine();

    System.out.println("Escreva Segundo nome: ");
    String n2 = sc.nextLine();

    System.out.println("Olá, "+ n1  + " " + n2);

    sc.close();

    }
}