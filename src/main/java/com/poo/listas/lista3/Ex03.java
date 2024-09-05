package com.poo.listas.lista3;
import java.util.Scanner;

public class Ex03 {
    public static void resolucao(){

        Scanner sc= new Scanner(System.in);

        System.out.println("=======IDENTIFICADOR DE NÚMEROS PARES=======");

        System.out.println("Digite o primeiro número : ");
        int n1=sc.nextInt();

        System.out.println("Digite o segundo número : ");
        int n2=sc.nextInt();

            
        System.out.println("Os números pares entre "+ n1 + " e " + n2);


        if(n1>n2){

                for (int i=n1 ;i<=n2;i++){
                   
                    if (i%2==0){
                
                    System.out.println(i);
                }
                }

            
            }else{
                System.out.println("Tente novamente. Os caracteres fornecidos são inválidos");

            }
        }
    }
    


        

    

