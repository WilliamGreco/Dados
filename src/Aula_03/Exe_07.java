package Aula_03;

public class Exe_07 {

    public static void main(String[] args) {

        System.out.println("7. Faça um programa que imprima na tela apenas os números ímpares entre\n"
                + "1 e 50.");

        int cont = 0;

        System.out.println("Nºs ímpares entre 1 e 50: ");
        while (cont >= 0 && cont <= 50) {
            if (cont % 2 != 0) {
                System.out.print(cont + " ");
            }

            cont++;
        }
    }

}
