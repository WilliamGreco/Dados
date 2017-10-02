package Aula_03;

public class Exe_02 {

    public static void main(String[] args) {
        
        System.out.println("2. Supondo que a população de um país A seja da ordem de 80000 habitantes\n" +
"com uma taxa anual de crescimento de 3% e que a população de B seja 200000\n" +
"habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule\n" +
"e escreva o número de anos necessários para que a população do país\n" +
"A ultrapasse ou iguale a população do país B, mantidas as taxas\n" +
"de crescimento.");
        
        
        double a = 80000, b = 200000;
        int ano = 0;
        
        while(a <= b) {
            a += a * 0.03;
            b += b * 0.015;
            
            ano++;
        }
        
        System.out.format("\nA ultrapassa ou iguala a B em %s anos", ano);
    }
    
}