package com.poo.listas.pooentrega1;


import java.util.Scanner;

public class Ex06 {
    public static void resolucao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância em km: ");
        double distancia = sc.nextDouble();

        System.out.println("Digite o total gasto de combustível em litros: ");
        double gasto = sc.nextDouble();

        System.out.println("O consumo médio do veículo em km/l foi de: "+(distancia/gasto));
        
        sc.close();
    }
    
}