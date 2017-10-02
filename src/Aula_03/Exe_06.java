package Aula_03;

import java.util.Scanner;

public class Exe_06 {

    public static void main(String[] args) {

        System.out.println("6. Faça um programa que leia 5 números e informe a soma e a média dos\n"
                + "números.");

        Scanner ler = new Scanner(System.in);
        int contNum = 0, soma = 0, num;
        float media = 0f;

        while (contNum <= 4) {
            System.out.print("Digite o número " + (contNum + 1) + ": ");
            num = ler.nextInt();

            soma += num;
            contNum++;
        }

        media = soma / contNum;
        System.out.println("Soma dos números = " + soma);
        System.out.println("Média dos números = " + media);
    }

}
