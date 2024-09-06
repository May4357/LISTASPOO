package com.poo.listas.lista4;
import java.util.Scanner;

public class Ex01 {
    public static void resolucao(){

Scanner sc=new Scanner(System.in);



double[] vendas ={10,55.60,85.30,72.25};
double totalVendas=0;

    for (int i = 0; i < vendas.length ; i++) {
        
        totalVendas+=vendas[i];
}

System.out.printf("O total de vendas é R$%.2f",totalVendas);
    }

}
