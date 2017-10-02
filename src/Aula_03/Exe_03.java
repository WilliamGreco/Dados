package Aula_03;

import java.util.Scanner;

public class Exe_03 {

    public static void main(String[] args) {
        
        System.out.println("3. Altere o programa anterior permitindo ao usuário informar as populações \n" +
"e as taxas de crescimento iniciais. Valide a entrada e permita repetir a \n" +
"operação.");
        
        Scanner ler = new Scanner(System.in);
        double popA, popB, taxaA, taxaB;
        int ano = 0;
        
        System.out.print("\nDigite a população A: ");
        popA = ler.nextDouble();
        
        System.out.print("\nDigite a taxa A: ");
        taxaA = ler.nextDouble();
        
        System.out.print("\nDigite a população B: ");
        popB = ler.nextDouble();
        
        System.out.print("\nDigite a taxa B: ");
        taxaB = ler.nextDouble();
        
        while(popA <= popB) {
            popA += popA * taxaA;
            popB += popB * taxaB;
            
            ano++;
        }
        
        System.out.format("\nA ultrapassa ou iguala a B em %s anos", ano);
    }
    
}

