package com.poo.listas.lista2;
import java.util.Scanner;
public class Ex08 {
    public static void resolucao() {
        Scanner sc= new Scanner(System.in);
        int contadorErros=0,pontuacaojogador=0;



        if (contadorErros==3){ //CONTADOR COM 3 ERROS
            System.out.println( "JÁ ERA!");
            return;
        }


        //PRIMEIRA PERGUNTA:
        System.out.println("Qual é a capital do Brasil ? \n[1]RIO DE JANEIRO\n[2]SÃO PAULO\n[3]BRASÍLIA\n[4]RIO GRANDE DO SUL");
        System.out.println(">>>>>>>>>   ");
        int resposta1= sc.nextInt();

        if (resposta1==3){
            pontuacaojogador++;
            System.out.println(" PARABÉNS ! VOCÊ ACERTOU ! VOCÊ TEM "+pontuacaojogador+"PONTO(S)");
        }else{
            contadorErros++;
            System.out.println("VOCÊ ERROU ! PERDEU "+contadorErros+" VIDAS");
        }

        if (contadorErros==3){ //CONTADOR COM 3 ERROS
            System.out.println( "JÁ ERA!");
            return;
        }


        //SEGUNDA PERGUNTA:
        System.out.println("Qual é a camada mais externa da Terra? \n[1]NÚCLEO\n[2]MANTO\n[3]ATMOSFERA\n[4]CROSTA");
        System.out.println(">>>>>>>>>   ");
        int resposta2 = sc.nextInt();

        if (resposta2==3){
            pontuacaojogador++;
            System.out.println(" PARABÉNS ! VOCÊ ACERTOU ! VOCÊ TEM "+pontuacaojogador+"PONTO(S)");
        }else{
            contadorErros++;
            System.out.println("VOCÊ ERROU ! PERDEU "+contadorErros+" VIDAS");
        }
        if (contadorErros==3){ //CONTADOR COM 3 ERROS
            System.out.println( "JÁ ERA!");
            return;
        }


        //TERCEIRA PERGUNTA:
        System.out.println("Qual é o maior planeta do sistema solar?  \n[1]MARTE\n[2]JÚPITER\n[3]TERRA\n[4]VÊNUS");
        System.out.println(">>>>>>>>>   ");
        int resposta3 = sc.nextInt();
        if (resposta3==2){
            pontuacaojogador++;
            System.out.println(" PARABÉNS ! VOCÊ ACERTOU ! VOCÊ TEM "+pontuacaojogador+"PONTO(S)");
        }else{
            contadorErros++;
            System.out.println("VOCÊ ERROU ! PERDEU "+contadorErros+" VIDAS");
        }
        if (contadorErros==3){ //CONTADOR COM 3 ERROS
            System.out.println( "JÁ ERA!");
            return;
        }

        

        //QUARTA PERGUNTA:
         System.out.println("Qual planeta é conhecido como o Planeta Vermelho?  \n[1]MARTE\n[2]JÚPITER\n[3]TERRA\n[4]VÊNUS");
        System.out.println(">>>>>>>>>   ");
        int resposta4 = sc.nextInt();
        if (resposta4==1){
            pontuacaojogador++;
            System.out.println(" PARABÉNS ! VOCÊ ACERTOU ! VOCÊ TEM "+pontuacaojogador+"PONTO(S)");
        }else{
            contadorErros++;
            System.out.println("VOCÊ ERROU ! PERDEU "+contadorErros+" VIDAS");
        }

        if (contadorErros==3){ //CONTADOR COM 3 ERROS
            System.out.println( "JÁ ERA!");
            return;
        }




         //QUINTA PERGUNTA:
         System.out.println("Qual planeta possui o maior número de luas?  \n[1]MARTE\n[2]JÚPITER\n[3]TERRA\n[4]VÊNUS");
         System.out.println(">>>>>>>>>   ");
         int resposta5 = sc.nextInt();
         if (resposta5==2){
             pontuacaojogador++;
             System.out.println(" PARABÉNS ! VOCÊ ACERTOU ! VOCÊ TEM "+pontuacaojogador+"PONTO(S)");
         }else{
             contadorErros++;
             System.out.println("VOCÊ ERROU ! PERDEU "+contadorErros+" VIDAS");
            }
            if (contadorErros==3){ //CONTADOR COM 3 ERROS
                System.out.println( "JÁ ERA!");
            }
    




       

    


    }

}

