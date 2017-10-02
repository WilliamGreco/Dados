package Aula_03;

import java.util.Scanner;

public class Exe_01 {

    public static void main(String[] args) {
        

        System.out.println("1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem\n"
                + "caso o valor seja inválido e continue pedindo até que o usuário informe um\n"
                + "valor válido. ");

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma nota: ");
        float nota = ler.nextFloat();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
            System.out.print("Digite uma nota: ");
            nota = ler.nextFloat();
        }

    }

}
