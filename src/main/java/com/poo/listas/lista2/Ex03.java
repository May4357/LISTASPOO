package com.poo.listas.lista2;
import java.util.Scanner;
public class Ex03 {
    public static void resolucao(){

        Scanner sc = new Scanner(System.in);

        System.out.println(" BEM VINDO AO BANCO AZUL !  ");

        System.out.println("Qual a sua idade  ?");
        int idade=sc.nextInt();

        if (idade>=65){
            System.out.println("FILA PREFERENCIAL");
            return;
        }

        System.out.println("Possui algum tipo de deficiência ?\n[1]SIM  \n[2]NÃO");
        int pcd=sc.nextInt();
        
        if (pcd==1){

            System.out.println("FILA PREFERENCIAL");
            return;
        } else if (pcd==2) {

            System.out.println("Você está gravida ? \n[1]SIM  \n[2]NÃO");
            int gravida=sc.nextInt();
            
            if (gravida==1){

                System.out.println("FILA PREFERENCIAL");

            }
            else{
                System.out.println("FILA COMUM");
            }
        }
        }

    }


