package com.poo.listas.lista4;
import java.util.ArrayList;
import java.util.Scanner;


public class Ex06 {
    public static void resolucao(){
        Scanner sc=new Scanner(System.in);

       ArrayList <String> lista= new ArrayList <String>();
        int resposta;
        

do { 

    //Menu do aplicativo
    System.out.println("=================MENU================");
    System.out.println("[1]INSERIR PRODUTO         [2]REMOVER PRODUTO DA LISTA \n[3]EXIBE LISTA             [4]DESLIGAR");
    resposta=sc.nextInt();
    sc.nextLine();


    switch (resposta){
        case 1:  //adicionar produto
            System.out.print("Qual produto quer adicionar ? : ");
            String produto=sc.nextLine();
            lista.add(produto);
            System.out.println("Item "+produto+" adicionado");
            break;
        case 2: //remover produto
            System.out.println("Qual produto quer remover ?: ");
            produto=sc.nextLine();
            lista.remove(produto);
            System.out.println("Item "+produto+" removido");
            break;
        case 3: //exibe lista
            if (lista.isEmpty()){
                System.out.println("A lista de produtos está vazia");

            }else{

                System.out.println();
            }
            break;
        case 4:
         break;
        default:
            System.out.println("Opção inválida! Tente novamente.");


    }
}
 while (resposta!=4);

    }

}
