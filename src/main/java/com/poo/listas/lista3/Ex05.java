package com.poo.listas.lista3;
import java.util.Scanner;


public class Ex05 {
public static void resolucao(){
    Scanner sc = new Scanner(System.in);
    String login="Marina",senha="Mayumi";
    String verificaLogin,verificaSenha;
    int tentativa=3;

    
  

    //ACESSO LIBERADO
   
    do{
        tentativa--;
        
    System.out.println("LOGIN: ");
    verificaLogin=sc.nextLine();    
    System.out.println("SENHA: ");
    verificaSenha=sc.nextLine();



 if (verificaLogin.equals(login) && verificaSenha.equals(senha)&& tentativa>0){
        System.out.println("BEM VINDO AO SISTEMA! ");
    }
    

    //VERIFICA QUAL ESTÁ INCORRETO 

    if (!verificaSenha.equals(senha) && !verificaLogin.equals(login) && tentativa>0){
        System.out.println("LOGIN E SENHA INCORRETOS ! TENTE NOVAMENTE !VOCÊ POSSUI MAIS "+ tentativa+" TENTATIVAS");
    
        } else if(!verificaSenha.equals(senha)&& tentativa>0){
             System.out.println(" SENHA INCORRETA! "+tentativa+" TENTATIVAS");
        }else  if(!verificaLogin.equals(login) && tentativa>0){
            System.out.println(" LOGIN INCORRETO!"+tentativa+" TENTATIVAS");
            } 
    
    
     if (tentativa == 1){
        System.out.println("Última tentativa, mais um erro seu acesso será bloqueado!");
    }

    if(tentativa==0){
    System.out.println("Acesso Bloqueado !");
    }


    }while(!verificaLogin.equals(login) || !verificaSenha.equals(senha) && tentativa>0);

   
    

    }
           
        }
        




