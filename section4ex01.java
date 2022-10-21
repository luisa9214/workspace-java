/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa*/

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args){

        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Digite outro número: ");
        int b= sc.nextInt();
        int soma = a + b;
        System.out.println("o resultado da soma é: " + soma);
        sc.close();
    }
}