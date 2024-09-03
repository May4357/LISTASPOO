package com.poo.listas.pooentrega2;
import java.util.Scanner;

public class Ex02 {
    public static void resolucao(){
    Scanner sc=new Scanner(System.in);

    System.out.println("Digite um número : ");
    int n1=sc.nextInt();

    System.out.println("Digite o segundo número : ");
    int n2=sc.nextInt();

    if (n1>n2){

        System.out.println("O "+n1+" é maior que o "+n2);
    
    }
    if (n2>n1){

        System.out.println("O "+n2+" é maior que o "+n1);

    }
    if (n1==n2){

        System.out.println("O número "+n1 +" é igual ao "+ n2);

    }


    }

}
