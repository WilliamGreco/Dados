package Prova_C;

import javax.swing.JOptionPane;

public class Exe_01 {

    public static void main(String args[]) {
        String nome;
        int vt, op;
        nome = JOptionPane.showInputDialog("Digite seu nome");
        vt = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da tabuada"));
        op = Integer.parseInt(JOptionPane.showInputDialog("Escolha o simbolo da operação\n1 - + (Adição)\n2 - "
                + "- (Subtração)\n3 - * (Multiplicação)\n4 - / (Divisão)\n0 - Sair"));
        pop(nome, op, vt);

    }

    public static void pop(String nome, int op, int n) {
        int r = 1;
        int x = 10;
        while (r == 1) {
            switch (op) {
                case 1:
                    for (int i = 0; i <= x; i++) {
                        //System.out.print("Sr(a) " + nome + "");
                        System.out.println(n + " + " + i + " = " + (n + i));
                    }
                    break;
                case 2:
                    for (int i = 0; i <= x; i++) {
                        //System.out.print("Sr(a) " + nome + "");
                        System.out.println(n + " - " + i + " = " + (n - i));
                    }
                    break;
                case 3:
                    for (int i = 0; i <= x; i++) {
                        //System.out.print("Sr(a) " + nome + "");
                        System.out.println(n + " * " + i + " = " + (n * i));
                    }
                    break;
                case 4:
                    for (float i = 0; i <= x; i++) {
                       // System.out.print("Sr(a) " + nome + "");
                        System.out.println(n + " / " + i + " = " + (n / i));
                    }
                    break;
                case 0:
                     System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite um numero entre 1 e 4");
            }

            r = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar?\n1 - Sim\n2 - Não"));
            if (r == 1) {
                r = 1;
                x = x + 10;
            } else {
                r = 0;
                break;
            }
        }
    }

}
