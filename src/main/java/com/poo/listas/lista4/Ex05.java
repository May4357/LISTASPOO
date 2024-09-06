package com.poo.listas.lista4;
import java.util.ArrayList;
import java.util.Scanner;



public class Ex05 {
    public static void resolucao(){
        Scanner sc=new Scanner(System.in);

       ArrayList <String> lista= new ArrayList <String>();
        int resposta;
        

do { 

    //Menu do aplicativo
    System.out.println("=================MENU================");
    System.out.println("[1]INSERIR PRODUTO         [2]VER A LISTA DE PRODUTOS\n[3]DESLIGAR");
    resposta=sc.nextInt();
    sc.nextLine();


    switch (resposta){
        case 1: 
            System.out.print("Qual produto você quer adicionar ?");
            String produto=sc.nextLine();
            lista.add(produto);
            System.out.println("Item "+produto+" adicionado");
            break;
        case 2: 
            System.out.println(lista);
            break;
        case 3:
            System.out.println("DESLIGANDO...");
            break;
        
        default:
            System.out.println("Opção inválida! Tente novamente.");


    }
}
 while (resposta!=3);

    }

}
