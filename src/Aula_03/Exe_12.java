package Aula_03;

import java.util.Scanner;

public class Exe_12 {

    public static void main(String[] args) {

        System.out.println("12. Faça um programa que peça 10 números inteiros, calcule e mostre a \n"
                + "quantidade de números pares e a quantidade de números impares.");

        Scanner ler = new Scanner(System.in);

        int contNum = 0, num, par = 0, impar = 0;

        while (contNum < 10) {
            System.out.print("Digite um nº: ");
            num = ler.nextInt();

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            contNum++;
        }

        System.out.println("Qtd de pares: " + par);
        System.out.println("Qtd de ímpares: " + impar);
    }

}
