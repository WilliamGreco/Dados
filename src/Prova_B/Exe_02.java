package Prova_B;

import java.util.Scanner;

public class Exe_02 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("*******************************************");
        System.out.println("Informe um numero para o programa analisar.");
        int num = ler.nextInt();
        System.out.println("*******************************************\n");

        if (num % 3 == 0) {
            System.out.println("Este numero é divisivel por 3.");
        }
        if (num % 4 == 0) {
            System.out.println("Este numero é divisivel por 4.");
        }
        if (num % 6 == 0) {
            System.out.println("Este numero é divisivel por 6.");
        }

    }
}
