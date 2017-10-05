package Prova_C;

import java.util.Scanner;

public class Exe_03 {

    public static void main(String[] args) {

        float litros, vlrSem, gasolina = (float) 2.50, desconto;
        float vlr, vlrCom = 0, alcool = (float) 1.34;
        int opp;
        char op;

        do {

            Scanner ler = new Scanner(System.in);

            System.out.println("******************************");
            System.out.println("Escolha seu combustivel : \n"
                    + "1 - Gasolina\n"
                    + "2 - Alcool\n"
                    + "3 - Sair");

            System.out.println("******************************\n");

            opp = ler.nextInt();

            System.out.println("******************************");
            System.out.println("Informe a quantidade de litros : \n");
            litros = ler.nextFloat();

            switch (opp) {

                case 1:

                    if (litros <= 20) {

                        vlrSem = gasolina * litros;
                        desconto = (float) (litros * 0.04);
                        vlrCom = vlrSem - desconto;

                    } else if (litros > 20) {

                        vlrSem = gasolina * litros;
                        desconto = (float) (litros * 0.06);
                        vlrCom = vlrSem - desconto;

                    }

                    break;

                case 2:

                    if (litros <= 20) {

                        vlrSem = alcool * litros;
                        desconto = (float) (litros * 0.03);
                        vlrCom = vlrSem - desconto;

                    } else if (litros > 20) {

                        vlrSem = alcool * litros;
                        desconto = (float) (litros * 0.05);
                        vlrCom = vlrSem - desconto;

                    }
                    
                    
            }
                    System.out.println("O valor a ser pago é de R$ " + vlrCom);

                    System.out.println("**************************************");
                    System.out.println("**************************************");
            
            System.out.println("Deseja repetir a consulta (S/N)? :");
            op = ler.next().charAt(0);

        } while (op == 's' || op
                == 'S');
    }

}
