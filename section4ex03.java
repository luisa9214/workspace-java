/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */


import java.util.Scanner;

public class ex03 {

    public static void main(String[] args){
        System.out.println("Digite 4 valores:");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int diferenca = a * b - c * d;

        System.out.println("o resultado é= "+ diferenca);


    }
}