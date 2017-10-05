package Prova_B;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exe_01 {

    public static void main(String[] args) {

        Calendar cal = GregorianCalendar.getInstance();
        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
        int mesAtual = cal.get(Calendar.MONTH) + 1;
        int anoAtual = cal.get(Calendar.YEAR);

        Scanner ler = new Scanner(System.in);
        System.out.println("Dia em que você nasceu: ");
        int diaNasc = ler.nextInt();
        if ((diaNasc <= 0) && (diaNasc > 31)) {
            System.out.println("Dia Invalido");
        } else {
            System.out.println("Mes em que você nasceu: ");
            int mesNasc = ler.nextInt();
            if ((mesNasc <= 0) && (mesNasc > 12)) {
                System.out.println("Mes invalido");
            } else {
                System.out.println("Ano em que você nasceu: ");
                int anoNasc = ler.nextInt();
                if ((anoNasc <= 0) && (anoNasc > anoAtual)) {
                    System.out.println("Ano Invalido");
                } else {
                    int Nasc = anoNasc * 365;
                    Nasc = Nasc + (mesNasc * 31);
                    Nasc = Nasc + diaNasc;
                    int Atual = anoAtual * 365;
                    Atual = Atual + (mesAtual * 31);
                    Atual = Atual + diaAtual;
                    int Semana = ((Atual - Nasc) / 31) / 7;

                    System.out.println("Você tem " + (Atual - Nasc) + " dias ou " + ((Atual - Nasc) / 31)
                            + " semandas ou " + Semana + " meses ou " + ((Atual - Nasc) / 365) + " anos.");
                }
            }
        }
    }
}
