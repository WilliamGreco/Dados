package Aula_03;

import java.util.Scanner;

public class Exe_05 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num[] = new int[5];

        int maior = 0, menor = 0;    

        for (int i = 0; i < num.length; i++) {

            System.out.println("Digite o " + (i + 1) + "° valor.");
            num[i] = ler.nextInt();
            if (num[i] < maior) {
                maior = num[i];
            }
        }
        for (int j = 0; j < num.length; j++) {

            if (num[j] < menor) {
                menor = num[j];
            }
        }
        System.out.println("Maior valor é: " + maior);
        System.out.println("Menor valor é: " + menor);

    }

}
