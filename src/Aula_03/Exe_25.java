package Aula_03;

import java.util.Scanner;

public class Exe_25 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float troco, dinheiro, total = 0;
        char op;

        System.out.println("\n 25. O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências.\n"
                + " Faça um programa que implemente uma caixa registradora rudimentar.\n "
                + "O programa deverá receber um número desconhecido de valores referentes aos preços das mercadorias.\n "
                + "Um valor zero deve ser informado pelo operador para indicar o final da compra.\n "
                + "O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu,\n "
                + "para então calcular e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto inicial,\n "
                + "para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:\n");

        do {

            System.out.println("**********Lojas Tabajara**********");
            System.out.println("Digite o comando 0 para finalizar a venda\n");
            
            System.out.println("Informe a quantidade de produtos que comprou: \n");
            int prd = ler.nextInt();

            float valor[] = new float[prd];

            for (int i = 0; i != valor.length; i++) {

                System.out.println("Informe o valor do " + (i + 1) + "° produto.\n");
                valor[i] = ler.nextFloat();

                total = total + valor[i];
                
            }
            System.out.println("Total dos produtos é R$ " + total);

            System.out.println("*************************************");

            System.out.println("Informe o valor recebido para pagamento.");
            dinheiro = ler.nextFloat();

            System.out.println("*************************************");

            troco = dinheiro - total;

            if (troco < total) {

                System.out.println("Faltou dinheiro, por favor pagar corretamente!");

            } else {
                System.out.println("Seu troco é de R$ " + troco);
                System.out.println("*************************************");
            }

            System.out.println("Deseja repetir os dados? (S/N) : \n");
            op = ler.next().charAt(0);

        } while (op == 's' || op == 'S');

    }

}
