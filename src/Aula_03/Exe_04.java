package Aula_03;

public class Exe_04 {

    public static void main(String[] args) {
        
        System.out.println("4. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do\n" +
"outro. Depois modifique o programa para que ele mostre os números um ao lado\n" +
"do outro.");
        
        int num = 1;
        
        while(num <= 20) {
            //Mostra um abaixo do outro
            System.out.print(num + "\r\n");
            num += 1;
        }        
        
        num = 1;
        while(num <= 20) {
            //Mostra um do lado do outro
            System.out.print(num + " ");
            num += 1;
        }
        
    }
    
}

