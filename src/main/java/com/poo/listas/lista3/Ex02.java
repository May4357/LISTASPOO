package com.poo.listas.lista3;
import java.util.Scanner;

public class Ex02 {
    public static void resolucao(){

        Scanner sc=new Scanner(System.in);

        
        System.out.println("==========TABUADA==========");
        System.out.println("Digite o número para obter a sua tabuada : ");
        int n1=sc.nextInt();



        for (int i=0 ; i<=10 ; i++){
           
            System.out.println(n1+"  x  "+i+"  =  " +n1*i);
            System.out.println("---------------------------");
        }










    }



}
