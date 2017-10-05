package Prova_A;

import java.util.Scanner;

class Main {

    static Scanner ler = new Scanner(System.in);

    static int op() {

        Scanner ler = new Scanner(System.in);
        int op;

        System.out.println("*****Modo de Pagamento*****");
        System.out.println("1 - Á Vista");
        System.out.println("2 - 2 Vezes");
        System.out.println("3 - 3 Vezes");

        op = ler.nextInt();
        System.out.println("*******************************\n");
        return (op);
    }

    public static float aVista(float vlr) {
        System.out.println("Total R$: " + vlr);
        System.out.println("Total a pagar R$: " + vlr * 0.9);

        return (0);
    }

    public static float duasVezes(float vlr) {
        System.out.println("Total R$: " + vlr);
        System.out.println("Total a pagar em 2X R$: " + vlr / 2);

        return (0);
    }

    public static float tresVezes(float vlr) {

        int parcelas;

        System.out.println("Total R$: " + vlr);

        do {

            System.out.println("Informe a quantidade de parcelas :\n");
            parcelas = ler.nextInt();

        } while ((parcelas > 10) || (parcelas < 3));

        System.out.println("Parcelas de R$:\n " + parcelas + (vlr * 1.03) / parcelas);

        return (0);

    }

    public static void main(String[] args) {

        Scanner ler1 = new Scanner(System.in);
        char opp;

        do {

            float vlrCompra;
            int opcao;

            System.out.println("Informe o total da compra: \n");
            vlrCompra = ler1.nextFloat();

            System.out.println("***************************\n");

            int op = op();

            switch (op) {

                case 1:
                    System.out.println("Pagamento a vista: \n");
                    aVista(vlrCompra);
                    break;

                case 2:
                    System.out.println("Pagamento em 2 vezes: \n");
                    duasVezes(vlrCompra);
                    break;

                case 3:
                    System.out.println("Pagamento em 3X ou Mais: \n");
                    tresVezes(vlrCompra);
                    break;

                default:
                    System.out.println("Compra Cancelada!!!");

            }

            System.out.println("***************************\n");

            System.out.println("Você deseja voltar ao inicio (S/N)? : \n");
            opp = ler1.next().charAt(0);

        } while (opp == 's' || opp == 'S');

    }

}
