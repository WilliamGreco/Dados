package Aula_03;

import java.util.Scanner;

public class Exe_21 {

    public static void main(String[] args) {

        System.out.println("21.	Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a\n "
                + "\nmédia de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, "
                + "\ndizer se a turma é jovem, adulta ou idosa, conforme a média calculada.");
        Scanner ler = new Scanner(System.in);
        char op = 's';
        int idade, somaIdades = 0, quantidade = 0;
        float media;
        while (op != 'n') {
            System.out.println("\nQual é a sua idade? ");
            idade = ler.nextInt();

            quantidade++;

            somaIdades = somaIdades + idade;

            System.out.println("Você deseja continuar? (S/N)? :");
            op = ler.next().charAt(0);
        }
        media = somaIdades / quantidade;
        System.out.println("A Soma das idades é : " + somaIdades);
        System.out.println("Quantidades das idades digitadas é : " + quantidade);
        System.out.println("A media é de : " + media);

        if ((media >= 0) && (media < 25)) {
            System.out.println("Turma de Jovens");
        } else if (media > 60) {
            System.out.println("Turma de Idosos");
        }

    }
}
