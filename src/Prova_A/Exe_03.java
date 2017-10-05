package Prova_A;

import java.util.Scanner;

public class Exe_03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int n, qtdH = 0, qtdM = 0;
        float altura, somaAltura = 0, somaAlturaM = 0, maior = 0;
        char sexo;

        System.out.println("Informe a quantidade de pessoas...");
        n = ler.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Informe a Altura");
            altura = ler.nextFloat();

            System.out.println("Informe o sexo");
            sexo = ler.next().charAt(0);

            somaAltura += altura;

            if (i == 1) {
                maior = altura;
            } else if (maior < altura) {
                maior = altura;
            }
            if (sexo == 'M' || sexo == 'm') {
                qtdH++;
            } else {
                qtdM++;
                somaAlturaM += altura;
            }
            /*if (sexo == 'F' || sexo == 'f') {
                qtdM++;
            } else {
                qtdH++;
                somaAltura += altura;
            }*/

        }

        System.out.println("Altura média das N pessoas: " + somaAltura);
        System.out.println("Maior altura encontrada: " + maior);
        System.out.println("Altura média das mulheres: " + somaAlturaM / qtdM);
        System.out.println("Altura média dos Homens: " + somaAltura / qtdH);
        System.out.println("Quantidade de Homens: " + qtdH);

    }

}
