package com.poo.listas.lista2;
import java.util.Scanner;
public class Ex04 {
    public static void resolucao(){
        Scanner sc= new Scanner(System.in);

        System.out.println("Qual seu ano de nascimento : ");
        int anoNascimento= sc .nextInt();

        if (anoNascimento<=2006){
            System.out.println("BEM- VINDO");

        }
       

    



        if (anoNascimento==2008 || anoNascimento==2007){

            System.out.println("Você está acompanhado por um responnsável ?\n[1]SIM\n[2]NÃO");
            int acompanhamentoResponsavel=sc.nextInt();
            if (acompanhamentoResponsavel==1){

                System.out.println("BEM VINDO(A) !");
            }else{
                System.out.println("SINTO MUITO! SE VOCÊ TIVER 16 OU 17 ANOS , SÓ PODERÁ ENTRAR ACOMPANHADO DE UM RESPONSÁVEL !");


            }
        }
        


    }



}
