package Prova_B;

import java.util.Scanner;

public class Exe_03 {

    public static void main(String[] args) {
        int cod;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o codigo do produto:");
        System.out.println("  1          Alimento não perecível");
        System.out.println("2 a 4        Alimento perecível");
        System.out.println("5 e 6        Vestuário");
        System.out.println("  7          Higiene pessoal");
        System.out.println("8 a 15       Limpeza e utensílios domésticos");

        cod = ler.nextInt();

        if (cod >= 1 && cod <= 15) {
            if (cod == 1) {
                System.out.println("Alimento não perecível.");
            }
            if (cod >= 2 && cod <= 4) {
                System.out.println("Alimento perecível.");
            }
            if (cod == 5 || cod == 6) {
                System.out.println("Vestuário.");
            }
            if (cod == 7) {
                System.out.println("Higiene pessoal.");
            }
            if (cod >= 8 && cod <= 15) {
                System.out.println("Limpeza e utensílios domésticos.");
            }
        } else {
            System.out.println("Código Inválido");
        }
    }
}
