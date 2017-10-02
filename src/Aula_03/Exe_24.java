package Aula_03;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe_24 {

    public static void main(String[] args) {

        System.out.println("24. O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha,\n "
                + "que já é um sucesso na sua loja de 1,99. Você foi contratado para desenvolver o programa que monta a tabela de preços de pães,\n "
                + "de 1 até 50 pães, a partir do preço do pão informado pelo usuário, conforme o exemplo abaixo:\n");

        Scanner ler = new Scanner(System.in);

        char op;
        do {
            System.out.println("Informe o valor do pão hoje...");
            float cont = ler.nextFloat();

            System.out.println("Panificadora Pão de Ontem - Preço do Pão: " + cont);

            while (cont <= 50) {

                for (int i = 1; i <= 50; i++) {

                    System.out.println(i + " - R$ " + cont);

                    cont++;
           
                }
            }
            System.out.println("Você deseja colocar outro valor? (S/N) :");
            op = ler.next().charAt(0);

        } while (op == 's' || op == 'S');

    }

}
