package Aula_04;

import java.util.Scanner;

public class Exe_01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("login: \n ");
        String login = in.nextLine();

        System.out.println("senha: \n ");
        String senha = in.nextLine();

        if (login.equals("wgreco") && senha.equals("lojA1373")) {
            System.out.printf("Usuário %s logado com sucesso.", login);
        } else {
            System.out.println("Login ou senha inválidos!");
        }
    }
}
    

