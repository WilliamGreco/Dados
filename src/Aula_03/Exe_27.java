package Aula_03;

import java.util.Scanner;

public class Exe_27 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double pc, alt, vlrIMC;

        System.out.printf("Informe o Peso Corporal em kg: ");
        pc = ler.nextDouble(); // 3.3 entrada de dados (lendo um valor real)

        System.out.printf("Informe a Altura em metros...: ");
        alt = ler.nextDouble(); // 3.3 entrada de dados (lendo um valor real)

        System.out.printf("\n========================================\n");
        vlrIMC = IMC(pc, alt);
        System.out.printf("IMC = %.2f (%s)\n", vlrIMC, interpretacaoIMC(vlrIMC));
        System.out.printf("========================================\n");
    }

    public static double IMC(double pc, double alt) {
        return (pc / (alt * alt));
    }

    public static String interpretacaoIMC(double vlrIMC) {
        if (vlrIMC < 20) {
            return ("Magro");
        } else if ((vlrIMC >= 20) && (vlrIMC <= 24)) {
            return ("Normal");
        } else if ((vlrIMC >= 25) && (vlrIMC <= 29)) {
            return ("Acima do peso");
        } else if ((vlrIMC >= 30) && (vlrIMC <= 34)) {
            return ("Obeso");
        } else // acima de 34
        {
            return ("Muito obeso");
        }
    }
}


    

