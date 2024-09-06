package com.poo.listas.lista4;
import java.util.Scanner;
import java.util.ArrayList;
public class Ex07 {
    public static void resolucao(){
        Scanner sc=new Scanner(System.in);

        ArrayList <String> lista= new ArrayList <String>();
        ArrayList <Double> precos= new ArrayList <Double>();
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

             System.out.println("Qual é o preço do produto ? :");
             Double valor=sc.nextDouble();
             precos.add(valor);
             sc.nextLine();

             System.out.printf("Item %s de R$%.2f adicionado%n", produto, valor);
        break;



         case 2: //remover produto
             System.out.println("Qual produto quer remover ?: ");
             produto=sc.nextLine();
             int index=lista.indexOf(produto);
                if (index !=-1){
                    lista.remove(index);
                    precos.remove(index);
                    System.out.println("Item"+produto+"removido");
                     } else{

                            System.out.println(" Produto não foi encontrado.");
                     } break;



         case 3: //exibe lista
             if (lista.isEmpty()){

                    System.out.println("A lista está vazia");
             }else{
                System.out.println(lista);

                for( int i=0; i<lista.size();i++){
                    System.out.printf("Produto: %s | Preço: R$%.2f%n", lista.get(i), precos.get(i));

                }
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
 


