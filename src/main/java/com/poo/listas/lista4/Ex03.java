package com.poo.listas.lista4;

public class Ex03 {
    public static void resolucao(){


        double[] vendas ={10,55.60,85.30,72.25};
        double totalVendas=0;
        
            for (int i = 0; i < vendas.length ; i++) {
                
                totalVendas+=vendas[i]/vendas.length;

        }
        System.out.printf("A média de vendas é R$%.2f",totalVendas);
    }
    

        
    }

