package com.poo.listas.lista2;
import java.util.Scanner;

public class Ex06 {
    public static void resolucao(){
    Scanner sc = new Scanner(System.in);


    int notaRecupera;


    System.out.println("Primeira nota :");
    int nota1 = sc.nextInt();

    System.out.println("Segunda nota:");
    int nota2=sc.nextInt();


        //APROVADO
    if((nota1+nota2)/2 >=6){
        System.out.println("PARABÉNS !VOCÊ FOI APROVADO ! ");
        return;    
    } 
    
    
        //RECUPERAÇÃO
    System.out.println(" NOTA DE RECUPERAÇÃO : ");
        notaRecupera=sc.nextInt();

            //SUBSTITUI NOTAS
            if (nota1>nota2){
             nota1=notaRecupera;
            }else{
             nota2=notaRecupera;}

             if((nota1+nota2)/2 >=6){
                System.out.println(" APROVADO ! PARABÉNS ! ");
             
            }else{

                System.out.println(" REPROVADO! ESTUDE MAIS  ! ");

            }
                
               
    
                 }
                }

            
           
                
             

        




