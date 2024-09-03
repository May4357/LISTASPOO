package com.poo.listas.pooentrega2;
import java.util.Scanner;
public class Ex05 {
public static void resolucao(){
    Scanner sc = new Scanner(System.in);
    String login="Marina",senha="Mayumi";
    String verificaLogin,verificaSenha;
    
    System.out.println("LOGIN : ");
    verificaLogin=sc.nextLine();    
    System.out.println("SENHA: ");
    verificaSenha=sc.nextLine();

    //ACESSO LIBERADO
    if (verificaLogin.equals(login) && verificaSenha.equals(senha)){

        System.out.println("BEM VINDO AO SISTEMA! ");
        
    }  
    
    //VERIFICA QUAL ESTÁ INCORRETO 

    if (!verificaSenha.equals(senha) && !verificaLogin.equals(login)){
        System.out.println("LOGIN E SENHA INCORRETOS ! TENTE NOVAMENTE !");
        return;
    }
    if(!verificaLogin.equals(login)){
         System.out.println(" ACESSO NEGADO . LOGIN INCORRETO! ");
        }

    if(!verificaSenha.equals(senha)){
        System.out.println("ACESSO NEGADO. SENHA INCORRETA! ");
        }

   
           
        }
        

}




