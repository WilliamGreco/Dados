package Aula_03;

import java.util.Scanner;

public class Exe_11 {

    public static void main(String[] args) {
        
        System.out.println("11. Faça um programa que peça dois números, base e expoente, calcule e \n" +
"mostre o primeiro número elevado ao segundo número. Não utilize a função\n" +
"de potência da linguagem.");
        
        Scanner ler = new Scanner(System.in);
        int base = 0, exp = 0, res = 1;
        String resposta = "";
              
        System.out.print("\nDigite a base: ");
        base = ler.nextInt();
        
        System.out.print("\nDigite o expoente: ");
        exp = ler.nextInt();
        
        resposta = String.format("\n%s ^ %d = ", base, exp);
        
        while(exp > 0) {
            res = res * base;
            exp--;
        }

        System.out.println(resposta + res);
    }
    
}
