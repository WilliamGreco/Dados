package Prova_C;

import java.util.Scanner;

public class Exe_02 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        char op;

        do {
            System.out.println("****************************************");
            System.out.println("Informe qual turno você estuda ? :\n"
                    + "1 - M (Matutino)\n"
                    + "2 - V (Vespertino)\n"
                    + "3 - N (Noturno)");
            System.out.println("****************************************\n");

            int num = ler.nextInt();

            switch (num) {

                case 1:
                    System.out.println("***************");
                    System.out.println("Bom dia!!!!");
                    System.out.println("***************");
                    break;
                case 2:
                    System.out.println("***************");
                    System.out.println("Boa Tarde!!!");
                    System.out.println("***************");
                    break;
                case 3:
                    System.out.println("***************");
                    System.out.println("Boa Noite!!!");
                    System.out.println("***************");
                    break;
                default:
                    System.out.println("***************");
                    System.out.println("Opção Invalida!!!");
                    System.out.println("***************");
            }

            System.out.println("Deseja repetir a consulta (S/N)? :");
            op = ler.next().charAt(0);

        } while (op == 's' || op == 'S');

    }

}
