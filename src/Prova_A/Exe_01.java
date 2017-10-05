package Prova_A;

import java.util.Scanner;

public class Exe_01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int n;

        System.out.println("Informe o numero N (Natural)...");
        n = ler.nextInt();

        for (int i = n; i >= 0; i--) {

            System.out.println(i);

        }

    }

}
