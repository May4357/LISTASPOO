package com.poo.listas.lista2;
import java.util.Scanner;
public class Ex07 {
public static void resolucao(){

Scanner sc=new Scanner(System.in);

System.out.println("O NÚMERO É DIVISÍVEL ? VAMOS VER ! ");

System.out.println(" DIGITE O PRIMEIRO NÚMERO :  ");
double n1=sc.nextDouble();

System.out.println(" DIGITE O SEGUNDO NÚMERO :  ");
double n2=sc.nextDouble();


if (n1%n2==0   || n2%n1==0){
     System.out.println(" Os números são divisíveis");
}else{
    System.out.println("Os números fornecidos não são divisíveis ");
}

    }
}
