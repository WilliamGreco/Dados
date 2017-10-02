package Aula_03;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe_23 {
    
    public static void main(String[] args) {
        
        System.out.println("\n 23. O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99, com cerca de 10 caixas.\n "
                + "Para agilizar o cálculo de quanto cada cliente deve pagar ele desenvolveu uma tabela que contém o número de itens\n "
                + "que o cliente comprou e ao lado o valor da conta. Desta forma a atendente do caixa precisa apenas contar\n "
                + "quantos itens o cliente está levando e olhar na tabela de preços. Você foi contratado para desenvolver o\n "
                + "programa que monta esta tabela de preços, que conterá os preços de 1 até 50 produtos, conforme o exemplo abaixo:\n");
        
        Scanner ler = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("##.##");
        
        df.setRoundingMode(RoundingMode.DOWN);
        
        float cont = (float) 1.99;
        
        while (cont <= 50) {
            
            for (int i = 1; i <= 50; i++) {
                
                System.out.println(i + " - R$ " + df.format(cont));
                
                cont++;
                
                cont++;
                
            }
            
        }
        
    }
    
}
